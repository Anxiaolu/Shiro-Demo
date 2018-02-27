package com.sdut.softlab.service;

import com.alibaba.fastjson.JSONArray;
import com.sdut.softlab.common.base.BaseService;
import com.sdut.softlab.entity.UpmsPermission;
import com.sdut.softlab.entity.UpmsPermissionExample;

/**
* UpmsPermissionService接口
* Created by shuzheng on 2017/3/20.
*/
public interface UpmsPermissionService extends BaseService<UpmsPermission, UpmsPermissionExample> {

    JSONArray getTreeByRoleId(Integer roleId);

    JSONArray getTreeByUserId(Integer usereId, Byte type);

}