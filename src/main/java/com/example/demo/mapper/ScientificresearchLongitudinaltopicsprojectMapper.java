package com.example.demo.mapper;

import com.example.demo.model.ScientificresearchLongitudinaltopicsproject;

import java.util.List;

public interface ScientificresearchLongitudinaltopicsprojectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScientificresearchLongitudinaltopicsproject record);

    ScientificresearchLongitudinaltopicsproject selectByPrimaryKey(Integer id);

    List<ScientificresearchLongitudinaltopicsproject> selectAll();

    int updateByPrimaryKey(ScientificresearchLongitudinaltopicsproject record);

    List<ScientificresearchLongitudinaltopicsproject> selectByClassTeacher(ScientificresearchLongitudinaltopicsproject record);
}