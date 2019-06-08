package com.example.demo.service.impl;


import com.example.demo.mapper.TeachingconstructionTeachingactivitiesMapper;
import com.example.demo.model.TeachingconstructionTeachingactivities;
import com.example.demo.model.Userinformation;
import com.example.demo.service.TeachingconstructionTeachingactivitiesService;
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
public class TeachingconstructionTeachingactivitiesServiceImpl implements TeachingconstructionTeachingactivitiesService {

    @Autowired
    private TeachingconstructionTeachingactivitiesMapper teachingconstructionTeachingactivitiesMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teachingconstructionTeachingactivitiesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeachingconstructionTeachingactivities record) {
        return teachingconstructionTeachingactivitiesMapper.insert(record);
    }

    @Override
    public PageInfo<TeachingconstructionTeachingactivities> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeachingconstructionTeachingactivities> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = teachingconstructionTeachingactivitiesMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = teachingconstructionTeachingactivitiesMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            TeachingconstructionTeachingactivities teachingconstructionTeachingactivities = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(teachingconstructionTeachingactivities.getClassTeacher());
            teachingconstructionTeachingactivities.setClassTeacherName(userinformationService.selectUserinformation(userinformation).getName());
        }
        PageInfo<TeachingconstructionTeachingactivities> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeachingconstructionTeachingactivities> selectByClassTeacher(TeachingconstructionTeachingactivities teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeachingconstructionTeachingactivities> teachings = teachingconstructionTeachingactivitiesMapper.selectByClassTeacher(teaching);
        PageInfo<TeachingconstructionTeachingactivities> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeachingconstructionTeachingactivities record) {
        return teachingconstructionTeachingactivitiesMapper.updateByPrimaryKey(record);
    }
}
