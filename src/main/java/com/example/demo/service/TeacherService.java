package com.example.demo.service;


import com.example.demo.model.Teacher;
import com.example.demo.model.User;
import com.github.pagehelper.PageInfo;

public interface TeacherService {

    /**
    * @author:  jizhaolun@zto.cn
    * @params:
    * @return:  List
    * @date:    2019/4/17 9:57
    */
    PageInfo<Teacher> selectTeachers(int pageNum, int pageSize);

}
