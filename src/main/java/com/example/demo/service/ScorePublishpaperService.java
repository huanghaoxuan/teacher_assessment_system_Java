package com.example.demo.service;

import com.example.demo.model.ScorePublishpaper;

public interface ScorePublishpaperService {

    ScorePublishpaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(ScorePublishpaper record);
}