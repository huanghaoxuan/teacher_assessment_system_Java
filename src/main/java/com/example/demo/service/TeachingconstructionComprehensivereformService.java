package com.example.demo.service;

import com.example.demo.model.TeachingconstructionComprehensivereform;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

public interface TeachingconstructionComprehensivereformService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingconstructionComprehensivereform record);

    PageInfo<TeachingconstructionComprehensivereform> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<TeachingconstructionComprehensivereform> selectByClassTeacher(TeachingconstructionComprehensivereform teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeachingconstructionComprehensivereform record);
}