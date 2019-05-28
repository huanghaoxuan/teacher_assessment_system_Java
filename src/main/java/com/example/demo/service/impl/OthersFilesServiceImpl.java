package com.example.demo.service.impl;

import com.example.demo.mapper.OthersFilesMapper;
import com.example.demo.model.OthersComprehensiveawardwinning;
import com.example.demo.model.OthersFiles;
import com.example.demo.service.OthersFilesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/28 23:44
 * @Version 1.0
 */

@Service
public class OthersFilesServiceImpl implements OthersFilesService {

    @Autowired
    private OthersFilesMapper othersFilesMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return othersFilesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OthersFiles record) {
        return othersFilesMapper.insert(record);
    }

    @Override
    public PageInfo<OthersFiles> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OthersFiles> teachings = othersFilesMapper.selectAll();
        PageInfo<OthersFiles> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<OthersFiles> selectByClassTeacher(OthersFiles teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OthersFiles> teachings = othersFilesMapper.selectByClassTeacher(teaching);
        PageInfo<OthersFiles> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(OthersFiles record) {
        return othersFilesMapper.updateByPrimaryKey(record);
    }
}
