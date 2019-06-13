package com.example.demo.service;

import com.example.demo.model.OthersComprehensiveawardwinning;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

public interface OthersComprehensiveawardwinningService {
    int deleteByPrimaryKey(Integer id);

    int insert(OthersComprehensiveawardwinning record);

    PageInfo<OthersComprehensiveawardwinning> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<OthersComprehensiveawardwinning> selectByClassTeacher(OthersComprehensiveawardwinning teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(OthersComprehensiveawardwinning record);
}