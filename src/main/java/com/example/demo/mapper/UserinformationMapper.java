package com.example.demo.mapper;

import com.example.demo.model.Userinformation;

import java.util.List;

public interface UserinformationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userinformation record);

    Userinformation selectByPrimaryKey(Integer id);

    List<Userinformation> selectAll();

    int updateByPrimaryKey(Userinformation record);

    int updateEmail(Userinformation record);

    int updatename(Userinformation record);

    int updatedepartmentDept(Userinformation record);

    List<Userinformation> selectSomeByAny(Userinformation record);

    Userinformation selectByClassTeacher(Userinformation record);

    List<Userinformation> selectByUserinformation(Userinformation record);

}