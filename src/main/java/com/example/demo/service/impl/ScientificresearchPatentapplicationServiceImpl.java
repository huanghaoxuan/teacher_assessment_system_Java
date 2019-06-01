package com.example.demo.service.impl;

import com.example.demo.mapper.ScientificresearchPatentapplicationMapper;
import com.example.demo.model.ScientificresearchPatentapplication;
import com.example.demo.service.ScientificresearchPatentapplicationService;
import com.example.demo.service.ScorePatentapplicationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/29 9:42
 * @Version 1.0
 */

@Service
public class ScientificresearchPatentapplicationServiceImpl implements ScientificresearchPatentapplicationService {

    @Autowired
    private ScientificresearchPatentapplicationMapper scientificresearchPatentapplicationMapper;

    @Autowired
    private ScorePatentapplicationService scorePatentapplicationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return scientificresearchPatentapplicationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ScientificresearchPatentapplication record) {
        return scientificresearchPatentapplicationMapper.insert(record);
    }

    @Override
    public PageInfo<ScientificresearchPatentapplication> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ScientificresearchPatentapplication> teachings = scientificresearchPatentapplicationMapper.selectAll();
        PageInfo<ScientificresearchPatentapplication> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<ScientificresearchPatentapplication> selectByClassTeacher(ScientificresearchPatentapplication teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<ScientificresearchPatentapplication> teachings = scientificresearchPatentapplicationMapper.selectByClassTeacher(teaching);
        PageInfo<ScientificresearchPatentapplication> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(ScientificresearchPatentapplication record) {
        return scientificresearchPatentapplicationMapper.updateByPrimaryKey(record);
    }

    @Override
    public BigDecimal getScore(String tpye) {
        if (tpye.equals("发明专利授权")) {
            return scorePatentapplicationService.selectByPrimaryKey(1).getInvention();
        } else if (tpye.equals("国家已受理发明专利")) {
            return scorePatentapplicationService.selectByPrimaryKey(1).getCountryAccept();
        } else if (tpye.equals("实用新型专利")) {
            return scorePatentapplicationService.selectByPrimaryKey(1).getPractical();
        } else if (tpye.equals("外观设计专利")) {
            return scorePatentapplicationService.selectByPrimaryKey(1).getExteriorDesign();
        }
        return BigDecimal.valueOf(0);
    }
}
