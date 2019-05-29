package com.example.demo.mapper;

import com.example.demo.model.TeacheringworkGuidethegreatcreation;

import java.util.List;

public interface TeacheringworkGuidethegreatcreationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkGuidethegreatcreation record);

    TeacheringworkGuidethegreatcreation selectByPrimaryKey(Integer id);

    List<TeacheringworkGuidethegreatcreation> selectAll();

    int updateByPrimaryKey(TeacheringworkGuidethegreatcreation record);

    List<TeacheringworkGuidethegreatcreation> selectByClassTeacher(TeacheringworkGuidethegreatcreation record);
}