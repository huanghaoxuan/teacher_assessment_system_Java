package com.example.demo.service;

import com.example.demo.model.TeacheringworkTeachingawards;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

import java.math.BigDecimal;

public interface TeacheringworkTeachingawardsService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkTeachingawards record);

    PageInfo<TeacheringworkTeachingawards> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<TeacheringworkTeachingawards> selectByClassTeacher(TeacheringworkTeachingawards teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeacheringworkTeachingawards record);

    BigDecimal getScore(String type, String level, String grade, Integer participantsNumber);
}