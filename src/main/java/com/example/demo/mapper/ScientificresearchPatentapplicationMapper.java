package com.example.demo.mapper;

import com.example.demo.model.ScientificresearchPatentapplication;

import java.util.List;

public interface ScientificresearchPatentapplicationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScientificresearchPatentapplication record);

    ScientificresearchPatentapplication selectByPrimaryKey(Integer id);

    List<ScientificresearchPatentapplication> selectAllByClassTeacher(List<String> classTeachers);

    List<ScientificresearchPatentapplication> selectAll();

    int updateByPrimaryKey(ScientificresearchPatentapplication record);

    List<ScientificresearchPatentapplication> selectByClassTeacher(ScientificresearchPatentapplication record);

}