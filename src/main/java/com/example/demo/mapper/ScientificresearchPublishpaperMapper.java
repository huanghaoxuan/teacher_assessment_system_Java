package com.example.demo.mapper;

import com.example.demo.model.ScientificresearchPublishpaper;

import java.util.List;

public interface ScientificresearchPublishpaperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScientificresearchPublishpaper record);

    ScientificresearchPublishpaper selectByPrimaryKey(Integer id);

    List<ScientificresearchPublishpaper> selectAllByClassTeacher(List<String> classTeachers);

    List<ScientificresearchPublishpaper> selectAll();

    int updateByPrimaryKey(ScientificresearchPublishpaper record);

    List<ScientificresearchPublishpaper> selectByClassTeacher(ScientificresearchPublishpaper record);

}