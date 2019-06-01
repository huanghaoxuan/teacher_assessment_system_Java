package com.example.demo.mapper;

import com.example.demo.model.ScoreGuidecontest;

import java.util.List;

public interface ScoreGuidecontestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScoreGuidecontest record);

    ScoreGuidecontest selectByPrimaryKey(Integer id);

    List<ScoreGuidecontest> selectAll();

    int updateByPrimaryKey(ScoreGuidecontest record);
}