package com.example.demo.mapper;

import com.example.demo.model.TeacheringworkClassroomteaching;

import java.util.List;

public interface TeacheringworkClassroomteachingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkClassroomteaching record);

    TeacheringworkClassroomteaching selectByPrimaryKey(Integer id);

    List<TeacheringworkClassroomteaching> selectAllByClassTeacher(List<String> classTeachers);

    List<TeacheringworkClassroomteaching> selectAll();

    int updateByPrimaryKey(TeacheringworkClassroomteaching record);

    List<TeacheringworkClassroomteaching> selectByClassTeacher(TeacheringworkClassroomteaching record);
}