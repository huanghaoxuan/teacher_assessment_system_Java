package com.example.demo.mapper;

import com.example.demo.model.Teacher;
import com.example.demo.model.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @program: demo
 * @description: UserMapper
 * @author: zalej
 * @create: 2019-04-17 10:11
 **/

public interface TeacherMapper extends Mapper<Teacher> {
    List<Teacher> selectAllTeacher();
}
