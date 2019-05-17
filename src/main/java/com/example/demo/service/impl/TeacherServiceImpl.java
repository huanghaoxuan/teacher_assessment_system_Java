package com.example.demo.service.impl;

import com.example.demo.mapper.TeacherMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Teacher;
import com.example.demo.model.User;
import com.example.demo.service.TeacherService;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo
 * @description: 用户服务实现类demo
 * @author: zalej
 * @create: 2019-04-17 09:52
 **/
@Service(value = "teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;


    @Override
    public PageInfo<Teacher> selectTeachers(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Teacher> teachers = teacherMapper.selectAllTeacher();
        PageInfo<Teacher> result = new PageInfo<>(teachers);
        return result;
    }
}
