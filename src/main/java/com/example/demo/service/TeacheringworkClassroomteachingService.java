package com.example.demo.service;

import com.example.demo.model.TeacheringworkClassroomteaching;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

public interface TeacheringworkClassroomteachingService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacheringworkClassroomteaching record);

    PageInfo<TeacheringworkClassroomteaching> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<TeacheringworkClassroomteaching> selectByClassTeacher(TeacheringworkClassroomteaching teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeacheringworkClassroomteaching record);
}