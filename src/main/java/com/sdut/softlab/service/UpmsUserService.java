package com.sdut.softlab.service;

import com.sdut.softlab.common.base.BaseService;
import com.sdut.softlab.entity.UpmsUser;
import com.sdut.softlab.entity.UpmsUserExample;

/**
* UpmsUserService接口
* Created by shusdut.softlab on 2017/3/20.
*/
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {

    UpmsUser createUser(UpmsUser upmsUser);

}