package com.example.demo.service.impl;

import com.example.demo.mapper.PublicaffairsAdmissionsMapper;
import com.example.demo.model.PublicaffairsAdmissions;
import com.example.demo.model.Userinformation;
import com.example.demo.service.PublicaffairsAdmissionsService;
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
 * @Date: 2019/5/29 9:01
 * @Version 1.0
 */

@Service
public class PublicaffairsAdmissionsServiceImpl implements PublicaffairsAdmissionsService {

    @Autowired
    private PublicaffairsAdmissionsMapper publicaffairsAdmissionsMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return publicaffairsAdmissionsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PublicaffairsAdmissions record) {
        return publicaffairsAdmissionsMapper.insert(record);
    }

    @Override
    public PageInfo<PublicaffairsAdmissions> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<PublicaffairsAdmissions> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = publicaffairsAdmissionsMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = publicaffairsAdmissionsMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            PublicaffairsAdmissions publicaffairsAdmissions = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(publicaffairsAdmissions.getClassTeacher());
            publicaffairsAdmissions.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<PublicaffairsAdmissions> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<PublicaffairsAdmissions> selectByClassTeacher(PublicaffairsAdmissions teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<PublicaffairsAdmissions> teachings = publicaffairsAdmissionsMapper.selectByClassTeacher(teaching);
        PageInfo<PublicaffairsAdmissions> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(PublicaffairsAdmissions record) {
        return publicaffairsAdmissionsMapper.updateByPrimaryKey(record);
    }
}
