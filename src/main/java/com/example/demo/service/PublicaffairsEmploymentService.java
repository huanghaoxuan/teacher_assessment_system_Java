package com.example.demo.service;

import com.example.demo.model.PublicaffairsEmployment;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

public interface PublicaffairsEmploymentService {
    int deleteByPrimaryKey(Integer id);

    int insert(PublicaffairsEmployment record);

    PageInfo<PublicaffairsEmployment> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<PublicaffairsEmployment> selectByClassTeacher(PublicaffairsEmployment teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(PublicaffairsEmployment record);
}