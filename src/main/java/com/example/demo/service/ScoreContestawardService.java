package com.example.demo.service;

import com.example.demo.model.ScoreContestaward;

public interface ScoreContestawardService {

    ScoreContestaward selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(ScoreContestaward record);
}