package com.example.demo.mapper;

import com.example.demo.model.OthersAnnualreviewstatus;
import com.example.demo.model.OthersComprehensiveawardwinning;

import java.util.List;

public interface OthersComprehensiveawardwinningMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OthersComprehensiveawardwinning record);

    OthersComprehensiveawardwinning selectByPrimaryKey(Integer id);

    List<OthersComprehensiveawardwinning> selectAll();

    int updateByPrimaryKey(OthersComprehensiveawardwinning record);

    List<OthersComprehensiveawardwinning> selectByClassTeacher(OthersComprehensiveawardwinning othersComprehensiveawardwinning);

}