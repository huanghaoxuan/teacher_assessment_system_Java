package com.example.demo.service;

import com.example.demo.model.TeachingconstructionLaboratoryconstruction;
import com.github.pagehelper.PageInfo;

public interface TeachingconstructionLaboratoryconstructionService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingconstructionLaboratoryconstruction record);

    PageInfo<TeachingconstructionLaboratoryconstruction> selectAll(int pageNum, int pageSize, String departmentDept);

    PageInfo<TeachingconstructionLaboratoryconstruction> selectByClassTeacher(TeachingconstructionLaboratoryconstruction teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeachingconstructionLaboratoryconstruction record);
}