package com.example.demo.service;

import com.example.demo.model.OthersComprehensiveawardwinning;
import com.github.pagehelper.PageInfo;

public interface OthersComprehensiveawardwinningService {
    int deleteByPrimaryKey(Integer id);

    int insert(OthersComprehensiveawardwinning record);

    PageInfo<OthersComprehensiveawardwinning> selectAll(int pageNum, int pageSize, String departmentDept);

    PageInfo<OthersComprehensiveawardwinning> selectByClassTeacher(OthersComprehensiveawardwinning teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(OthersComprehensiveawardwinning record);
}