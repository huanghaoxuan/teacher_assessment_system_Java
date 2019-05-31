package com.example.demo.service.impl;

import com.example.demo.mapper.TeachingconstructionTextbookconstructionMapper;
import com.example.demo.model.TeachingconstructionTextbookconstruction;
import com.example.demo.service.TeachingconstructionTextbookconstructionService;
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
public class TeachingconstructionTextbookconstructionServiceImpl implements TeachingconstructionTextbookconstructionService {

    @Autowired
    private TeachingconstructionTextbookconstructionMapper teachingconstructionTextbookconstructionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teachingconstructionTextbookconstructionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeachingconstructionTextbookconstruction record) {
        return teachingconstructionTextbookconstructionMapper.insert(record);
    }

    @Override
    public PageInfo<TeachingconstructionTextbookconstruction> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeachingconstructionTextbookconstruction> teachings = teachingconstructionTextbookconstructionMapper.selectAll();
        PageInfo<TeachingconstructionTextbookconstruction> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeachingconstructionTextbookconstruction> selectByClassTeacher(TeachingconstructionTextbookconstruction teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeachingconstructionTextbookconstruction> teachings = teachingconstructionTextbookconstructionMapper.selectByClassTeacher(teaching);
        PageInfo<TeachingconstructionTextbookconstruction> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeachingconstructionTextbookconstruction record) {
        return teachingconstructionTextbookconstructionMapper.updateByPrimaryKey(record);
    }
}
