package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkClassroomteachingMapper;
import com.example.demo.model.TeacheringworkClassroomteaching;
import com.example.demo.model.Userinformation;
import com.example.demo.service.TeacheringworkClassroomteachingService;
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
public class TeacheringworkClassroomteachingServiceImpl implements TeacheringworkClassroomteachingService {

    @Autowired
    private TeacheringworkClassroomteachingMapper teacheringworkClassroomteachingMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkClassroomteachingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkClassroomteaching record) {
        return teacheringworkClassroomteachingMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkClassroomteaching> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkClassroomteaching> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = teacheringworkClassroomteachingMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = teacheringworkClassroomteachingMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            TeacheringworkClassroomteaching teacheringworkClassroomteaching = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(teacheringworkClassroomteaching.getClassTeacher());
            teacheringworkClassroomteaching.setClassTeacherName(userinformationService.selectUserinformation(userinformation).getName());
        }
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
