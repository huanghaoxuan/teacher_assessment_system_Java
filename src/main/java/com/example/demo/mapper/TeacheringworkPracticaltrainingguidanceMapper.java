package com.example.demo.mapper;

import com.example.demo.model.TeacheringworkPracticaltrainingguidance;

import java.util.List;

public interface TeacheringworkPracticaltrainingguidanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkPracticaltrainingguidance record);

    TeacheringworkPracticaltrainingguidance selectByPrimaryKey(Integer id);

    List<TeacheringworkPracticaltrainingguidance> selectAllByClassTeacher(List<String> classTeachers);

    List<TeacheringworkPracticaltrainingguidance> selectAll();

    int updateByPrimaryKey(TeacheringworkPracticaltrainingguidance record);

    List<TeacheringworkPracticaltrainingguidance> selectByClassTeacher(TeacheringworkPracticaltrainingguidance record);
}