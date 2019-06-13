package com.example.demo.service;

import com.example.demo.model.ScientificresearchLongitudinaltopicsproject;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

import java.math.BigDecimal;

public interface ScientificresearchLongitudinaltopicsprojectService {
    int deleteByPrimaryKey(Integer id);

    int insert(ScientificresearchLongitudinaltopicsproject record);

    PageInfo<ScientificresearchLongitudinaltopicsproject> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<ScientificresearchLongitudinaltopicsproject> selectByClassTeacher(ScientificresearchLongitudinaltopicsproject teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(ScientificresearchLongitudinaltopicsproject record);

    BigDecimal getScore(String source, String type);
}