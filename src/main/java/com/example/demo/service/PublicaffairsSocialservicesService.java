package com.example.demo.service;

import com.example.demo.model.PublicaffairsSocialservices;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

public interface PublicaffairsSocialservicesService {
    int deleteByPrimaryKey(Integer id);

    int insert(PublicaffairsSocialservices record);

    PageInfo<PublicaffairsSocialservices> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<PublicaffairsSocialservices> selectByClassTeacher(PublicaffairsSocialservices teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(PublicaffairsSocialservices record);
}