package com.example.demo.service.impl;

import com.example.demo.mapper.TeachingconstructionCurriculumconstructionMapper;
import com.example.demo.model.TeachingconstructionCurriculumconstruction;
import com.example.demo.model.Userinformation;
import com.example.demo.service.TeachingconstructionCurriculumconstructionService;
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
public class TeachingconstructionCurriculumconstructionServiceImpl implements TeachingconstructionCurriculumconstructionService {

    @Autowired
    private TeachingconstructionCurriculumconstructionMapper teachingconstructionCurriculumconstructionMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teachingconstructionCurriculumconstructionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeachingconstructionCurriculumconstruction record) {
        return teachingconstructionCurriculumconstructionMapper.insert(record);
    }

    @Override
    public PageInfo<TeachingconstructionCurriculumconstruction> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeachingconstructionCurriculumconstruction> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = teachingconstructionCurriculumconstructionMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = teachingconstructionCurriculumconstructionMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            TeachingconstructionCurriculumconstruction teachingconstructionCurriculumconstruction = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(teachingconstructionCurriculumconstruction.getClassTeacher());
            teachingconstructionCurriculumconstruction.setClassTeacherName(userinformationService.selectUserinformation(userinformation).getName());
        }
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
