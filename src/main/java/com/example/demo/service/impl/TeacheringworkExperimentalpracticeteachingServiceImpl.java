package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkExperimentalpracticeteachingMapper;
import com.example.demo.model.TeacheringworkExperimentalpracticeteaching;
import com.example.demo.service.TeacheringworkExperimentalpracticeteachingService;
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

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkExperimentalpracticeteachingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkExperimentalpracticeteaching record) {
        return teacheringworkExperimentalpracticeteachingMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkExperimentalpracticeteaching> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkExperimentalpracticeteaching> teachings = teacheringworkExperimentalpracticeteachingMapper.selectAll();
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
