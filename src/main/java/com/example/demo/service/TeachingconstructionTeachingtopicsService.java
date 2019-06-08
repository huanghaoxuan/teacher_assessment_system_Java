package com.example.demo.service;

import com.example.demo.model.TeachingconstructionTeachingtopics;
import com.github.pagehelper.PageInfo;

public interface TeachingconstructionTeachingtopicsService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingconstructionTeachingtopics record);

    PageInfo<TeachingconstructionTeachingtopics> selectAll(int pageNum, int pageSize, String departmentDept);

    PageInfo<TeachingconstructionTeachingtopics> selectByClassTeacher(TeachingconstructionTeachingtopics teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeachingconstructionTeachingtopics record);
}