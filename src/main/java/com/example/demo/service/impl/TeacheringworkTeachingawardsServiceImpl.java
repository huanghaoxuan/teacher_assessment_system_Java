package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkTeachingawardsMapper;
import com.example.demo.model.TeacheringworkTeachingawards;
import com.example.demo.service.TeacheringworkTeachingawardsService;
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
public class TeacheringworkTeachingawardsServiceImpl implements TeacheringworkTeachingawardsService {

    @Autowired
    private TeacheringworkTeachingawardsMapper teacheringworkTeachingawardsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkTeachingawardsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkTeachingawards record) {
        return teacheringworkTeachingawardsMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkTeachingawards> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkTeachingawards> teachings = teacheringworkTeachingawardsMapper.selectAll();
        PageInfo<TeacheringworkTeachingawards> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkTeachingawards> selectByClassTeacher(TeacheringworkTeachingawards teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeacheringworkTeachingawards> teachings = teacheringworkTeachingawardsMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkTeachingawards> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkTeachingawards record) {
        return teacheringworkTeachingawardsMapper.updateByPrimaryKey(record);
    }
}
