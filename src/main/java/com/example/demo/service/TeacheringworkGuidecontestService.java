package com.example.demo.service;

import com.example.demo.model.TeacheringworkGuidecontest;
import com.github.pagehelper.PageInfo;

public interface TeacheringworkGuidecontestService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkGuidecontest record);

    PageInfo<TeacheringworkGuidecontest> selectAll(int pageNum, int pageSize);

    PageInfo<TeacheringworkGuidecontest> selectByClassTeacher(TeacheringworkGuidecontest teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeacheringworkGuidecontest record);
}