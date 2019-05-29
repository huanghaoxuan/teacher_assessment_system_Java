package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkInternshipguideMapper;
import com.example.demo.model.TeacheringworkInternshipguide;
import com.example.demo.service.TeacheringworkInternshipguideService;
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
public class TeacheringworkInternshipguideServiceImpl implements TeacheringworkInternshipguideService {

    @Autowired
    private TeacheringworkInternshipguideMapper teacheringworkInternshipguideMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkInternshipguideMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkInternshipguide record) {
        return teacheringworkInternshipguideMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkInternshipguide> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkInternshipguide> teachings = teacheringworkInternshipguideMapper.selectAll();
        PageInfo<TeacheringworkInternshipguide> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkInternshipguide> selectByClassTeacher(TeacheringworkInternshipguide teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkInternshipguide> teachings = teacheringworkInternshipguideMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkInternshipguide> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkInternshipguide record) {
        return teacheringworkInternshipguideMapper.updateByPrimaryKey(record);
    }
}
