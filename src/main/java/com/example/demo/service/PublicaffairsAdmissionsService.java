package com.example.demo.service;

import com.example.demo.model.PublicaffairsAdmissions;
import com.github.pagehelper.PageInfo;

public interface PublicaffairsAdmissionsService {
    int deleteByPrimaryKey(Integer id);

    int insert(PublicaffairsAdmissions record);

    PageInfo<PublicaffairsAdmissions> selectAll(int pageNum, int pageSize);

    PageInfo<PublicaffairsAdmissions> selectByClassTeacher(PublicaffairsAdmissions teaching, int pageNum, int pageSize);

    int updateByPrimaryKey(PublicaffairsAdmissions record);
}