package com.example.demo.mapper;

import com.example.demo.model.TeacheringworkGraduationdesignguide;

import java.util.List;

public interface TeacheringworkGraduationdesignguideMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkGraduationdesignguide record);

    TeacheringworkGraduationdesignguide selectByPrimaryKey(Integer id);

    List<TeacheringworkGraduationdesignguide> selectAllByClassTeacher(List<String> classTeachers);

    List<TeacheringworkGraduationdesignguide> selectAll();

    int updateByPrimaryKey(TeacheringworkGraduationdesignguide record);

    List<TeacheringworkGraduationdesignguide> selectByClassTeacher(TeacheringworkGraduationdesignguide record);
}