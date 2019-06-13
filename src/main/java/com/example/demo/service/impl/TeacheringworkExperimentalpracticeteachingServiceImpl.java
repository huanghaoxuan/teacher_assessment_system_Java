package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkExperimentalpracticeteachingMapper;
import com.example.demo.model.TeacheringworkExperimentalpracticeteaching;
import com.example.demo.model.Userinformation;
import com.example.demo.service.TeacheringworkExperimentalpracticeteachingService;
import com.example.demo.service.UserinformationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/29 9:42
 * @Version 1.0
 */

@Service
public class TeacheringworkExperimentalpracticeteachingServiceImpl implements TeacheringworkExperimentalpracticeteachingService {

    @Autowired
    private TeacheringworkExperimentalpracticeteachingMapper teacheringworkExperimentalpracticeteachingMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkExperimentalpracticeteachingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkExperimentalpracticeteaching record) {
        return teacheringworkExperimentalpracticeteachingMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkExperimentalpracticeteaching> selectAll(int pageNum, int pageSize, Userinformation record) {
        List<String> classTeachers = userinformationService.selectSomeByAny(record);
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkExperimentalpracticeteaching> teachings;
        //如果查询信息表下没有记录，返回空
        if (classTeachers.size() == 0) {
            return new PageInfo<>();
        }
        teachings = teacheringworkExperimentalpracticeteachingMapper.selectAllByClassTeacher(classTeachers);

        //加入当前记录老师姓名
        for (int index = 0; index < teachings.size(); index++) {
            TeacheringworkExperimentalpracticeteaching teacheringworkExperimentalpracticeteaching = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(teacheringworkExperimentalpracticeteaching.getClassTeacher());
            teacheringworkExperimentalpracticeteaching.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<TeacheringworkExperimentalpracticeteaching> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkExperimentalpracticeteaching> selectByClassTeacher(TeacheringworkExperimentalpracticeteaching teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeacheringworkExperimentalpracticeteaching> teachings = teacheringworkExperimentalpracticeteachingMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkExperimentalpracticeteaching> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkExperimentalpracticeteaching record) {
        return teacheringworkExperimentalpracticeteachingMapper.updateByPrimaryKey(record);
    }
}
