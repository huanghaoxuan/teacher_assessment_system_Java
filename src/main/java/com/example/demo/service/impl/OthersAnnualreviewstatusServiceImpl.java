package com.example.demo.service.impl;

import com.example.demo.mapper.OthersAnnualreviewstatusMapper;
import com.example.demo.model.OthersAnnualreviewstatus;
import com.example.demo.model.Userinformation;
import com.example.demo.service.OthersAnnualreviewstatusService;
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
 * @Date: 2019/5/28 20:53
 * @Version 1.0
 */

@Service
public class OthersAnnualreviewstatusServiceImpl implements OthersAnnualreviewstatusService {

    @Autowired
    private OthersAnnualreviewstatusMapper othersAnnualreviewstatusMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public PageInfo<OthersAnnualreviewstatus> selectByClassTeacher(OthersAnnualreviewstatus teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<OthersAnnualreviewstatus> teachings = othersAnnualreviewstatusMapper.selectByClassTeacher(teaching);
        PageInfo<OthersAnnualreviewstatus> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(OthersAnnualreviewstatus record) {
        return othersAnnualreviewstatusMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insert(OthersAnnualreviewstatus record) {
        return othersAnnualreviewstatusMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return othersAnnualreviewstatusMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<OthersAnnualreviewstatus> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<OthersAnnualreviewstatus> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = othersAnnualreviewstatusMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = othersAnnualreviewstatusMapper.selectAll();
        }
        //加入当前记录老师姓名
        for (int index = 0; index < teachings.size(); index++) {
            OthersAnnualreviewstatus othersAnnualreviewstatus = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(othersAnnualreviewstatus.getClassTeacher());
            othersAnnualreviewstatus.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<OthersAnnualreviewstatus> result = new PageInfo<>(teachings);
        return result;
    }
}
