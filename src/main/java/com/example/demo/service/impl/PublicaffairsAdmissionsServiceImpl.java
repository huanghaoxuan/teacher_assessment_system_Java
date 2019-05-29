package com.example.demo.service.impl;

import com.example.demo.mapper.PublicaffairsAdmissionsMapper;
import com.example.demo.model.PublicaffairsAdmissions;
import com.example.demo.service.PublicaffairsAdmissionsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/29 9:01
 * @Version 1.0
 */
public class PublicaffairsAdmissionsServiceImpl implements PublicaffairsAdmissionsService {

    @Autowired
    private PublicaffairsAdmissionsMapper publicaffairsAdmissionsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return publicaffairsAdmissionsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PublicaffairsAdmissions record) {
        return publicaffairsAdmissionsMapper.insert(record);
    }

    @Override
    public PageInfo<PublicaffairsAdmissions> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PublicaffairsAdmissions> teachings = publicaffairsAdmissionsMapper.selectAll();
        PageInfo<PublicaffairsAdmissions> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<PublicaffairsAdmissions> selectByClassTeacher(PublicaffairsAdmissions teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PublicaffairsAdmissions> teachings = publicaffairsAdmissionsMapper.selectByClassTeacher(teaching);
        PageInfo<PublicaffairsAdmissions> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(PublicaffairsAdmissions record) {
        return publicaffairsAdmissionsMapper.updateByPrimaryKey(record);
    }
}
