package com.example.demo.service.impl;

import com.example.demo.mapper.ScoreLongitudinaltopicsprojectMapper;
import com.example.demo.model.ScoreLongitudinaltopicsproject;
import com.example.demo.service.ScoreLongitudinaltopicsprojectService;
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
public class ScoreLongitudinaltopicsprojectServiceImpl implements ScoreLongitudinaltopicsprojectService {

    @Autowired
    private ScoreLongitudinaltopicsprojectMapper scoreLongitudinaltopicsprojectMapper;

    @Override
    public ScoreLongitudinaltopicsproject selectByPrimaryKey(Integer id) {
        return scoreLongitudinaltopicsprojectMapper.selectByPrimaryKey(1);
    }

    @Override
    public int updateByPrimaryKey(ScoreLongitudinaltopicsproject record) {
        return scoreLongitudinaltopicsprojectMapper.updateByPrimaryKey(record);
    }
}
