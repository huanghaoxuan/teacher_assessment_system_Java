package com.example.demo.service.impl;

import com.example.demo.mapper.ScientificresearchPatentapplicationMapper;
import com.example.demo.model.ScientificresearchPatentapplication;
import com.example.demo.service.ScientificresearchPatentapplicationService;
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
public class ScientificresearchPatentapplicationServiceImpl implements ScientificresearchPatentapplicationService {

    @Autowired
    private ScientificresearchPatentapplicationMapper scientificresearchPatentapplicationMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return scientificresearchPatentapplicationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ScientificresearchPatentapplication record) {
        return scientificresearchPatentapplicationMapper.insert(record);
    }

    @Override
    public PageInfo<ScientificresearchPatentapplication> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ScientificresearchPatentapplication> teachings = scientificresearchPatentapplicationMapper.selectAll();
        PageInfo<ScientificresearchPatentapplication> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<ScientificresearchPatentapplication> selectByClassTeacher(ScientificresearchPatentapplication teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ScientificresearchPatentapplication> teachings = scientificresearchPatentapplicationMapper.selectByClassTeacher(teaching);
        PageInfo<ScientificresearchPatentapplication> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(ScientificresearchPatentapplication record) {
        return scientificresearchPatentapplicationMapper.updateByPrimaryKey(record);
    }
}
