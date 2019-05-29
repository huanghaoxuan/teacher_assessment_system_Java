package com.example.demo.mapper;

import com.example.demo.model.PublicaffairsSecondclassroom;

import java.util.List;

public interface PublicaffairsSecondclassroomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PublicaffairsSecondclassroom record);

    PublicaffairsSecondclassroom selectByPrimaryKey(Integer id);

    List<PublicaffairsSecondclassroom> selectAll();

    int updateByPrimaryKey(PublicaffairsSecondclassroom record);

    List<PublicaffairsSecondclassroom> selectByClassTeacher(PublicaffairsSecondclassroom record);
}