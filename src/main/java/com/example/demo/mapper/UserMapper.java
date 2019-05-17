package com.example.demo.mapper;

import com.example.demo.model.User;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;
import java.util.Map;

/**
 * @program: demo
 * @description: UserMapper
 * @author: zalej
 * @create: 2019-04-17 10:11
 **/

public interface UserMapper extends Mapper<User> {
    List<User> getUser(User user);
    List<User> accessTeacher(User user);
    List<User> accessDepManager(User user);
    List<User> getSupManager(User user);
}
