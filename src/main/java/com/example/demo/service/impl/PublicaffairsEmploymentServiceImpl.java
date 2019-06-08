package com.example.demo.service.impl;

import com.example.demo.mapper.PublicaffairsEmploymentMapper;
import com.example.demo.model.PublicaffairsEmployment;
import com.example.demo.model.Userinformation;
import com.example.demo.service.PublicaffairsEmploymentService;
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
public class PublicaffairsEmploymentServiceImpl implements PublicaffairsEmploymentService {

    @Autowired
    private PublicaffairsEmploymentMapper publicaffairsEmploymentMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return publicaffairsEmploymentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PublicaffairsEmployment record) {
        return publicaffairsEmploymentMapper.insert(record);
    }

    @Override
    public PageInfo<PublicaffairsEmployment> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<PublicaffairsEmployment> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = publicaffairsEmploymentMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = publicaffairsEmploymentMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            PublicaffairsEmployment publicaffairsEmployment = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(publicaffairsEmployment.getClassTeacher());
            publicaffairsEmployment.setClassTeacherName(userinformationService.selectUserinformation(userinformation).getName());
        }
        PageInfo<PublicaffairsEmployment> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<PublicaffairsEmployment> selectByClassTeacher(PublicaffairsEmployment teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<PublicaffairsEmployment> teachings = publicaffairsEmploymentMapper.selectByClassTeacher(teaching);
        PageInfo<PublicaffairsEmployment> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(PublicaffairsEmployment record) {
        return publicaffairsEmploymentMapper.updateByPrimaryKey(record);
    }
}
