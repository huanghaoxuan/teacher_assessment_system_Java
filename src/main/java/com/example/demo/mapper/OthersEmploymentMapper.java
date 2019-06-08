package com.example.demo.mapper;

import com.example.demo.model.OthersEmployment;

import java.util.List;

public interface OthersEmploymentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OthersEmployment record);

    OthersEmployment selectByPrimaryKey(Integer id);

    List<OthersEmployment> selectAllByClassTeacher(List<String> classTeachers);

    List<OthersEmployment> selectAll();

    int updateByPrimaryKey(OthersEmployment record);

    List<OthersEmployment> selectByClassTeacher(OthersEmployment record);
}