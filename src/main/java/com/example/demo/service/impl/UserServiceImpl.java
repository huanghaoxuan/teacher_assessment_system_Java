package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
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
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<User> getTeacher(User teacher, int pageNum, int pageSize) {
        if (teacher.getAccessName()==null || teacher.getAccessName()=="" || teacher.getAccessPass() == ""|| teacher.getAccessPass()==null){
            return null;
        }
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.getTeacher(teacher);
        PageInfo<User> result = new PageInfo<>(users);
        return result;
    }

    @Override
    public PageInfo<User> getDepManager(User teacher, int pageNum, int pageSize) {
        return null;
    }
}
