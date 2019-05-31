package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkGuidecontestMapper;
import com.example.demo.model.TeacheringworkGuidecontest;
import com.example.demo.service.TeacheringworkGuidecontestService;
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
public class TeacheringworkGuidecontestServiceImpl implements TeacheringworkGuidecontestService {

    @Autowired
    private TeacheringworkGuidecontestMapper teacheringworkGuidecontestMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkGuidecontestMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkGuidecontest record) {
        return teacheringworkGuidecontestMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkGuidecontest> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkGuidecontest> teachings = teacheringworkGuidecontestMapper.selectAll();
        PageInfo<TeacheringworkGuidecontest> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkGuidecontest> selectByClassTeacher(TeacheringworkGuidecontest teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeacheringworkGuidecontest> teachings = teacheringworkGuidecontestMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkGuidecontest> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkGuidecontest record) {
        return teacheringworkGuidecontestMapper.updateByPrimaryKey(record);
    }
}
