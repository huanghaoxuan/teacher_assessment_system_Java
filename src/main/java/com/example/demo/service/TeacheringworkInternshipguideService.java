package com.example.demo.service;

import com.example.demo.model.TeacheringworkInternshipguide;
import com.github.pagehelper.PageInfo;

public interface TeacheringworkInternshipguideService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkInternshipguide record);

    PageInfo<TeacheringworkInternshipguide> selectAll(int pageNum, int pageSize, String departmentDept);

    PageInfo<TeacheringworkInternshipguide> selectByClassTeacher(TeacheringworkInternshipguide teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeacheringworkInternshipguide record);
}