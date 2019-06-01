package com.example.demo.service.impl;

import com.example.demo.mapper.ScoreHorizontaltopicprojectsMapper;
import com.example.demo.model.ScoreHorizontaltopicprojects;
import com.example.demo.service.ScoreHorizontaltopicprojectsService;
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
public class ScoreHorizontaltopicprojectsServiceImpl implements ScoreHorizontaltopicprojectsService {

    @Autowired
    private ScoreHorizontaltopicprojectsMapper scoreHorizontaltopicprojectsMapper;

    @Override
    public ScoreHorizontaltopicprojects selectByPrimaryKey(Integer id) {
        return scoreHorizontaltopicprojectsMapper.selectByPrimaryKey(1);
    }

    @Override
    public int updateByPrimaryKey(ScoreHorizontaltopicprojects record) {
        return scoreHorizontaltopicprojectsMapper.updateByPrimaryKey(record);
    }
}
