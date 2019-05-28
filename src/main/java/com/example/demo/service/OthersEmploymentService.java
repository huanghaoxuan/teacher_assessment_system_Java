package com.example.demo.service;

import com.example.demo.model.OthersEmployment;
import com.github.pagehelper.PageInfo;

public interface OthersEmploymentService {
    int deleteByPrimaryKey(Integer id);

    int insert(OthersEmployment record);

    PageInfo<OthersEmployment> selectAll(int pageNum, int pageSize);

    PageInfo<OthersEmployment> selectByClassTeacher(OthersEmployment teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(OthersEmployment record);
}