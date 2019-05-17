package com.example.demo.service;


import com.github.pagehelper.PageInfo;
import com.example.demo.model.User;
public interface UserService {

    /**
    * @author:  hellojzl@foxmail.com
    * @params:
    * @return:  List
    * @date:    2019/4/17 9:57
    */
    PageInfo<User> accessTeacher(User teacher, int pageNum, int pageSize);

    /**
    * @author:  jizhaolun@zto.cn
    * @params:
    * @return:
    * @date:    2019/5/17 22:09
    */
//    PageInfo<User> accessDepManager(User teacher, int pageNum, int pageSize);
}
