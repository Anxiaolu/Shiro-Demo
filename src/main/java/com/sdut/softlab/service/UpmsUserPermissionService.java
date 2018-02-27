package com.sdut.softlab.service;

import com.alibaba.fastjson.JSONArray;
import com.sdut.softlab.common.base.BaseService;
import com.sdut.softlab.entity.UpmsUserPermission;
import com.sdut.softlab.entity.UpmsUserPermissionExample;

/**
* UpmsUserPermissionService接口
* Created by shuzheng on 2017/3/20.
*/
public interface UpmsUserPermissionService extends BaseService<UpmsUserPermission, UpmsUserPermissionExample> {

    /**
     * 用户权限
     * @param datas 权限数据
     * @param id 用户id
     * @return
     */
    int permission(JSONArray datas, int id);

}