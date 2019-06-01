package com.example.demo.service.impl;

import com.example.demo.mapper.ScoreContestawardMapper;
import com.example.demo.model.ScoreContestaward;
import com.example.demo.service.ScoreContestawardService;
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
public class ScoreContestawardServiceImpl implements ScoreContestawardService {

    @Autowired
    private ScoreContestawardMapper scoreContestawardMapper;

    @Override
    public ScoreContestaward selectByPrimaryKey(Integer id) {
        return scoreContestawardMapper.selectByPrimaryKey(1);
    }

    @Override
    public int updateByPrimaryKey(ScoreContestaward record) {
        return scoreContestawardMapper.updateByPrimaryKey(record);
    }
}
