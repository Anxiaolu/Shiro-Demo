package com.sdut.softlab.dao;

import com.sdut.softlab.entity.RolePermission;

public interface RolePermissionMapper {
    int insert(RolePermission record);

    int insertSelective(RolePermission record);
}