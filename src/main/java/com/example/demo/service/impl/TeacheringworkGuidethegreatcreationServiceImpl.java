package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkGuidethegreatcreationMapper;
import com.example.demo.model.TeacheringworkGuidethegreatcreation;
import com.example.demo.service.TeacheringworkGuidethegreatcreationService;
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
public class TeacheringworkGuidethegreatcreationServiceImpl implements TeacheringworkGuidethegreatcreationService {

    @Autowired
    private TeacheringworkGuidethegreatcreationMapper teacheringworkGuidethegreatcreationMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkGuidethegreatcreationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkGuidethegreatcreation record) {
        return teacheringworkGuidethegreatcreationMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkGuidethegreatcreation> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkGuidethegreatcreation> teachings = teacheringworkGuidethegreatcreationMapper.selectAll();
        PageInfo<TeacheringworkGuidethegreatcreation> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkGuidethegreatcreation> selectByClassTeacher(TeacheringworkGuidethegreatcreation teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeacheringworkGuidethegreatcreation> teachings = teacheringworkGuidethegreatcreationMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkGuidethegreatcreation> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkGuidethegreatcreation record) {
        return teacheringworkGuidethegreatcreationMapper.updateByPrimaryKey(record);
    }
}
