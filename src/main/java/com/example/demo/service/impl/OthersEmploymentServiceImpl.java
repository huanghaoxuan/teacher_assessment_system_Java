package com.example.demo.service.impl;

import com.example.demo.mapper.OthersEmploymentMapper;
import com.example.demo.model.OthersEmployment;
import com.example.demo.model.Userinformation;
import com.example.demo.service.OthersEmploymentService;
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
 * @Date: 2019/5/29 0:28
 * @Version 1.0
 */
@Service
public class OthersEmploymentServiceImpl implements OthersEmploymentService {

    @Autowired
    private OthersEmploymentMapper othersEmploymentMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return othersEmploymentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OthersEmployment record) {
        return othersEmploymentMapper.insert(record);
    }

    @Override
    public PageInfo<OthersEmployment> selectAll(int pageNum, int pageSize, Userinformation record) {
        PageHelper.startPage(pageNum, pageSize);
        List<OthersEmployment> teachings;
        List<String> classTeachers = userinformationService.selectSomeByAny(record);
        //如果查询信息表下没有记录，返回空
        if (classTeachers.size() == 0) {
            return new PageInfo<>();
        }
        teachings = othersEmploymentMapper.selectAllByClassTeacher(classTeachers);

        //加入当前记录老师姓名
        for (int index = 0; index < teachings.size(); index++) {
            OthersEmployment othersEmployment = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(othersEmployment.getClassTeacher());
            othersEmployment.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<OthersEmployment> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<OthersEmployment> selectByClassTeacher(OthersEmployment teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<OthersEmployment> teachings = othersEmploymentMapper.selectByClassTeacher(teaching);
        PageInfo<OthersEmployment> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(OthersEmployment record) {
        return othersEmploymentMapper.updateByPrimaryKey(record);
    }
}
