package com.example.demo.mapper;

import com.example.demo.model.ScoreGovernmentachievementaward;

import java.util.List;

public interface ScoreGovernmentachievementawardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScoreGovernmentachievementaward record);

    ScoreGovernmentachievementaward selectByPrimaryKey(Integer id);

    List<ScoreGovernmentachievementaward> selectAll();

    int updateByPrimaryKey(ScoreGovernmentachievementaward record);
}