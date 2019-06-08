package com.example.demo.service;

import com.example.demo.model.TeachingconstructionTeachingactivities;
import com.github.pagehelper.PageInfo;

public interface TeachingconstructionTeachingactivitiesService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingconstructionTeachingactivities record);

    PageInfo<TeachingconstructionTeachingactivities> selectAll(int pageNum, int pageSize, String departmentDept);

    PageInfo<TeachingconstructionTeachingactivities> selectByClassTeacher(TeachingconstructionTeachingactivities teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeachingconstructionTeachingactivities record);
}