package com.example.demo.service.impl;

import com.example.demo.mapper.TeachingconstructionCurriculumconstructionMapper;
import com.example.demo.model.TeachingconstructionCurriculumconstruction;
import com.example.demo.service.TeachingconstructionCurriculumconstructionService;
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
public class TeachingconstructionCurriculumconstructionServiceImpl implements TeachingconstructionCurriculumconstructionService {

    @Autowired
    private TeachingconstructionCurriculumconstructionMapper teachingconstructionCurriculumconstructionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teachingconstructionCurriculumconstructionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeachingconstructionCurriculumconstruction record) {
        return teachingconstructionCurriculumconstructionMapper.insert(record);
    }

    @Override
    public PageInfo<TeachingconstructionCurriculumconstruction> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeachingconstructionCurriculumconstruction> teachings = teachingconstructionCurriculumconstructionMapper.selectAll();
        PageInfo<TeachingconstructionCurriculumconstruction> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeachingconstructionCurriculumconstruction> selectByClassTeacher(TeachingconstructionCurriculumconstruction teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeachingconstructionCurriculumconstruction> teachings = teachingconstructionCurriculumconstructionMapper.selectByClassTeacher(teaching);
        PageInfo<TeachingconstructionCurriculumconstruction> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeachingconstructionCurriculumconstruction record) {
        return teachingconstructionCurriculumconstructionMapper.updateByPrimaryKey(record);
    }
}
