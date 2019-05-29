package com.example.demo.service;

import com.example.demo.model.ScientificresearchHorizontaltopicprojects;
import com.github.pagehelper.PageInfo;

public interface ScientificresearchHorizontaltopicprojectsService {
    int deleteByPrimaryKey(Integer id);

    int insert(ScientificresearchHorizontaltopicprojects record);

    PageInfo<ScientificresearchHorizontaltopicprojects> selectAll(int pageNum, int pageSize);

    PageInfo<ScientificresearchHorizontaltopicprojects> selectByClassTeacher(ScientificresearchHorizontaltopicprojects teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(ScientificresearchHorizontaltopicprojects record);
}