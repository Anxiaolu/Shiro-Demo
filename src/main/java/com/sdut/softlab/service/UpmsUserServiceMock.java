package com.sdut.softlab.service;

import com.sdut.softlab.common.base.BaseServiceMock;
import com.sdut.softlab.dao.UpmsUserMapper;
import com.sdut.softlab.entity.UpmsUser;
import com.sdut.softlab.entity.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by shusdut.softlab on 2017/3/20.
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    @Override
    public UpmsUser createUser(UpmsUser upmsUser) {
        return null;
    }

}
