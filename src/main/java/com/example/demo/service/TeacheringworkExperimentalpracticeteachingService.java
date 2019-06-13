package com.example.demo.service;

import com.example.demo.model.TeacheringworkExperimentalpracticeteaching;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

public interface TeacheringworkExperimentalpracticeteachingService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkExperimentalpracticeteaching record);

    PageInfo<TeacheringworkExperimentalpracticeteaching> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<TeacheringworkExperimentalpracticeteaching> selectByClassTeacher(TeacheringworkExperimentalpracticeteaching teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeacheringworkExperimentalpracticeteaching record);
}