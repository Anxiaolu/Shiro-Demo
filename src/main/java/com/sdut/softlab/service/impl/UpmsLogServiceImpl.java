package com.sdut.softlab.service.impl;

import com.sdut.softlab.common.annotation.BaseService;
import com.sdut.softlab.common.base.BaseServiceImpl;
import com.sdut.softlab.dao.UpmsLogMapper;
import com.sdut.softlab.entity.UpmsLog;
import com.sdut.softlab.entity.UpmsLogExample;
import com.sdut.softlab.service.UpmsLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsLogService实现
* Created by shuzheng on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsLogServiceImpl extends UpmsLogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsLogServiceImpl.class);

    @Autowired
    UpmsLogMapper upmsLogMapper;

}