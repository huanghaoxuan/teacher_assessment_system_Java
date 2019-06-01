package com.example.demo.service.impl;

import com.example.demo.mapper.ScorePublishpaperMapper;
import com.example.demo.model.ScorePublishpaper;
import com.example.demo.service.ScorePublishpaperService;
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
public class ScorePublishpaperServiceImpl implements ScorePublishpaperService {

    @Autowired
    private ScorePublishpaperMapper scorePublishpaperMapper;

    @Override
    public ScorePublishpaper selectByPrimaryKey(Integer id) {
        return scorePublishpaperMapper.selectByPrimaryKey(1);
    }

    @Override
    public int updateByPrimaryKey(ScorePublishpaper record) {
        return scorePublishpaperMapper.updateByPrimaryKey(record);
    }
}
