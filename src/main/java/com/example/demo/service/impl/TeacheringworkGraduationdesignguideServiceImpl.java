package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkGraduationdesignguideMapper;
import com.example.demo.model.TeacheringworkGraduationdesignguide;
import com.example.demo.service.TeacheringworkGraduationdesignguideService;
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
public class TeacheringworkGraduationdesignguideServiceImpl implements TeacheringworkGraduationdesignguideService {

    @Autowired
    private TeacheringworkGraduationdesignguideMapper teacheringworkGraduationdesignguideMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkGraduationdesignguideMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkGraduationdesignguide record) {
        return teacheringworkGraduationdesignguideMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkGraduationdesignguide> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkGraduationdesignguide> teachings = teacheringworkGraduationdesignguideMapper.selectAll();
        PageInfo<TeacheringworkGraduationdesignguide> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkGraduationdesignguide> selectByClassTeacher(TeacheringworkGraduationdesignguide teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeacheringworkGraduationdesignguide> teachings = teacheringworkGraduationdesignguideMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkGraduationdesignguide> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkGraduationdesignguide record) {
        return teacheringworkGraduationdesignguideMapper.updateByPrimaryKey(record);
    }
}
