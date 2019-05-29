package com.example.demo.mapper;

import com.example.demo.model.TeachingconstructionLaboratoryconstruction;

import java.util.List;

public interface TeachingconstructionLaboratoryconstructionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingconstructionLaboratoryconstruction record);

    TeachingconstructionLaboratoryconstruction selectByPrimaryKey(Integer id);

    List<TeachingconstructionLaboratoryconstruction> selectAll();

    int updateByPrimaryKey(TeachingconstructionLaboratoryconstruction record);

    List<TeachingconstructionLaboratoryconstruction> selectByClassTeacher(TeachingconstructionLaboratoryconstruction record);
}