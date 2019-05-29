package com.example.demo.mapper;

import com.example.demo.model.TeacheringworkInternshipguide;

import java.util.List;

public interface TeacheringworkInternshipguideMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkInternshipguide record);

    TeacheringworkInternshipguide selectByPrimaryKey(Integer id);

    List<TeacheringworkInternshipguide> selectAll();

    int updateByPrimaryKey(TeacheringworkInternshipguide record);

    List<TeacheringworkInternshipguide> selectByClassTeacher(TeacheringworkInternshipguide record);
}