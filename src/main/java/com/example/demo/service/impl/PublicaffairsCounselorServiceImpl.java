package com.example.demo.service.impl;

import com.example.demo.mapper.PublicaffairsCounselorMapper;
import com.example.demo.model.PublicaffairsCounselor;
import com.example.demo.model.Userinformation;
import com.example.demo.service.PublicaffairsCounselorService;
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
public class PublicaffairsCounselorServiceImpl implements PublicaffairsCounselorService {

    @Autowired
    private PublicaffairsCounselorMapper publicaffairsCounselorMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return publicaffairsCounselorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PublicaffairsCounselor record) {
        return publicaffairsCounselorMapper.insert(record);
    }

    @Override
    public PageInfo<PublicaffairsCounselor> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PublicaffairsCounselor> teachings = publicaffairsCounselorMapper.selectAll();
        for (int index = 0; index < teachings.size(); index++) {
            PublicaffairsCounselor publicaffairsCounselor = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(publicaffairsCounselor.getClassTeacher());
            publicaffairsCounselor.setClassTeacherName(userinformationService.selectUserinformation(userinformation).getName());
        }
        PageInfo<PublicaffairsCounselor> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<PublicaffairsCounselor> selectByClassTeacher(PublicaffairsCounselor teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<PublicaffairsCounselor> teachings = publicaffairsCounselorMapper.selectByClassTeacher(teaching);
        PageInfo<PublicaffairsCounselor> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(PublicaffairsCounselor record) {
        return publicaffairsCounselorMapper.updateByPrimaryKey(record);
    }
}
