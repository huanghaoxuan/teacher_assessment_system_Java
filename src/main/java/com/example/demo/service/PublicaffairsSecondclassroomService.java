package com.example.demo.service;

import com.example.demo.model.PublicaffairsSecondclassroom;
import com.github.pagehelper.PageInfo;

public interface PublicaffairsSecondclassroomService {
    int deleteByPrimaryKey(Integer id);

    int insert(PublicaffairsSecondclassroom record);

    PageInfo<PublicaffairsSecondclassroom> selectAll(int pageNum, int pageSize);

    PageInfo<PublicaffairsSecondclassroom> selectByClassTeacher(PublicaffairsSecondclassroom teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(PublicaffairsSecondclassroom record);
}