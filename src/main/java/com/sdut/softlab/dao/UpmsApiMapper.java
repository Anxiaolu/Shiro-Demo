/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdut.softlab.dao;

import com.sdut.softlab.entity.UpmsPermission;
import com.sdut.softlab.entity.UpmsRole;
import java.util.List;

/**
 *
 * @author huanlu
 */
public interface UpmsApiMapper {

    // 根据用户id获取所拥有的权限
    List<UpmsPermission> selectUpmsPermissionByUpmsUserId(Integer upmsUserId);

    // 根据用户id获取所属的角色
    List<UpmsRole> selectUpmsRoleByUpmsUserId(Integer upmsUserId);
}
