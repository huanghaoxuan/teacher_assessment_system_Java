package com.example.demo.service;

import com.example.demo.model.ScoreGovernmentachievementaward;

public interface ScoreGovernmentachievementawardService {

    ScoreGovernmentachievementaward selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(ScoreGovernmentachievementaward record);
}