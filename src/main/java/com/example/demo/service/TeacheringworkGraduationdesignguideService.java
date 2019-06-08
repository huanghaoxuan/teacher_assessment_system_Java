package com.example.demo.service;

import com.example.demo.model.TeacheringworkGraduationdesignguide;
import com.github.pagehelper.PageInfo;

import java.math.BigDecimal;

public interface TeacheringworkGraduationdesignguideService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkGraduationdesignguide record);

    PageInfo<TeacheringworkGraduationdesignguide> selectAll(int pageNum, int pageSize, String departmentDept);

    PageInfo<TeacheringworkGraduationdesignguide> selectByClassTeacher(TeacheringworkGraduationdesignguide teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeacheringworkGraduationdesignguide record);

    BigDecimal getScore(String level, Integer winnersNumber);
}