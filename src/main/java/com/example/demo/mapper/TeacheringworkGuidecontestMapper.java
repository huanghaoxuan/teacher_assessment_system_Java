package com.example.demo.mapper;

import com.example.demo.model.TeacheringworkGuidecontest;

import java.util.List;

public interface TeacheringworkGuidecontestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkGuidecontest record);

    TeacheringworkGuidecontest selectByPrimaryKey(Integer id);

    List<TeacheringworkGuidecontest> selectAll();

    int updateByPrimaryKey(TeacheringworkGuidecontest record);

    List<TeacheringworkGuidecontest> selectByClassTeacher(TeacheringworkGuidecontest record);
}