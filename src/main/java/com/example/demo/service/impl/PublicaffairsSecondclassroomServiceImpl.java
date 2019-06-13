package com.example.demo.service.impl;

import com.example.demo.mapper.PublicaffairsSecondclassroomMapper;
import com.example.demo.model.PublicaffairsSecondclassroom;
import com.example.demo.model.Userinformation;
import com.example.demo.service.PublicaffairsSecondclassroomService;
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
public class PublicaffairsSecondclassroomServiceImpl implements PublicaffairsSecondclassroomService {

    @Autowired
    private PublicaffairsSecondclassroomMapper publicaffairsSecondclassroomMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return publicaffairsSecondclassroomMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PublicaffairsSecondclassroom record) {
        return publicaffairsSecondclassroomMapper.insert(record);
    }

    @Override
    public PageInfo<PublicaffairsSecondclassroom> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<PublicaffairsSecondclassroom> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = publicaffairsSecondclassroomMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = publicaffairsSecondclassroomMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            PublicaffairsSecondclassroom publicaffairsSecondclassroom = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(publicaffairsSecondclassroom.getClassTeacher());
            publicaffairsSecondclassroom.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<PublicaffairsSecondclassroom> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<PublicaffairsSecondclassroom> selectByClassTeacher(PublicaffairsSecondclassroom teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<PublicaffairsSecondclassroom> teachings = publicaffairsSecondclassroomMapper.selectByClassTeacher(teaching);
        PageInfo<PublicaffairsSecondclassroom> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(PublicaffairsSecondclassroom record) {
        return publicaffairsSecondclassroomMapper.updateByPrimaryKey(record);
    }
}
