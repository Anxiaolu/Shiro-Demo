package com.sdut.softlab.service;

import com.sdut.softlab.common.base.BaseService;
import com.sdut.softlab.entity.UpmsSystem;
import com.sdut.softlab.entity.UpmsSystemExample;

/**
* UpmsSystemService接口
* Created by shuzheng on 2017/3/20.
*/
public interface UpmsSystemService extends BaseService<UpmsSystem, UpmsSystemExample> {

    /**
     * 根据name获取UpmsSystem
     * @param name
     * @return
     */
    UpmsSystem selectUpmsSystemByName(String name);

}