package com.example.demo.service.impl;

import com.example.demo.mapper.ScoreNotgovernmentachievementawardMapper;
import com.example.demo.model.ScoreNotgovernmentachievementaward;
import com.example.demo.service.ScoreNotgovernmentachievementawardService;
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
public class ScoreNotgovernmentachievementawardServiceImpl implements ScoreNotgovernmentachievementawardService {

    @Autowired
    private ScoreNotgovernmentachievementawardMapper scoreNotgovernmentachievementawardMapper;

    @Override
    public ScoreNotgovernmentachievementaward selectByPrimaryKey(Integer id) {
        return scoreNotgovernmentachievementawardMapper.selectByPrimaryKey(1);
    }

    @Override
    public int updateByPrimaryKey(ScoreNotgovernmentachievementaward record) {
        return scoreNotgovernmentachievementawardMapper.updateByPrimaryKey(record);
    }
}
