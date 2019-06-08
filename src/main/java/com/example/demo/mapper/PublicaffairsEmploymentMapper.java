package com.example.demo.mapper;

import com.example.demo.model.PublicaffairsEmployment;

import java.util.List;

public interface PublicaffairsEmploymentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PublicaffairsEmployment record);

    PublicaffairsEmployment selectByPrimaryKey(Integer id);

    List<PublicaffairsEmployment> selectAllByClassTeacher(List<String> classTeachers);

    List<PublicaffairsEmployment> selectAll();

    int updateByPrimaryKey(PublicaffairsEmployment record);

    List<PublicaffairsEmployment> selectByClassTeacher(PublicaffairsEmployment record);
}