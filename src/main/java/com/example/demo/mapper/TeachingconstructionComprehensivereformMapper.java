package com.example.demo.mapper;

import com.example.demo.model.TeachingconstructionComprehensivereform;

import java.util.List;

public interface TeachingconstructionComprehensivereformMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingconstructionComprehensivereform record);

    TeachingconstructionComprehensivereform selectByPrimaryKey(Integer id);

    List<TeachingconstructionComprehensivereform> selectAll();

    int updateByPrimaryKey(TeachingconstructionComprehensivereform record);

    List<TeachingconstructionComprehensivereform> selectByClassTeacher(TeachingconstructionComprehensivereform record);
}