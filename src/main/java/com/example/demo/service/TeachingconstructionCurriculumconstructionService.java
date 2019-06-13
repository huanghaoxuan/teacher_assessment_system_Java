package com.example.demo.service;

import com.example.demo.model.TeachingconstructionCurriculumconstruction;
import com.example.demo.model.Userinformation;
import com.github.pagehelper.PageInfo;

public interface TeachingconstructionCurriculumconstructionService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachingconstructionCurriculumconstruction record);

    PageInfo<TeachingconstructionCurriculumconstruction> selectAll(int pageNum, int pageSize, Userinformation record);

    PageInfo<TeachingconstructionCurriculumconstruction> selectByClassTeacher(TeachingconstructionCurriculumconstruction teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(TeachingconstructionCurriculumconstruction record);
}