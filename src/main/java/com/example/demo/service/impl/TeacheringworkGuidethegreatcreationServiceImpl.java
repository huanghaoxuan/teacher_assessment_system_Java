package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkGuidethegreatcreationMapper;
import com.example.demo.model.TeacheringworkGuidethegreatcreation;
import com.example.demo.model.Userinformation;
import com.example.demo.service.ScoreGuidecontestService;
import com.example.demo.service.TeacheringworkGuidethegreatcreationService;
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
public class TeacheringworkGuidethegreatcreationServiceImpl implements TeacheringworkGuidethegreatcreationService {

    @Autowired
    private TeacheringworkGuidethegreatcreationMapper teacheringworkGuidethegreatcreationMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Autowired
    private ScoreGuidecontestService scoreGuidecontestService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkGuidethegreatcreationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkGuidethegreatcreation record) {
        return teacheringworkGuidethegreatcreationMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkGuidethegreatcreation> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkGuidethegreatcreation> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = teacheringworkGuidethegreatcreationMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = teacheringworkGuidethegreatcreationMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            TeacheringworkGuidethegreatcreation teacheringworkGuidethegreatcreation = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(teacheringworkGuidethegreatcreation.getClassTeacher());
            teacheringworkGuidethegreatcreation.setClassTeacherName(userinformationService.selectUserinformation(userinformation).getName());
        }
        PageInfo<TeacheringworkGuidethegreatcreation> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkGuidethegreatcreation> selectByClassTeacher(TeacheringworkGuidethegreatcreation teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeacheringworkGuidethegreatcreation> teachings = teacheringworkGuidethegreatcreationMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkGuidethegreatcreation> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkGuidethegreatcreation record) {
        return teacheringworkGuidethegreatcreationMapper.updateByPrimaryKey(record);
    }

    @Override
    public BigDecimal getScore(String level, String titleLevel, Integer mentorsNumber) {
        BigDecimal bmentorsNumber = BigDecimal.valueOf(mentorsNumber);
        if (titleLevel.equals("优秀") && level.equals("省级")) {
            return scoreGuidecontestService.selectByPrimaryKey(1).getProvincialSecondDigit().divide(bmentorsNumber, 3);
        } else if (titleLevel.equals("优秀") && level.equals("院级")) {
            return scoreGuidecontestService.selectByPrimaryKey(1).getSchoolSecondDigit().divide(bmentorsNumber, 3);
        }
        return BigDecimal.valueOf(0);
    }
}
