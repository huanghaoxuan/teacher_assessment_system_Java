package com.example.demo.mapper;

import com.example.demo.model.TeachingconstructionCurriculumconstruction;

import java.util.List;

public interface TeachingconstructionCurriculumconstructionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingconstructionCurriculumconstruction record);

    TeachingconstructionCurriculumconstruction selectByPrimaryKey(Integer id);

    List<TeachingconstructionCurriculumconstruction> selectAll();

    int updateByPrimaryKey(TeachingconstructionCurriculumconstruction record);

    List<TeachingconstructionCurriculumconstruction> selectByClassTeacher(TeachingconstructionCurriculumconstruction record);
}