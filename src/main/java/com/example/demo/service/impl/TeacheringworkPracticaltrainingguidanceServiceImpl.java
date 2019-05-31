package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkPracticaltrainingguidanceMapper;
import com.example.demo.model.TeacheringworkPracticaltrainingguidance;
import com.example.demo.service.TeacheringworkPracticaltrainingguidanceService;
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
public class TeacheringworkPracticaltrainingguidanceServiceImpl implements TeacheringworkPracticaltrainingguidanceService {

    @Autowired
    private TeacheringworkPracticaltrainingguidanceMapper teacheringworkPracticaltrainingguidanceMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkPracticaltrainingguidanceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkPracticaltrainingguidance record) {
        return teacheringworkPracticaltrainingguidanceMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkPracticaltrainingguidance> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkPracticaltrainingguidance> teachings = teacheringworkPracticaltrainingguidanceMapper.selectAll();
        PageInfo<TeacheringworkPracticaltrainingguidance> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkPracticaltrainingguidance> selectByClassTeacher(TeacheringworkPracticaltrainingguidance teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeacheringworkPracticaltrainingguidance> teachings = teacheringworkPracticaltrainingguidanceMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkPracticaltrainingguidance> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkPracticaltrainingguidance record) {
        return teacheringworkPracticaltrainingguidanceMapper.updateByPrimaryKey(record);
    }
}
