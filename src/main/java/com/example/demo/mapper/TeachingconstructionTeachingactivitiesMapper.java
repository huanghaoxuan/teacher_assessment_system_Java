package com.example.demo.mapper;

import com.example.demo.model.TeachingconstructionTeachingactivities;

import java.util.List;

public interface TeachingconstructionTeachingactivitiesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingconstructionTeachingactivities record);

    TeachingconstructionTeachingactivities selectByPrimaryKey(Integer id);

    List<TeachingconstructionTeachingactivities> selectAllByClassTeacher(List<String> classTeachers);

    List<TeachingconstructionTeachingactivities> selectAll();

    int updateByPrimaryKey(TeachingconstructionTeachingactivities record);

    List<TeachingconstructionTeachingactivities> selectByClassTeacher(TeachingconstructionTeachingactivities record);
}