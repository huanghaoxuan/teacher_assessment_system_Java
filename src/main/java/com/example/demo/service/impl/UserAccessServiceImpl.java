package com.example.demo.service.impl;

import com.example.demo.mapper.UserAccessMapper;
import com.example.demo.mapper.UserinformationMapper;
import com.example.demo.model.UserAccess;
import com.example.demo.model.Userinformation;
import com.example.demo.service.UserAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/30 0:32
 * @Version 1.0
 */

@Service
public class UserAccessServiceImpl implements UserAccessService {

    @Autowired
    private UserinformationMapper userinformationMapper;

    @Autowired
    private UserAccessMapper userAccessMapper;

    @Override
    public int insert(UserAccess record) {
        if (userAccessMapper.selectByName(record).isEmpty()) {
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(record.getAccess_name());
            userinformationMapper.insert(userinformation);
            return userAccessMapper.insert(record);
        } else {
            return 0;
        }
    }

    @Override
    public int updateIdentity(UserAccess record) {
        return userAccessMapper.updateIdentity(record);
    }

    @Override
    public int selectByNamePassword(UserAccess record) {
        List<UserAccess> userAccesses = userAccessMapper.selectByNamePassword(record);
        if (userAccesses.isEmpty()) {
            return 0;
        } else {
            return userAccesses.get(0).getAccess_identity();
        }
    }
}
