package com.example.demo.service;

import com.example.demo.model.TeacheringworkPracticaltrainingguidance;
import com.github.pagehelper.PageInfo;

public interface TeacheringworkPracticaltrainingguidanceService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkPracticaltrainingguidance record);

    PageInfo<TeacheringworkPracticaltrainingguidance> selectAll(int pageNum, int pageSize);

    PageInfo<TeacheringworkPracticaltrainingguidance> selectByClassTeacher(TeacheringworkPracticaltrainingguidance teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeacheringworkPracticaltrainingguidance record);
}