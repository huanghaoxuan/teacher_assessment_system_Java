package com.example.demo.service;

import com.example.demo.model.ScientificresearchPublishpaper;
import com.github.pagehelper.PageInfo;

public interface ScientificresearchPublishpaperService {
    int deleteByPrimaryKey(Integer id);

    int insert(ScientificresearchPublishpaper record);

    PageInfo<ScientificresearchPublishpaper> selectAll(int pageNum, int pageSize);

    PageInfo<ScientificresearchPublishpaper> selectByClassTeacher(ScientificresearchPublishpaper teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(ScientificresearchPublishpaper record);
}