package com.example.demo.service;

import com.example.demo.model.Userinformation;

import java.util.List;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/30 1:29
 * @Version 1.0
 */
public interface UserinformationService {

    Userinformation selectUserinformation(Userinformation record); //通过教师工号查询信息

    Userinformation selectByName(Userinformation record);//通过教师姓名查询信息

    int updateByPrimaryKey(Userinformation record);

    int updateEmail(Userinformation record);

    int updatename(Userinformation record);

    int updatedepartmentDept(Userinformation record);

    List<String> selectBydepartmentDept(String departmentDept);

    int getToken(String email);

    int getTokenForget(String classTeacher);
}
