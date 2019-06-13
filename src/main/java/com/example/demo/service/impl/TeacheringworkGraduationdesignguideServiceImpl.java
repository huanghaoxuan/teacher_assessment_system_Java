package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkGraduationdesignguideMapper;
import com.example.demo.model.TeacheringworkGraduationdesignguide;
import com.example.demo.model.Userinformation;
import com.example.demo.service.ScoreGuidecontestService;
import com.example.demo.service.TeacheringworkGraduationdesignguideService;
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
public class TeacheringworkGraduationdesignguideServiceImpl implements TeacheringworkGraduationdesignguideService {

    @Autowired
    private TeacheringworkGraduationdesignguideMapper teacheringworkGraduationdesignguideMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Autowired
    private ScoreGuidecontestService scoreGuidecontestService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkGraduationdesignguideMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkGraduationdesignguide record) {
        return teacheringworkGraduationdesignguideMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkGraduationdesignguide> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkGraduationdesignguide> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = teacheringworkGraduationdesignguideMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = teacheringworkGraduationdesignguideMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            TeacheringworkGraduationdesignguide teacheringworkGraduationdesignguide = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(teacheringworkGraduationdesignguide.getClassTeacher());
            teacheringworkGraduationdesignguide.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<TeacheringworkGraduationdesignguide> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkGraduationdesignguide> selectByClassTeacher(TeacheringworkGraduationdesignguide teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeacheringworkGraduationdesignguide> teachings = teacheringworkGraduationdesignguideMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkGraduationdesignguide> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkGraduationdesignguide record) {
        return teacheringworkGraduationdesignguideMapper.updateByPrimaryKey(record);
    }

    @Override
    public BigDecimal getScore(String level, Integer winnersNumber) {
        BigDecimal bwinnersNumber = BigDecimal.valueOf(winnersNumber);
        if (level.equals("省级一等奖") || level.equals("省级团队一等奖")) {
            return scoreGuidecontestService.selectByPrimaryKey(1).getProvincialFirstDigit().divide(bwinnersNumber, 3);
        } else if (level.equals("省级二等奖") || level.equals("省级团队二等奖")) {
            return scoreGuidecontestService.selectByPrimaryKey(1).getProvincialSecondDigit().divide(bwinnersNumber, 3);
        } else if (level.equals("省级三等奖") || level.equals("省级团队三等奖")) {
            return scoreGuidecontestService.selectByPrimaryKey(1).getProvincialThirdDigit().divide(bwinnersNumber, 3);
        } else if (level.equals("院级优秀奖")) {
            return scoreGuidecontestService.selectByPrimaryKey(1).getSchoolSecondDigit().divide(bwinnersNumber, 3);
        }
        return BigDecimal.valueOf(0);
    }
}
