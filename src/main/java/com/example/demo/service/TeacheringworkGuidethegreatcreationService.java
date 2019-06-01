package com.example.demo.service;

import com.example.demo.model.TeacheringworkGuidethegreatcreation;
import com.github.pagehelper.PageInfo;

import java.math.BigDecimal;

public interface TeacheringworkGuidethegreatcreationService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkGuidethegreatcreation record);

    PageInfo<TeacheringworkGuidethegreatcreation> selectAll(int pageNum, int pageSize);

    PageInfo<TeacheringworkGuidethegreatcreation> selectByClassTeacher(TeacheringworkGuidethegreatcreation teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeacheringworkGuidethegreatcreation record);

    BigDecimal getScore(String level, String titleLevel, Integer mentorsNumber);
}