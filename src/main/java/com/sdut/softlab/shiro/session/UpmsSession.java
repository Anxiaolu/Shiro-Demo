/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdut.softlab.shiro.session;

import org.apache.shiro.session.mgt.SimpleSession;

/**
 *
 * @author huanlu
 */
public class UpmsSession extends SimpleSession {

    public static enum OnlineStatus {
        /**
         * 在线
         */
        on_line("在线"),
        /**
         * 离线
         */
        off_line("离线"),
        /**
         * 强制退出
         */
        force_logout("强制退出");

        private final String info;

        private OnlineStatus(String info) {
            this.info = info;
        }

        public String getInfo() {
            return info;
        }
    }

    // 用户浏览器类型
    private String userAgent;

    // 在线状态
    private OnlineStatus status = OnlineStatus.off_line;

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public OnlineStatus getStatus() {
        return status;
    }

    public void setStatus(OnlineStatus status) {
        this.status = status;
    }
}
