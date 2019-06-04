package com.example.demo.service;

import com.example.demo.model.Userinformation;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/30 1:29
 * @Version 1.0
 */
public interface UserinformationService {

    Userinformation selectUserinformation(Userinformation record);

    int updateByPrimaryKey(Userinformation record);

    int updateEmail(Userinformation record);

    int updatename(Userinformation record);

    int getToken(String email);
}
