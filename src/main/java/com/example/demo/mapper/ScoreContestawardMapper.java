package com.example.demo.mapper;

import com.example.demo.model.ScoreContestaward;

import java.util.List;

public interface ScoreContestawardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScoreContestaward record);

    ScoreContestaward selectByPrimaryKey(Integer id);

    List<ScoreContestaward> selectAll();

    int updateByPrimaryKey(ScoreContestaward record);
}