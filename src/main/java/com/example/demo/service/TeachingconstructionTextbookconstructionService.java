package com.example.demo.service;

import com.example.demo.model.TeachingconstructionTextbookconstruction;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

import java.math.BigDecimal;

public interface TeachingconstructionTextbookconstructionService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingconstructionTextbookconstruction record);

    PageInfo<TeachingconstructionTextbookconstruction> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<TeachingconstructionTextbookconstruction> selectByClassTeacher(TeachingconstructionTextbookconstruction teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeachingconstructionTextbookconstruction record);

    BigDecimal getScore(String yesorno, BigDecimal textbooksNumber);
}