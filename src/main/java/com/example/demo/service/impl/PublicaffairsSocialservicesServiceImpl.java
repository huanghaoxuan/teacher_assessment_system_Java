package com.example.demo.service.impl;

import com.example.demo.mapper.PublicaffairsSocialservicesMapper;
import com.example.demo.model.PublicaffairsSocialservices;
import com.example.demo.model.Userinformation;
import com.example.demo.service.PublicaffairsSocialservicesService;
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
public class PublicaffairsSocialservicesServiceImpl implements PublicaffairsSocialservicesService {

    @Autowired
    private PublicaffairsSocialservicesMapper publicaffairsSocialservicesMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return publicaffairsSocialservicesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PublicaffairsSocialservices record) {
        return publicaffairsSocialservicesMapper.insert(record);
    }

    @Override
    public PageInfo<PublicaffairsSocialservices> selectAll(int pageNum, int pageSize, Userinformation record) {
        List<String> classTeachers = userinformationService.selectSomeByAny(record);
        PageHelper.startPage(pageNum, pageSize);
        List<PublicaffairsSocialservices> teachings;
        //如果查询信息表下没有记录，返回空
        if (classTeachers.size() == 0) {
            return new PageInfo<>();
        }
        teachings = publicaffairsSocialservicesMapper.selectAllByClassTeacher(classTeachers);

        //加入当前记录老师姓名
        for (int index = 0; index < teachings.size(); index++) {
            PublicaffairsSocialservices publicaffairsSocialservices = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(publicaffairsSocialservices.getClassTeacher());
            publicaffairsSocialservices.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<PublicaffairsSocialservices> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<PublicaffairsSocialservices> selectByClassTeacher(PublicaffairsSocialservices teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<PublicaffairsSocialservices> teachings = publicaffairsSocialservicesMapper.selectByClassTeacher(teaching);
        PageInfo<PublicaffairsSocialservices> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(PublicaffairsSocialservices record) {
        return publicaffairsSocialservicesMapper.updateByPrimaryKey(record);
    }
}
