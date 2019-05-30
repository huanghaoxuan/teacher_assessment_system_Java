package com.example.demo.mapper;

import com.example.demo.model.Userinformation;

import java.util.List;

public interface UserinformationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userinformation record);

    Userinformation selectByPrimaryKey(Integer id);

    List<Userinformation> selectAll();

    int updateByPrimaryKey(Userinformation record);

    List<Userinformation> selectByClassTeacher(Userinformation record);
}