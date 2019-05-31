package com.example.demo.service.impl;

import com.example.demo.mapper.ScientificresearchHorizontaltopicprojectsMapper;
import com.example.demo.model.ScientificresearchHorizontaltopicprojects;
import com.example.demo.service.ScientificresearchHorizontaltopicprojectsService;
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
public class ScientificresearchHorizontaltopicprojectsServiceImpl implements ScientificresearchHorizontaltopicprojectsService {

    @Autowired
    private ScientificresearchHorizontaltopicprojectsMapper scientificresearchHorizontaltopicprojectsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return scientificresearchHorizontaltopicprojectsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ScientificresearchHorizontaltopicprojects record) {
        return scientificresearchHorizontaltopicprojectsMapper.insert(record);
    }

    @Override
    public PageInfo<ScientificresearchHorizontaltopicprojects> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ScientificresearchHorizontaltopicprojects> teachings = scientificresearchHorizontaltopicprojectsMapper.selectAll();
        PageInfo<ScientificresearchHorizontaltopicprojects> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<ScientificresearchHorizontaltopicprojects> selectByClassTeacher(ScientificresearchHorizontaltopicprojects teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<ScientificresearchHorizontaltopicprojects> teachings = scientificresearchHorizontaltopicprojectsMapper.selectByClassTeacher(teaching);
        PageInfo<ScientificresearchHorizontaltopicprojects> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(ScientificresearchHorizontaltopicprojects record) {
        return scientificresearchHorizontaltopicprojectsMapper.updateByPrimaryKey(record);
    }
}
