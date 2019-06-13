package com.example.demo.service.impl;

import com.example.demo.mapper.OthersComprehensiveawardwinningMapper;
import com.example.demo.model.OthersComprehensiveawardwinning;
import com.example.demo.model.Userinformation;
import com.example.demo.service.OthersComprehensiveawardwinningService;
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
 * @Date: 2019/5/28 22:32
 * @Version 1.0
 */

@Service
public class OthersComprehensiveawardwinningServiceImpl implements OthersComprehensiveawardwinningService {

    @Autowired
    private OthersComprehensiveawardwinningMapper othersComprehensiveawardwinningMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return othersComprehensiveawardwinningMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OthersComprehensiveawardwinning record) {
        return othersComprehensiveawardwinningMapper.insert(record);
    }

    @Override
    public PageInfo<OthersComprehensiveawardwinning> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<OthersComprehensiveawardwinning> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = othersComprehensiveawardwinningMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = othersComprehensiveawardwinningMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            OthersComprehensiveawardwinning othersComprehensiveawardwinning = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(othersComprehensiveawardwinning.getClassTeacher());
            othersComprehensiveawardwinning.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<OthersComprehensiveawardwinning> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<OthersComprehensiveawardwinning> selectByClassTeacher(OthersComprehensiveawardwinning teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<OthersComprehensiveawardwinning> teachings = othersComprehensiveawardwinningMapper.selectByClassTeacher(teaching);
        PageInfo<OthersComprehensiveawardwinning> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(OthersComprehensiveawardwinning record) {
        return othersComprehensiveawardwinningMapper.updateByPrimaryKey(record);
    }
}
