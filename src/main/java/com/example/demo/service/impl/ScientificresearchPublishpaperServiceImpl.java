package com.example.demo.service.impl;

import com.example.demo.mapper.ScientificresearchPublishpaperMapper;
import com.example.demo.model.ScientificresearchPublishpaper;
import com.example.demo.service.ScientificresearchPublishpaperService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/29 9:42
 * @Version 1.0
 */

@Service
public class ScientificresearchPublishpaperServiceImpl implements ScientificresearchPublishpaperService {

    @Autowired
    private ScientificresearchPublishpaperMapper pcientificresearchPublishpaperMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return pcientificresearchPublishpaperMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ScientificresearchPublishpaper record) {
        return pcientificresearchPublishpaperMapper.insert(record);
    }

    @Override
    public PageInfo<ScientificresearchPublishpaper> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ScientificresearchPublishpaper> teachings = pcientificresearchPublishpaperMapper.selectAll();
        PageInfo<ScientificresearchPublishpaper> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<ScientificresearchPublishpaper> selectByClassTeacher(ScientificresearchPublishpaper teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<ScientificresearchPublishpaper> teachings = pcientificresearchPublishpaperMapper.selectByClassTeacher(teaching);
        PageInfo<ScientificresearchPublishpaper> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(ScientificresearchPublishpaper record) {
        return pcientificresearchPublishpaperMapper.updateByPrimaryKey(record);
    }
}
