package com.example.demo.service.impl;

import com.example.demo.mapper.UserinformationMapper;
import com.example.demo.model.Userinformation;
import com.example.demo.service.UserinformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/30 1:31
 * @Version 1.0
 */

@Service
public class UserinformationServiceImpl implements UserinformationService {

    @Autowired
    private UserinformationMapper userinformationMapper;


    @Override
    public Userinformation selectUserinformation(Userinformation record) {
        return userinformationMapper.selectByClassTeacher(record).get(0);
    }

    @Override
    public int updateByPrimaryKey(Userinformation record) {
        return userinformationMapper.updateByPrimaryKey(record);
    }
}
