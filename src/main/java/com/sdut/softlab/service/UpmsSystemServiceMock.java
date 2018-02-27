package com.sdut.softlab.service;

import com.sdut.softlab.common.base.BaseServiceMock;
import com.sdut.softlab.dao.UpmsSystemMapper;
import com.sdut.softlab.entity.UpmsSystem;
import com.sdut.softlab.entity.UpmsSystemExample;

/**
* 降级实现UpmsSystemService接口
* Created by shuzheng on 2017/3/20.
*/
public class UpmsSystemServiceMock extends BaseServiceMock<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

    @Override
    public UpmsSystem selectUpmsSystemByName(String name) {
        return null;
    }

}
