package com.sdut.softlab.service.impl;

import com.sdut.softlab.common.annotation.BaseService;
import com.sdut.softlab.common.base.BaseServiceImpl;
import com.sdut.softlab.dao.UpmsOrganizationMapper;
import com.sdut.softlab.entity.UpmsOrganization;
import com.sdut.softlab.entity.UpmsOrganizationExample;
import com.sdut.softlab.service.UpmsOrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsOrganizationService实现
* Created by shusdut.softlab on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsOrganizationServiceImpl extends BaseServiceImpl<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsOrganizationServiceImpl.class);

    @Autowired
    UpmsOrganizationMapper upmsOrganizationMapper;

}