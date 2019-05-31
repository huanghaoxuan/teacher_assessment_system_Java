package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkClassroomteachingMapper;
import com.example.demo.model.TeacheringworkClassroomteaching;
import com.example.demo.service.TeacheringworkClassroomteachingService;
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
public class TeacheringworkClassroomteachingServiceImpl implements TeacheringworkClassroomteachingService {

    @Autowired
    private TeacheringworkClassroomteachingMapper teacheringworkClassroomteachingMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkClassroomteachingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkClassroomteaching record) {
        return teacheringworkClassroomteachingMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkClassroomteaching> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkClassroomteaching> teachings = teacheringworkClassroomteachingMapper.selectAll();
        PageInfo<TeacheringworkClassroomteaching> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkClassroomteaching> selectByClassTeacher(TeacheringworkClassroomteaching teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeacheringworkClassroomteaching> teachings = teacheringworkClassroomteachingMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkClassroomteaching> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkClassroomteaching record) {
        return teacheringworkClassroomteachingMapper.updateByPrimaryKey(record);
    }
}
