package com.example.demo.service;

import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/30 1:29
 * @Version 1.0
 */
public interface UserinformationService {

    Userinformation selectByClassTeacher(Userinformation record); //通过教师工号查询信息

    PageInfo<Userinformation> selectByUserinformation(int pageNum, int pageSize, Userinformation record);//查询信息(各种查询条件)

    int updateByPrimaryKey(Userinformation record);

    int updateEmail(Userinformation record);

    int updatename(Userinformation record);

    int updatedepartmentDept(Userinformation record);

    List<String> selectSomeByAny(Userinformation record);

    int getToken(String email);

    int getTokenForget(String classTeacher);
}
