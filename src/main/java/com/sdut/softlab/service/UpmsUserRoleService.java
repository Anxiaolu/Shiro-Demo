package com.sdut.softlab.service;

import com.sdut.softlab.common.base.BaseService;
import com.sdut.softlab.entity.UpmsUserRole;
import com.sdut.softlab.entity.UpmsUserRoleExample;

/**
* UpmsUserRoleService接口
* Created by shuzheng on 2017/3/20.
*/
public interface UpmsUserRoleService extends BaseService<UpmsUserRole, UpmsUserRoleExample> {

    /**
     * 用户角色
     * @param roleIds 角色ids
     * @param id 用户id
     * @return
     */
    int role(String[] roleIds, int id);

}