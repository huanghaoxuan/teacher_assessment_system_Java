package com.example.demo.service;

import com.example.demo.model.ScientificresearchPatentapplication;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

import java.math.BigDecimal;

public interface ScientificresearchPatentapplicationService {
    int deleteByPrimaryKey(Integer id);

    int insert(ScientificresearchPatentapplication record);

    PageInfo<ScientificresearchPatentapplication> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<ScientificresearchPatentapplication> selectByClassTeacher(ScientificresearchPatentapplication teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(ScientificresearchPatentapplication record);

    BigDecimal getScore(String tpye);
}