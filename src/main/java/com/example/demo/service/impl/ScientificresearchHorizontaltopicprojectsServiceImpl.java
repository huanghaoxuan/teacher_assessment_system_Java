package com.example.demo.service.impl;

import com.example.demo.mapper.ScientificresearchHorizontaltopicprojectsMapper;
import com.example.demo.model.ScientificresearchHorizontaltopicprojects;
import com.example.demo.model.Userinformation;
import com.example.demo.service.ScientificresearchHorizontaltopicprojectsService;
import com.example.demo.service.ScoreHorizontaltopicprojectsService;
import com.example.demo.service.UserinformationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/29 9:42
 * @Version 1.0
 */

@Service
public class ScientificresearchHorizontaltopicprojectsServiceImpl implements ScientificresearchHorizontaltopicprojectsService {

    @Autowired
    private ScientificresearchHorizontaltopicprojectsMapper scientificresearchHorizontaltopicprojectsMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Autowired
    private ScoreHorizontaltopicprojectsService scoreHorizontaltopicprojectsService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return scientificresearchHorizontaltopicprojectsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ScientificresearchHorizontaltopicprojects record) {
        return scientificresearchHorizontaltopicprojectsMapper.insert(record);
    }

    @Override
    public PageInfo<ScientificresearchHorizontaltopicprojects> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<ScientificresearchHorizontaltopicprojects> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = scientificresearchHorizontaltopicprojectsMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = scientificresearchHorizontaltopicprojectsMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            ScientificresearchHorizontaltopicprojects scientificresearchHorizontaltopicprojects = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(scientificresearchHorizontaltopicprojects.getClassTeacher());
            scientificresearchHorizontaltopicprojects.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<ScientificresearchHorizontaltopicprojects> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<ScientificresearchHorizontaltopicprojects> selectByClassTeacher(ScientificresearchHorizontaltopicprojects teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<ScientificresearchHorizontaltopicprojects> teachings = scientificresearchHorizontaltopicprojectsMapper.selectByClassTeacher(teaching);
        PageInfo<ScientificresearchHorizontaltopicprojects> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(ScientificresearchHorizontaltopicprojects record) {
        return scientificresearchHorizontaltopicprojectsMapper.updateByPrimaryKey(record);
    }

    @Override
    public BigDecimal getScore(BigDecimal money) {
        if (money.compareTo(BigDecimal.valueOf(1)) == -1) {
            return scoreHorizontaltopicprojectsService.selectByPrimaryKey(1).getOneMillion();
        } else if (money.compareTo(BigDecimal.valueOf(3)) == -1) {
            return scoreHorizontaltopicprojectsService.selectByPrimaryKey(1).getOneToThreeMillion();
        } else if (money.compareTo(BigDecimal.valueOf(5)) == -1) {
            return scoreHorizontaltopicprojectsService.selectByPrimaryKey(1).getThreeToFiveMillion();
        } else if (money.compareTo(BigDecimal.valueOf(10)) == -1) {
            return scoreHorizontaltopicprojectsService.selectByPrimaryKey(1).getFiveToTenMillion();
        } else if (money.compareTo(BigDecimal.valueOf(20)) == -1) {
            return scoreHorizontaltopicprojectsService.selectByPrimaryKey(1).getTenToTwentyMillion();
        } else if (money.compareTo(BigDecimal.valueOf(30)) == -1) {
            return scoreHorizontaltopicprojectsService.selectByPrimaryKey(1).getTwentyToThirtyMillion();
        }
        return BigDecimal.valueOf(0);
    }
}
