package com.example.demo.service;

import com.example.demo.model.TeacheringworkInternshipguide;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

public interface TeacheringworkInternshipguideService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkInternshipguide record);

    PageInfo<TeacheringworkInternshipguide> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<TeacheringworkInternshipguide> selectByClassTeacher(TeacheringworkInternshipguide teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeacheringworkInternshipguide record);
}