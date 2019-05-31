package com.example.demo.service.impl;

import com.example.demo.mapper.ScientificresearchLongitudinaltopicsprojectMapper;
import com.example.demo.model.ScientificresearchLongitudinaltopicsproject;
import com.example.demo.service.ScientificresearchLongitudinaltopicsprojectService;
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
public class ScientificresearchLongitudinaltopicsprojectServiceImpl implements ScientificresearchLongitudinaltopicsprojectService {

    @Autowired
    private ScientificresearchLongitudinaltopicsprojectMapper scientificresearchLongitudinaltopicsprojectMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return scientificresearchLongitudinaltopicsprojectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ScientificresearchLongitudinaltopicsproject record) {
        return scientificresearchLongitudinaltopicsprojectMapper.insert(record);
    }

    @Override
    public PageInfo<ScientificresearchLongitudinaltopicsproject> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ScientificresearchLongitudinaltopicsproject> teachings = scientificresearchLongitudinaltopicsprojectMapper.selectAll();
        PageInfo<ScientificresearchLongitudinaltopicsproject> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<ScientificresearchLongitudinaltopicsproject> selectByClassTeacher(ScientificresearchLongitudinaltopicsproject teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<ScientificresearchLongitudinaltopicsproject> teachings = scientificresearchLongitudinaltopicsprojectMapper.selectByClassTeacher(teaching);
        PageInfo<ScientificresearchLongitudinaltopicsproject> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(ScientificresearchLongitudinaltopicsproject record) {
        return scientificresearchLongitudinaltopicsprojectMapper.updateByPrimaryKey(record);
    }
}
