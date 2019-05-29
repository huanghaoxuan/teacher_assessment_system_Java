package com.example.demo.mapper;

import com.example.demo.model.OthersAnnualreviewstatus;
import java.util.List;

public interface OthersAnnualreviewstatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OthersAnnualreviewstatus record);

    OthersAnnualreviewstatus selectByPrimaryKey(Integer id);

    List<OthersAnnualreviewstatus> selectAll();

    int updateByPrimaryKey(OthersAnnualreviewstatus record);

    List<OthersAnnualreviewstatus> selectByClassTeacher(OthersAnnualreviewstatus record);
}