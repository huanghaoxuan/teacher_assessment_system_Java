package com.example.demo.mapper;

import com.example.demo.model.OthersFiles;

import java.util.List;

public interface OthersFilesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OthersFiles record);

    OthersFiles selectByPrimaryKey(Integer id);

    List<OthersFiles> selectAll();

    int updateByPrimaryKey(OthersFiles record);

    List<OthersFiles> selectByClassTeacher(OthersFiles record);

}