package com.sdut.softlab.service;

import com.alibaba.fastjson.JSONArray;
import com.sdut.softlab.common.base.BaseServiceMock;
import com.sdut.softlab.dao.UpmsRolePermissionMapper;
import com.sdut.softlab.entity.UpmsRolePermission;
import com.sdut.softlab.entity.UpmsRolePermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsRolePermissionService接口
* Created by shuzheng on 2017/3/20.
*/
public class UpmsRolePermissionServiceMock extends BaseServiceMock<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample> implements UpmsRolePermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsRolePermissionServiceMock.class);

    @Override
    public int rolePermission(JSONArray datas, int id) {
        LOGGER.info("UpmsRolePermissionServiceMock => rolePermission");
        return 0;
    }

}
