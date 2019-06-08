package com.example.demo.service;

import com.example.demo.model.UserAccess;

public interface UserAccessService {

    int insert(UserAccess record);

    int updateIdentity(UserAccess record);

    int updateNamePassword(UserAccess oldUserAccess, UserAccess newUserAccess);

    int updateNamePassword(UserAccess UserAccess);

    int selectByNamePassword(UserAccess record);
}