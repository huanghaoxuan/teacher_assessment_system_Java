package com.example.demo.mapper;

import com.example.demo.model.ScoreNotgovernmentachievementaward;

import java.util.List;

public interface ScoreNotgovernmentachievementawardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScoreNotgovernmentachievementaward record);

    ScoreNotgovernmentachievementaward selectByPrimaryKey(Integer id);

    List<ScoreNotgovernmentachievementaward> selectAll();

    int updateByPrimaryKey(ScoreNotgovernmentachievementaward record);
}