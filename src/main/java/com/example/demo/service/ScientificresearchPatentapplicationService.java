package com.example.demo.service;

import com.example.demo.model.ScientificresearchPatentapplication;
import com.github.pagehelper.PageInfo;

import java.math.BigDecimal;

public interface ScientificresearchPatentapplicationService {
    int deleteByPrimaryKey(Integer id);

    int insert(ScientificresearchPatentapplication record);

    PageInfo<ScientificresearchPatentapplication> selectAll(int pageNum, int pageSize, String departmentDept);

    PageInfo<ScientificresearchPatentapplication> selectByClassTeacher(ScientificresearchPatentapplication teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(ScientificresearchPatentapplication record);

    BigDecimal getScore(String tpye);
}