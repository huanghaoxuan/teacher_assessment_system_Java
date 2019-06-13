package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkPracticaltrainingguidanceMapper;
import com.example.demo.model.TeacheringworkPracticaltrainingguidance;
import com.example.demo.model.Userinformation;
import com.example.demo.service.TeacheringworkPracticaltrainingguidanceService;
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
public class TeacheringworkPracticaltrainingguidanceServiceImpl implements TeacheringworkPracticaltrainingguidanceService {

    @Autowired
    private TeacheringworkPracticaltrainingguidanceMapper teacheringworkPracticaltrainingguidanceMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkPracticaltrainingguidanceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkPracticaltrainingguidance record) {
        return teacheringworkPracticaltrainingguidanceMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkPracticaltrainingguidance> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkPracticaltrainingguidance> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = teacheringworkPracticaltrainingguidanceMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = teacheringworkPracticaltrainingguidanceMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            TeacheringworkPracticaltrainingguidance teacheringworkPracticaltrainingguidance = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(teacheringworkPracticaltrainingguidance.getClassTeacher());
            teacheringworkPracticaltrainingguidance.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<TeacheringworkPracticaltrainingguidance> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkPracticaltrainingguidance> selectByClassTeacher(TeacheringworkPracticaltrainingguidance teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeacheringworkPracticaltrainingguidance> teachings = teacheringworkPracticaltrainingguidanceMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkPracticaltrainingguidance> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkPracticaltrainingguidance record) {
        return teacheringworkPracticaltrainingguidanceMapper.updateByPrimaryKey(record);
    }
}
