package com.example.demo.service;

import com.example.demo.model.TeacheringworkExperimentalpracticeteaching;
import com.github.pagehelper.PageInfo;

public interface TeacheringworkExperimentalpracticeteachingService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkExperimentalpracticeteaching record);

    PageInfo<TeacheringworkExperimentalpracticeteaching> selectAll(int pageNum, int pageSize, String departmentDept);

    PageInfo<TeacheringworkExperimentalpracticeteaching> selectByClassTeacher(TeacheringworkExperimentalpracticeteaching teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeacheringworkExperimentalpracticeteaching record);
}