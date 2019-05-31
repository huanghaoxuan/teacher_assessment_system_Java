package com.example.demo.service.impl;

import com.example.demo.mapper.PublicaffairsEmploymentMapper;
import com.example.demo.model.PublicaffairsEmployment;
import com.example.demo.service.PublicaffairsEmploymentService;
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
public class PublicaffairsEmploymentServiceImpl implements PublicaffairsEmploymentService {

    @Autowired
    private PublicaffairsEmploymentMapper publicaffairsEmploymentMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return publicaffairsEmploymentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PublicaffairsEmployment record) {
        return publicaffairsEmploymentMapper.insert(record);
    }

    @Override
    public PageInfo<PublicaffairsEmployment> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PublicaffairsEmployment> teachings = publicaffairsEmploymentMapper.selectAll();
        PageInfo<PublicaffairsEmployment> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<PublicaffairsEmployment> selectByClassTeacher(PublicaffairsEmployment teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<PublicaffairsEmployment> teachings = publicaffairsEmploymentMapper.selectByClassTeacher(teaching);
        PageInfo<PublicaffairsEmployment> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(PublicaffairsEmployment record) {
        return publicaffairsEmploymentMapper.updateByPrimaryKey(record);
    }
}
