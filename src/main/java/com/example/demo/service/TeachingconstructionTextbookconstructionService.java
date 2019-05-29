package com.example.demo.service;

import com.example.demo.model.TeachingconstructionTextbookconstruction;
import com.github.pagehelper.PageInfo;

public interface TeachingconstructionTextbookconstructionService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingconstructionTextbookconstruction record);

    PageInfo<TeachingconstructionTextbookconstruction> selectAll(int pageNum, int pageSize);

    PageInfo<TeachingconstructionTextbookconstruction> selectByClassTeacher(TeachingconstructionTextbookconstruction teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeachingconstructionTextbookconstruction record);
}