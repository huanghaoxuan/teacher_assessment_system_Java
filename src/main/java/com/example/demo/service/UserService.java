package com.example.demo.service;


import com.github.pagehelper.PageInfo;
import com.example.demo.model.User;
public interface UserService {

    /**
    * @author:  jizhaolun@zto.cn
    * @params:
    * @return:  List
    * @date:    2019/4/17 9:57
    */
    PageInfo<User> selectAllUser(int pageNum, int pageSize);

}
