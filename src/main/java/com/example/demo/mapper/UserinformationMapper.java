package com.example.demo.mapper;

import com.example.demo.model.Userinformation;
import org.apache.ibatis.annotations.Param;

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

    List<Userinformation> selectBydepartmentDept(@Param("departmentDept") String departmentDept);

    Userinformation selectByClassTeacher(Userinformation record);

    Userinformation selectByName(Userinformation record);

}