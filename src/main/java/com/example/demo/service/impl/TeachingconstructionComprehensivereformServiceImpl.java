package com.example.demo.service.impl;

import com.example.demo.mapper.TeachingconstructionComprehensivereformMapper;
import com.example.demo.model.TeachingconstructionComprehensivereform;
import com.example.demo.model.Userinformation;
import com.example.demo.service.TeachingconstructionComprehensivereformService;
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
public class TeachingconstructionComprehensivereformServiceImpl implements TeachingconstructionComprehensivereformService {

    @Autowired
    private TeachingconstructionComprehensivereformMapper teachingconstructionComprehensivereformMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teachingconstructionComprehensivereformMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeachingconstructionComprehensivereform record) {
        return teachingconstructionComprehensivereformMapper.insert(record);
    }

    @Override
    public PageInfo<TeachingconstructionComprehensivereform> selectAll(int pageNum, int pageSize, Userinformation record) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeachingconstructionComprehensivereform> teachings;
        List<String> classTeachers = userinformationService.selectSomeByAny(record);
        //如果查询信息表下没有记录，返回空
        if (classTeachers.size() == 0) {
            return new PageInfo<>();
        }
        teachings = teachingconstructionComprehensivereformMapper.selectAllByClassTeacher(classTeachers);

        //加入当前记录老师姓名
        for (int index = 0; index < teachings.size(); index++) {
            TeachingconstructionComprehensivereform teachingconstructionComprehensivereform = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(teachingconstructionComprehensivereform.getClassTeacher());
            teachingconstructionComprehensivereform.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<TeachingconstructionComprehensivereform> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeachingconstructionComprehensivereform> selectByClassTeacher(TeachingconstructionComprehensivereform teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeachingconstructionComprehensivereform> teachings = teachingconstructionComprehensivereformMapper.selectByClassTeacher(teaching);
        PageInfo<TeachingconstructionComprehensivereform> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeachingconstructionComprehensivereform record) {
        return teachingconstructionComprehensivereformMapper.updateByPrimaryKey(record);
    }
}
