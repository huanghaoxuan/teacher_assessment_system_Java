package com.example.demo.mapper;

import com.example.demo.model.TeachingconstructionTeachingtopics;

import java.util.List;

public interface TeachingconstructionTeachingtopicsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingconstructionTeachingtopics record);

    TeachingconstructionTeachingtopics selectByPrimaryKey(Integer id);

    List<TeachingconstructionTeachingtopics> selectAllByClassTeacher(List<String> classTeachers);

    List<TeachingconstructionTeachingtopics> selectAll();

    int updateByPrimaryKey(TeachingconstructionTeachingtopics record);

    List<TeachingconstructionTeachingtopics> selectByClassTeacher(TeachingconstructionTeachingtopics record);
}