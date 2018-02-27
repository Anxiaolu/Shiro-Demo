package com.sdut.softlab.service;

import com.sdut.softlab.common.base.BaseServiceMock;
import com.sdut.softlab.dao.UpmsUserRoleMapper;
import com.sdut.softlab.entity.UpmsUserRole;
import com.sdut.softlab.entity.UpmsUserRoleExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserRoleService接口
* Created by shusdut.softlab on 2017/3/20.
*/
public class UpmsUserRoleServiceMock extends BaseServiceMock<UpmsUserRoleMapper, UpmsUserRole, UpmsUserRoleExample> implements UpmsUserRoleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserRoleServiceMock.class);

    @Override
    public int role(String[] roleIds, int id) {
        LOGGER.info("UpmsUserRoleServiceMock => role");
        return 0;
    }

}
