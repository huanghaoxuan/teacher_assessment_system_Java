package com.example.demo.service;

import com.example.demo.model.ScorePatentapplication;

public interface ScorePatentapplicationService {

    ScorePatentapplication selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(ScorePatentapplication record);
}