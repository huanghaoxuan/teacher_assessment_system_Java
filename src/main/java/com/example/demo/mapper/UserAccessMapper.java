package com.example.demo.mapper;

import com.example.demo.model.UserAccess;

import java.util.List;

public interface UserAccessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAccess record);

    UserAccess selectByPrimaryKey(Integer id);

    List<UserAccess> selectAll();

    int updateNamePassword(UserAccess record);

    int updateIdentity(UserAccess record);

    List<UserAccess> selectByNamePassword(UserAccess record);

    List<UserAccess> selectByName(UserAccess record);
}