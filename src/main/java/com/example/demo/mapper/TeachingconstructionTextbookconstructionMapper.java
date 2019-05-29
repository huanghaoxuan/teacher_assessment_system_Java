package com.example.demo.mapper;

import com.example.demo.model.TeachingconstructionTextbookconstruction;

import java.util.List;

public interface TeachingconstructionTextbookconstructionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingconstructionTextbookconstruction record);

    TeachingconstructionTextbookconstruction selectByPrimaryKey(Integer id);

    List<TeachingconstructionTextbookconstruction> selectAll();

    int updateByPrimaryKey(TeachingconstructionTextbookconstruction record);

    List<TeachingconstructionTextbookconstruction> selectByClassTeacher(TeachingconstructionTextbookconstruction record);
}