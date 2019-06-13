package com.example.demo.service;

import com.example.demo.model.PublicaffairsCounselor;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

public interface PublicaffairsCounselorService {
    int deleteByPrimaryKey(Integer id);

    int insert(PublicaffairsCounselor record);

    PageInfo<PublicaffairsCounselor> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<PublicaffairsCounselor> selectByClassTeacher(PublicaffairsCounselor teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(PublicaffairsCounselor record);
}