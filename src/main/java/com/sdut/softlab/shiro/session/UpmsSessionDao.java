/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdut.softlab.shiro.session;

import java.io.Serializable;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author huanlu
 */
public class UpmsSessionDao extends CachingSessionDAO{
    
    private static final Logger logger = LoggerFactory.getLogger(UpmsSessionDao.class);

    @Override
    protected void doDelete(Session sn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Serializable doCreate(Session session) {
//        Serializable sessionId = generateSessionId(session);
//        assignSessionId(session, sessionId);
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected Session doReadSession(Serializable srlzbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doUpdate(Session sn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
