package com.example.demo.service.impl;

import com.example.demo.mapper.ScientificresearchLongitudinaltopicsprojectMapper;
import com.example.demo.model.ScientificresearchLongitudinaltopicsproject;
import com.example.demo.service.ScientificresearchLongitudinaltopicsprojectService;
import com.example.demo.service.ScoreLongitudinaltopicsprojectService;
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
public class ScientificresearchLongitudinaltopicsprojectServiceImpl implements ScientificresearchLongitudinaltopicsprojectService {

    @Autowired
    private ScientificresearchLongitudinaltopicsprojectMapper scientificresearchLongitudinaltopicsprojectMapper;

    @Autowired
    private ScoreLongitudinaltopicsprojectService scoreLongitudinaltopicsprojectService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return scientificresearchLongitudinaltopicsprojectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ScientificresearchLongitudinaltopicsproject record) {
        return scientificresearchLongitudinaltopicsprojectMapper.insert(record);
    }

    @Override
    public PageInfo<ScientificresearchLongitudinaltopicsproject> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ScientificresearchLongitudinaltopicsproject> teachings = scientificresearchLongitudinaltopicsprojectMapper.selectAll();
        PageInfo<ScientificresearchLongitudinaltopicsproject> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<ScientificresearchLongitudinaltopicsproject> selectByClassTeacher(ScientificresearchLongitudinaltopicsproject teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<ScientificresearchLongitudinaltopicsproject> teachings = scientificresearchLongitudinaltopicsprojectMapper.selectByClassTeacher(teaching);
        PageInfo<ScientificresearchLongitudinaltopicsproject> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(ScientificresearchLongitudinaltopicsproject record) {
        return scientificresearchLongitudinaltopicsprojectMapper.updateByPrimaryKey(record);
    }

    @Override
    public BigDecimal getScore(String source, String type) {
        if (source.equals("国家自然科学基金") || source.equals("国家社科基金")) {
            if (type.equals("重点资助")) {
                return scoreLongitudinaltopicsprojectService.selectByPrimaryKey(1).getCountryKeyFunding();
            } else if (type.equals("一般资助")) {
                return scoreLongitudinaltopicsprojectService.selectByPrimaryKey(1).getCountryGeneralFunding();
            } else if (type.equals("立项")) {
                return scoreLongitudinaltopicsprojectService.selectByPrimaryKey(1).getCountryProject();
            }
        } else if (source.equals("省自然科学基金") || source.equals("省社科基金")) {
            if (type.equals("重点资助")) {
                return scoreLongitudinaltopicsprojectService.selectByPrimaryKey(1).getProvincialKeyFunding();
            } else if (type.equals("一般资助")) {
                return scoreLongitudinaltopicsprojectService.selectByPrimaryKey(1).getProvincialGeneralFunding();
            } else if (type.equals("立项")) {
                return scoreLongitudinaltopicsprojectService.selectByPrimaryKey(1).getProvincialProject();
            }
        } else if (source.equals("市厅级")) {
            if (type.equals("重点资助")) {
                return scoreLongitudinaltopicsprojectService.selectByPrimaryKey(1).getCityGeneralFunding();
            } else if (type.equals("一般资助")) {
                return scoreLongitudinaltopicsprojectService.selectByPrimaryKey(1).getCityGeneralFunding();
            } else if (type.equals("立项")) {
                return scoreLongitudinaltopicsprojectService.selectByPrimaryKey(1).getCityProject();
            }
        } else if (source.equals("院级")) {
            if (type.equals("重点资助")) {
                return scoreLongitudinaltopicsprojectService.selectByPrimaryKey(1).getSchoolKeyFunding();
            } else if (type.equals("一般资助")) {
                return scoreLongitudinaltopicsprojectService.selectByPrimaryKey(1).getSchoolGeneralFunding();
            } else if (type.equals("立项")) {
                return scoreLongitudinaltopicsprojectService.selectByPrimaryKey(1).getSchoolProject();
            }
        }
        return BigDecimal.valueOf(0);
    }
}
