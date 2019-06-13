package com.example.demo.service.impl;

import com.example.demo.mapper.UserinformationMapper;
import com.example.demo.model.Userinformation;
import com.example.demo.service.UserinformationService;
import com.example.demo.util.MailTo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/30 1:31
 * @Version 1.0
 */

@Service
public class UserinformationServiceImpl implements UserinformationService {

    @Autowired
    private UserinformationMapper userinformationMapper;


    @Override
    public Userinformation selectByClassTeacher(Userinformation record) {
        return userinformationMapper.selectByClassTeacher(record);
    }

    @Override
    public PageInfo<Userinformation> selectByUserinformation(int pageNum, int pageSize, Userinformation record) {
        PageHelper.startPage(pageNum, pageSize);
        List<Userinformation> teachings = userinformationMapper.selectByUserinformation(record);
        PageInfo<Userinformation> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(Userinformation record) {
        return userinformationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateEmail(Userinformation record) {
        return userinformationMapper.updateEmail(record);
    }

    @Override
    public int updatename(Userinformation record) {
        return userinformationMapper.updatename(record);
    }

    @Override
    public int updatedepartmentDept(Userinformation record) {
        return userinformationMapper.updatedepartmentDept(record);
    }

    @Override
    public List<String> selectSomeByAny(Userinformation record) {
        List<Userinformation> userinformations = userinformationMapper.selectSomeByAny(record);
        List<String> classTeachers = new ArrayList<>();
        for (int i = 0; i < userinformations.size(); i++) {
            classTeachers.add(userinformations.get(i).getClassTeacher());

        }
        return classTeachers;
    }

    @Override
    public int getToken(String email) {
        String str = "0123456789";
        StringBuilder sb = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            char ch = str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        //发送邮件
        new Thread(() -> {
            try {
                MailTo mailTo = new MailTo();
                mailTo.sendmail(email, Integer.parseInt(sb.toString()));
            } catch (Exception e) {
                System.out.println("异常");
            }
        }).start();
        return Integer.parseInt(sb.toString());
    }

    @Override
    public int getTokenForget(String access_name) {
        Userinformation userinformation = new Userinformation();
        userinformation.setClassTeacher(access_name);
        String email = selectByClassTeacher(userinformation).getEmail();
        return getToken(email);
    }
}
