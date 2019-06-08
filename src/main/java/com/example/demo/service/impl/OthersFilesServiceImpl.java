package com.example.demo.service.impl;

import com.example.demo.mapper.OthersFilesMapper;
import com.example.demo.model.OthersFiles;
import com.example.demo.model.Userinformation;
import com.example.demo.service.OthersFilesService;
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
 * @Date: 2019/5/28 23:44
 * @Version 1.0
 */

@Service
public class OthersFilesServiceImpl implements OthersFilesService {

    @Autowired
    private OthersFilesMapper othersFilesMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return othersFilesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OthersFiles record) {
        return othersFilesMapper.insert(record);
    }

    @Override
    public PageInfo<OthersFiles> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<OthersFiles> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = othersFilesMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = othersFilesMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            OthersFiles othersFiles = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(othersFiles.getClassTeacher());
            othersFiles.setClassTeacherName(userinformationService.selectUserinformation(userinformation).getName());
        }
        PageInfo<OthersFiles> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<OthersFiles> selectByClassTeacher(OthersFiles teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<OthersFiles> teachings = othersFilesMapper.selectByClassTeacher(teaching);
        PageInfo<OthersFiles> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(OthersFiles record) {
        return othersFilesMapper.updateByPrimaryKey(record);
    }
}
