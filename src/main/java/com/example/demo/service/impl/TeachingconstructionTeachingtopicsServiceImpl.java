package com.example.demo.service.impl;


import com.example.demo.mapper.TeachingconstructionTeachingtopicsMapper;
import com.example.demo.model.TeachingconstructionTeachingtopics;
import com.example.demo.model.Userinformation;
import com.example.demo.service.TeachingconstructionTeachingtopicsService;
import com.example.demo.service.UserinformationService;
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
public class TeachingconstructionTeachingtopicsServiceImpl implements TeachingconstructionTeachingtopicsService {

    @Autowired
    private TeachingconstructionTeachingtopicsMapper teachingconstructionTeachingtopicsMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teachingconstructionTeachingtopicsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeachingconstructionTeachingtopics record) {
        return teachingconstructionTeachingtopicsMapper.insert(record);
    }

    @Override
    public PageInfo<TeachingconstructionTeachingtopics> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeachingconstructionTeachingtopics> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = teachingconstructionTeachingtopicsMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = teachingconstructionTeachingtopicsMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            TeachingconstructionTeachingtopics teachingconstructionTeachingtopics = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(teachingconstructionTeachingtopics.getClassTeacher());
            teachingconstructionTeachingtopics.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<TeachingconstructionTeachingtopics> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeachingconstructionTeachingtopics> selectByClassTeacher(TeachingconstructionTeachingtopics teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeachingconstructionTeachingtopics> teachings = teachingconstructionTeachingtopicsMapper.selectByClassTeacher(teaching);
        PageInfo<TeachingconstructionTeachingtopics> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeachingconstructionTeachingtopics record) {
        return teachingconstructionTeachingtopicsMapper.updateByPrimaryKey(record);
    }
}
