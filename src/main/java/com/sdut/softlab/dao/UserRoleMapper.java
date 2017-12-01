package com.sdut.softlab.dao;

import com.sdut.softlab.entity.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}