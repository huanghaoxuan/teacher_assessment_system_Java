package com.example.demo.service.impl;

import com.example.demo.mapper.PublicaffairsSocialservicesMapper;
import com.example.demo.model.PublicaffairsSocialservices;
import com.example.demo.service.PublicaffairsSocialservicesService;
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

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return publicaffairsSocialservicesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PublicaffairsSocialservices record) {
        return publicaffairsSocialservicesMapper.insert(record);
    }

    @Override
    public PageInfo<PublicaffairsSocialservices> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PublicaffairsSocialservices> teachings = publicaffairsSocialservicesMapper.selectAll();
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
