package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkGuidecontestMapper;
import com.example.demo.model.ScoreGuidecontest;
import com.example.demo.model.TeacheringworkGuidecontest;
import com.example.demo.model.Userinformation;
import com.example.demo.service.ScoreGuidecontestService;
import com.example.demo.service.TeacheringworkGuidecontestService;
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
public class TeacheringworkGuidecontestServiceImpl implements TeacheringworkGuidecontestService {

    @Autowired
    private TeacheringworkGuidecontestMapper teacheringworkGuidecontestMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Autowired
    private ScoreGuidecontestService scoreGuidecontestService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkGuidecontestMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkGuidecontest record) {
        return teacheringworkGuidecontestMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkGuidecontest> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkGuidecontest> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = teacheringworkGuidecontestMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = teacheringworkGuidecontestMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            TeacheringworkGuidecontest teacheringworkGuidecontest = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(teacheringworkGuidecontest.getClassTeacher());
            teacheringworkGuidecontest.setClassTeacherName(userinformationService.selectUserinformation(userinformation).getName());
        }
        PageInfo<TeacheringworkGuidecontest> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkGuidecontest> selectByClassTeacher(TeacheringworkGuidecontest teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeacheringworkGuidecontest> teachings = teacheringworkGuidecontestMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkGuidecontest> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkGuidecontest record) {
        return teacheringworkGuidecontestMapper.updateByPrimaryKey(record);
    }

    @Override
    public BigDecimal getScore(String level, Integer prizePersonsNumber, Integer firstPersonsNumber, Integer secondPersonsNumber, Integer thirdPersonsNumber, Integer instructorsNumber) {
        ScoreGuidecontest scoreGuidecontest = scoreGuidecontestService.selectByPrimaryKey(1);
        BigDecimal bfirstPersonsNumber = BigDecimal.valueOf(prizePersonsNumber + firstPersonsNumber);
        BigDecimal bsecondPersonsNumber = BigDecimal.valueOf(secondPersonsNumber);
        BigDecimal bthirdPersonsNumber = BigDecimal.valueOf(thirdPersonsNumber);
        BigDecimal binstructorsNumber = BigDecimal.valueOf(instructorsNumber);
        if (level.equals("国际")) {
            BigDecimal first = bfirstPersonsNumber.multiply(scoreGuidecontest.getInternationalFirstDigit());
            BigDecimal second = bsecondPersonsNumber.multiply(scoreGuidecontest.getInternationalSecondDigit());
            BigDecimal third = bthirdPersonsNumber.multiply(scoreGuidecontest.getInternationalThirdDigit());
            return first.add(second).add(third).divide(binstructorsNumber, 3);
        } else if (level.equals("全国") || level.equals("大区")) {
            BigDecimal first = bfirstPersonsNumber.multiply(scoreGuidecontest.getCountryFirstDigit());
            BigDecimal second = bsecondPersonsNumber.multiply(scoreGuidecontest.getCountrySecondDigit());
            BigDecimal third = bthirdPersonsNumber.multiply(scoreGuidecontest.getCountryThirdDigit());
            return first.add(second).add(third).divide(binstructorsNumber, 3);
        } else if (level.equals("省级")) {
            BigDecimal first = bfirstPersonsNumber.multiply(scoreGuidecontest.getProvincialFirstDigit());
            BigDecimal second = bsecondPersonsNumber.multiply(scoreGuidecontest.getProvincialSecondDigit());
            BigDecimal third = bthirdPersonsNumber.multiply(scoreGuidecontest.getProvincialThirdDigit());
            return first.add(second).add(third).divide(binstructorsNumber, 3);
        } else if (level.equals("市级")) {
            BigDecimal first = bfirstPersonsNumber.multiply(scoreGuidecontest.getCityFirstDigit());
            BigDecimal second = bsecondPersonsNumber.multiply(scoreGuidecontest.getCitySecondDigit());
            BigDecimal third = bthirdPersonsNumber.multiply(scoreGuidecontest.getCityThirdDigit());
            return first.add(second).add(third).divide(binstructorsNumber, 3);
        } else if (level.equals("院级")) {
            BigDecimal first = bfirstPersonsNumber.multiply(scoreGuidecontest.getSchoolFirstDigit());
            BigDecimal second = bsecondPersonsNumber.multiply(scoreGuidecontest.getSchoolSecondDigit());
            BigDecimal third = bthirdPersonsNumber.multiply(scoreGuidecontest.getSchoolThirdDigit());
            return first.add(second).add(third).divide(binstructorsNumber, 3);
        }

        return BigDecimal.valueOf(0);
    }
}
