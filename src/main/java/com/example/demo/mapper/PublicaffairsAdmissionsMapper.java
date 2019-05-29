package com.example.demo.mapper;

import com.example.demo.model.PublicaffairsAdmissions;

import java.util.List;

public interface PublicaffairsAdmissionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PublicaffairsAdmissions record);

    PublicaffairsAdmissions selectByPrimaryKey(Integer id);

    List<PublicaffairsAdmissions> selectAll();

    int updateByPrimaryKey(PublicaffairsAdmissions record);

    List<PublicaffairsAdmissions> selectByClassTeacher(PublicaffairsAdmissions publicaffairsAdmissions);
}