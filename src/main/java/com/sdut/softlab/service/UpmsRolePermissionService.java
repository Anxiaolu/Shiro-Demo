package com.sdut.softlab.service;

import com.alibaba.fastjson.JSONArray;
import com.sdut.softlab.common.base.BaseService;
import com.sdut.softlab.entity.UpmsRolePermission;
import com.sdut.softlab.entity.UpmsRolePermissionExample;

/**
* UpmsRolePermissionService接口
* Created by shuzheng on 2017/3/20.
*/
public interface UpmsRolePermissionService extends BaseService<UpmsRolePermission, UpmsRolePermissionExample> {

    /**
     * 角色权限
     * @param datas 权限数据
     * @param id 角色id
     * @return
     */
    int rolePermission(JSONArray datas, int id);

}