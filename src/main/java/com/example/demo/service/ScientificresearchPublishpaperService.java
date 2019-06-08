package com.example.demo.service;

import com.example.demo.model.ScientificresearchPublishpaper;
import com.github.pagehelper.PageInfo;

import java.math.BigDecimal;

public interface ScientificresearchPublishpaperService {
    int deleteByPrimaryKey(Integer id);

    int insert(ScientificresearchPublishpaper record);

    PageInfo<ScientificresearchPublishpaper> selectAll(int pageNum, int pageSize, String departmentDept);

    PageInfo<ScientificresearchPublishpaper> selectByClassTeacher(ScientificresearchPublishpaper teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(ScientificresearchPublishpaper record);

    BigDecimal getScore(String collectionInformation, String character);
}