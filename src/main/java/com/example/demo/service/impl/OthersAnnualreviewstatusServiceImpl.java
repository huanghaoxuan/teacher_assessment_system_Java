package com.example.demo.service.impl;

import com.example.demo.mapper.OthersAnnualreviewstatusMapper;
import com.example.demo.model.FruitClassTeaching;
import com.example.demo.model.OthersAnnualreviewstatus;
import com.example.demo.service.OthersAnnualreviewstatusService;
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

    @Override
    public PageInfo<OthersAnnualreviewstatus> selectByClassTeacher(OthersAnnualreviewstatus teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
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
    public PageInfo<OthersAnnualreviewstatus> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OthersAnnualreviewstatus> teachings = othersAnnualreviewstatusMapper.selectAll();
        PageInfo<OthersAnnualreviewstatus> result = new PageInfo<>(teachings);
        return result;
    }
}
