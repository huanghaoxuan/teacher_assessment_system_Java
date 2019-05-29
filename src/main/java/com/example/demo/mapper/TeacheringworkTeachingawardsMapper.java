package com.example.demo.mapper;

import com.example.demo.model.TeacheringworkTeachingawards;

import java.util.List;

public interface TeacheringworkTeachingawardsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkTeachingawards record);

    TeacheringworkTeachingawards selectByPrimaryKey(Integer id);

    List<TeacheringworkTeachingawards> selectAll();

    int updateByPrimaryKey(TeacheringworkTeachingawards record);

    List<TeacheringworkTeachingawards> selectByClassTeacher(TeacheringworkTeachingawards record);
}