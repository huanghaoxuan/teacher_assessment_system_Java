package com.example.demo.service.impl;

import com.example.demo.mapper.ScoreGuidecontestMapper;
import com.example.demo.model.ScoreGuidecontest;
import com.example.demo.service.ScoreGuidecontestService;
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
public class ScoreGuidecontestServiceImpl implements ScoreGuidecontestService {

    @Autowired
    private ScoreGuidecontestMapper scoreGuidecontestMapper;

    @Override
    public ScoreGuidecontest selectByPrimaryKey(Integer id) {
        return scoreGuidecontestMapper.selectByPrimaryKey(1);
    }

    @Override
    public int updateByPrimaryKey(ScoreGuidecontest record) {
        return scoreGuidecontestMapper.updateByPrimaryKey(record);
    }
}
