package com.example.demo.service.impl;

import com.example.demo.mapper.ScoreGovernmentachievementawardMapper;
import com.example.demo.model.ScoreGovernmentachievementaward;
import com.example.demo.service.ScoreGovernmentachievementawardService;
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
public class ScoreGovernmentachievementawardServiceImpl implements ScoreGovernmentachievementawardService {

    @Autowired
    private ScoreGovernmentachievementawardMapper scoreGovernmentachievementawardMapper;

    @Override
    public ScoreGovernmentachievementaward selectByPrimaryKey(Integer id) {
        return scoreGovernmentachievementawardMapper.selectByPrimaryKey(1);
    }

    @Override
    public int updateByPrimaryKey(ScoreGovernmentachievementaward record) {
        return scoreGovernmentachievementawardMapper.updateByPrimaryKey(record);
    }
}
