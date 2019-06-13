package com.example.demo.service;

import com.example.demo.model.TeacheringworkGuidecontest;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

import java.math.BigDecimal;

public interface TeacheringworkGuidecontestService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkGuidecontest record);

    PageInfo<TeacheringworkGuidecontest> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<TeacheringworkGuidecontest> selectByClassTeacher(TeacheringworkGuidecontest teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeacheringworkGuidecontest record);

    BigDecimal getScore(String level, Integer prizePersonsNumber, Integer firstPersonsNumber, Integer secondPersonsNumber, Integer thirdPersonsNumber, Integer instructorsNumber);
}