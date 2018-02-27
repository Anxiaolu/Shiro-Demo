package com.sdut.softlab.service.impl;

import com.sdut.softlab.common.annotation.BaseService;
import com.sdut.softlab.common.base.BaseServiceImpl;
import com.sdut.softlab.dao.UpmsSystemMapper;
import com.sdut.softlab.entity.UpmsSystem;
import com.sdut.softlab.entity.UpmsSystemExample;
import com.sdut.softlab.service.UpmsSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* UpmsSystemService实现
* Created by shusdut.softlab on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsSystemServiceImpl extends BaseServiceImpl<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsSystemServiceImpl.class);

    @Autowired
    UpmsSystemMapper upmsSystemMapper;

    @Override
    public UpmsSystem selectUpmsSystemByName(String name) {
        UpmsSystemExample upmsSystemExample = new UpmsSystemExample();
        upmsSystemExample.createCriteria()
                .andNameEqualTo(name);
        List<UpmsSystem> upmsSystems = upmsSystemMapper.selectByExample(upmsSystemExample);
        if (null != upmsSystems && upmsSystems.size() > 0) {
            return upmsSystems.get(0);
        }
        return null;
    }

}