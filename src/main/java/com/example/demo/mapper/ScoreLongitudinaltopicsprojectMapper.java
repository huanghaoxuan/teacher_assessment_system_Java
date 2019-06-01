package com.example.demo.mapper;

import com.example.demo.model.ScoreLongitudinaltopicsproject;

import java.util.List;

public interface ScoreLongitudinaltopicsprojectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScoreLongitudinaltopicsproject record);

    ScoreLongitudinaltopicsproject selectByPrimaryKey(Integer id);

    List<ScoreLongitudinaltopicsproject> selectAll();

    int updateByPrimaryKey(ScoreLongitudinaltopicsproject record);
}