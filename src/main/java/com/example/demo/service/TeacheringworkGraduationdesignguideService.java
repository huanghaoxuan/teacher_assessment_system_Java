package com.example.demo.service;

import com.example.demo.model.TeacheringworkGraduationdesignguide;
import com.github.pagehelper.PageInfo;

public interface TeacheringworkGraduationdesignguideService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkGraduationdesignguide record);

    PageInfo<TeacheringworkGraduationdesignguide> selectAll(int pageNum, int pageSize);

    PageInfo<TeacheringworkGraduationdesignguide> selectByClassTeacher(TeacheringworkGraduationdesignguide teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeacheringworkGraduationdesignguide record);
}