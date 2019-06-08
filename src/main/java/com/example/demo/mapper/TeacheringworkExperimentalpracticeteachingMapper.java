package com.example.demo.mapper;

import com.example.demo.model.TeacheringworkExperimentalpracticeteaching;

import java.util.List;

public interface TeacheringworkExperimentalpracticeteachingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkExperimentalpracticeteaching record);

    TeacheringworkExperimentalpracticeteaching selectByPrimaryKey(Integer id);

    List<TeacheringworkExperimentalpracticeteaching> selectAllByClassTeacher(List<String> classTeachers);

    List<TeacheringworkExperimentalpracticeteaching> selectAll();

    int updateByPrimaryKey(TeacheringworkExperimentalpracticeteaching record);

    List<TeacheringworkExperimentalpracticeteaching> selectByClassTeacher(TeacheringworkExperimentalpracticeteaching record);
}