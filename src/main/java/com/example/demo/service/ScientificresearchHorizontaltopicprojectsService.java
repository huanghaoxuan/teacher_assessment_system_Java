package com.example.demo.service;

import com.example.demo.model.ScientificresearchHorizontaltopicprojects;
import com.github.pagehelper.PageInfo;

import java.math.BigDecimal;

public interface ScientificresearchHorizontaltopicprojectsService {
    int deleteByPrimaryKey(Integer id);

    int insert(ScientificresearchHorizontaltopicprojects record);

    PageInfo<ScientificresearchHorizontaltopicprojects> selectAll(int pageNum, int pageSize, String departmentDept);

    PageInfo<ScientificresearchHorizontaltopicprojects> selectByClassTeacher(ScientificresearchHorizontaltopicprojects teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(ScientificresearchHorizontaltopicprojects record);

    BigDecimal getScore(BigDecimal money);
}