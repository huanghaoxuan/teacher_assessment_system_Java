package com.example.demo.service;

import com.example.demo.model.OthersFiles;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

public interface OthersFilesService {
    int deleteByPrimaryKey(Integer id);

    int insert(OthersFiles record);

    PageInfo<OthersFiles> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<OthersFiles> selectByClassTeacher(OthersFiles teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(OthersFiles record);
}