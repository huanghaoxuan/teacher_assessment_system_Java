package com.example.demo.mapper;

import com.example.demo.model.PublicaffairsSocialservices;

import java.util.List;

public interface PublicaffairsSocialservicesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PublicaffairsSocialservices record);

    PublicaffairsSocialservices selectByPrimaryKey(Integer id);

    List<PublicaffairsSocialservices> selectAll();

    int updateByPrimaryKey(PublicaffairsSocialservices record);

    List<PublicaffairsSocialservices> selectByClassTeacher(PublicaffairsSocialservices record);
}