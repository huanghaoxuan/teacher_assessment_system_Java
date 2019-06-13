package com.example.demo.service;

import com.example.demo.model.OthersAnnualreviewstatus;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

public interface OthersAnnualreviewstatusService {

    PageInfo<OthersAnnualreviewstatus> selectByClassTeacher(OthersAnnualreviewstatus teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(OthersAnnualreviewstatus record);

    int insert(OthersAnnualreviewstatus record);

    int deleteByPrimaryKey(Integer id);

    PageInfo<OthersAnnualreviewstatus> selectAll(int pageNum, int pageSize, Userinformation record);

}
