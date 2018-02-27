package com.sdut.softlab.service;

import com.alibaba.fastjson.JSONArray;
import com.sdut.softlab.common.base.BaseServiceMock;
import com.sdut.softlab.dao.UpmsUserPermissionMapper;
import com.sdut.softlab.entity.UpmsUserPermission;
import com.sdut.softlab.entity.UpmsUserPermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserPermissionService接口
* Created by shuzheng on 2017/3/20.
*/
public class UpmsUserPermissionServiceMock extends BaseServiceMock<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample> implements UpmsUserPermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserPermissionServiceMock.class);

    @Override
    public int permission(JSONArray datas, int id) {
        LOGGER.info("UpmsUserPermissionServiceMock => permission");
        return 0;
    }

}
