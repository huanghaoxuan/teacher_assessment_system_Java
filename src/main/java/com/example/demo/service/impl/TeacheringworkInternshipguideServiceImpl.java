package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkInternshipguideMapper;
import com.example.demo.model.TeacheringworkInternshipguide;
import com.example.demo.model.Userinformation;
import com.example.demo.service.TeacheringworkInternshipguideService;
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
public class TeacheringworkInternshipguideServiceImpl implements TeacheringworkInternshipguideService {

    @Autowired
    private TeacheringworkInternshipguideMapper teacheringworkInternshipguideMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkInternshipguideMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkInternshipguide record) {
        return teacheringworkInternshipguideMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkInternshipguide> selectAll(int pageNum, int pageSize, Userinformation record) {
        List<String> classTeachers = userinformationService.selectSomeByAny(record);
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkInternshipguide> teachings;
        //如果查询信息表下没有记录，返回空
        if (classTeachers.size() == 0) {
            return new PageInfo<>();
        }
        teachings = teacheringworkInternshipguideMapper.selectAllByClassTeacher(classTeachers);

        //加入当前记录老师姓名
        for (int index = 0; index < teachings.size(); index++) {
            TeacheringworkInternshipguide teacheringworkInternshipguide = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(teacheringworkInternshipguide.getClassTeacher());
            teacheringworkInternshipguide.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<TeacheringworkInternshipguide> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkInternshipguide> selectByClassTeacher(TeacheringworkInternshipguide teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeacheringworkInternshipguide> teachings = teacheringworkInternshipguideMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkInternshipguide> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkInternshipguide record) {
        return teacheringworkInternshipguideMapper.updateByPrimaryKey(record);
    }
}
