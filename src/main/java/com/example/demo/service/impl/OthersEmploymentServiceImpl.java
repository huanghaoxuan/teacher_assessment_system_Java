package com.example.demo.service.impl;

import com.example.demo.mapper.OthersEmploymentMapper;
import com.example.demo.model.OthersEmployment;
import com.example.demo.service.OthersEmploymentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/29 0:28
 * @Version 1.0
 */
@Service
public class OthersEmploymentServiceImpl implements OthersEmploymentService {

    @Autowired
    private OthersEmploymentMapper othersEmploymentMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return othersEmploymentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OthersEmployment record) {
        return othersEmploymentMapper.insert(record);
    }

    @Override
    public PageInfo<OthersEmployment> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OthersEmployment> teachings = othersEmploymentMapper.selectAll();
        PageInfo<OthersEmployment> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<OthersEmployment> selectByClassTeacher(OthersEmployment teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OthersEmployment> teachings = othersEmploymentMapper.selectByClassTeacher(teaching);
        PageInfo<OthersEmployment> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(OthersEmployment record) {
        return othersEmploymentMapper.updateByPrimaryKey(record);
    }
}
