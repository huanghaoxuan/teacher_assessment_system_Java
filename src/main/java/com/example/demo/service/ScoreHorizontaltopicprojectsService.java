package com.example.demo.service;

import com.example.demo.model.ScoreHorizontaltopicprojects;

public interface ScoreHorizontaltopicprojectsService {

    ScoreHorizontaltopicprojects selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(ScoreHorizontaltopicprojects record);
}