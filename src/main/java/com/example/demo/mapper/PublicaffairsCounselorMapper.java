package com.example.demo.mapper;

import com.example.demo.model.PublicaffairsCounselor;

import java.util.List;

public interface PublicaffairsCounselorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PublicaffairsCounselor record);

    PublicaffairsCounselor selectByPrimaryKey(Integer id);

    List<PublicaffairsCounselor> selectAll();

    int updateByPrimaryKey(PublicaffairsCounselor record);

    List<PublicaffairsCounselor> selectByClassTeacher(PublicaffairsCounselor record);
}