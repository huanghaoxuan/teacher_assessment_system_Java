package com.example.demo.service.impl;

import com.example.demo.mapper.ScorePatentapplicationMapper;
import com.example.demo.model.ScorePatentapplication;
import com.example.demo.service.ScorePatentapplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/6/1 16:23
 * @Version 1.0
 */
@Service
public class ScorePatentapplicationServiceImpl implements ScorePatentapplicationService {

    @Autowired
    private ScorePatentapplicationMapper scorePatentapplicationMapper;

    @Override
    public ScorePatentapplication selectByPrimaryKey(Integer id) {
        return scorePatentapplicationMapper.selectByPrimaryKey(1);
    }

    @Override
    public int updateByPrimaryKey(ScorePatentapplication record) {
        return scorePatentapplicationMapper.updateByPrimaryKey(record);
    }
}
