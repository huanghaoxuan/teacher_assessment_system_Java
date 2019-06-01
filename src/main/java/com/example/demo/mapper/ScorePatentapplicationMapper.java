package com.example.demo.mapper;

import com.example.demo.model.ScorePatentapplication;

import java.util.List;

public interface ScorePatentapplicationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScorePatentapplication record);

    ScorePatentapplication selectByPrimaryKey(Integer id);

    List<ScorePatentapplication> selectAll();

    int updateByPrimaryKey(ScorePatentapplication record);
}