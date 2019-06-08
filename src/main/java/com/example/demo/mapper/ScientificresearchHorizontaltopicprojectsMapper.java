package com.example.demo.mapper;

import com.example.demo.model.ScientificresearchHorizontaltopicprojects;

import java.util.List;

public interface ScientificresearchHorizontaltopicprojectsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScientificresearchHorizontaltopicprojects record);

    ScientificresearchHorizontaltopicprojects selectByPrimaryKey(Integer id);

    List<ScientificresearchHorizontaltopicprojects> selectAllByClassTeacher(List<String> classTeachers);

    List<ScientificresearchHorizontaltopicprojects> selectAll();

    int updateByPrimaryKey(ScientificresearchHorizontaltopicprojects record);

    List<ScientificresearchHorizontaltopicprojects> selectByClassTeacher(ScientificresearchHorizontaltopicprojects record);
}