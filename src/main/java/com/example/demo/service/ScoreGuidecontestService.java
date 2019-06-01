package com.example.demo.service;

import com.example.demo.model.ScoreGuidecontest;

public interface ScoreGuidecontestService {

    ScoreGuidecontest selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(ScoreGuidecontest record);
}