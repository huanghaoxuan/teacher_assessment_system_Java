package com.example.demo.mapper;

import com.example.demo.model.ScoreHorizontaltopicprojects;

import java.util.List;

public interface ScoreHorizontaltopicprojectsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScoreHorizontaltopicprojects record);

    ScoreHorizontaltopicprojects selectByPrimaryKey(Integer id);

    List<ScoreHorizontaltopicprojects> selectAll();

    int updateByPrimaryKey(ScoreHorizontaltopicprojects record);
}