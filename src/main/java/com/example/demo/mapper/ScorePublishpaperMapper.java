package com.example.demo.mapper;

import com.example.demo.model.ScorePublishpaper;

import java.util.List;

public interface ScorePublishpaperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScorePublishpaper record);

    ScorePublishpaper selectByPrimaryKey(Integer id);

    List<ScorePublishpaper> selectAll();

    int updateByPrimaryKey(ScorePublishpaper record);
}