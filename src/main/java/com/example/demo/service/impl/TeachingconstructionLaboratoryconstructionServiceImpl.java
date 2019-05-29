package com.example.demo.service.impl;

import com.example.demo.mapper.TeachingconstructionLaboratoryconstructionMapper;
import com.example.demo.model.TeachingconstructionLaboratoryconstruction;
import com.example.demo.service.TeachingconstructionLaboratoryconstructionService;
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
public class TeachingconstructionLaboratoryconstructionServiceImpl implements TeachingconstructionLaboratoryconstructionService {

    @Autowired
    private TeachingconstructionLaboratoryconstructionMapper teachingconstructionLaboratoryconstructionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teachingconstructionLaboratoryconstructionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeachingconstructionLaboratoryconstruction record) {
        return teachingconstructionLaboratoryconstructionMapper.insert(record);
    }

    @Override
    public PageInfo<TeachingconstructionLaboratoryconstruction> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeachingconstructionLaboratoryconstruction> teachings = teachingconstructionLaboratoryconstructionMapper.selectAll();
        PageInfo<TeachingconstructionLaboratoryconstruction> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeachingconstructionLaboratoryconstruction> selectByClassTeacher(TeachingconstructionLaboratoryconstruction teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeachingconstructionLaboratoryconstruction> teachings = teachingconstructionLaboratoryconstructionMapper.selectByClassTeacher(teaching);
        PageInfo<TeachingconstructionLaboratoryconstruction> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeachingconstructionLaboratoryconstruction record) {
        return teachingconstructionLaboratoryconstructionMapper.updateByPrimaryKey(record);
    }
}
