package com.sdut.softlab.dao;

import com.sdut.softlab.entity.UpmsPermission;
import com.sdut.softlab.entity.UpmsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsPermissionMapper {
    long countByExample(UpmsPermissionExample example);

    int deleteByExample(UpmsPermissionExample example);

    int deleteByPrimaryKey(Integer permissionId);

    int insert(UpmsPermission record);

    int insertSelective(UpmsPermission record);

    List<UpmsPermission> selectByExample(UpmsPermissionExample example);

    UpmsPermission selectByPrimaryKey(Integer permissionId);

    int updateByExampleSelective(@Param("record") UpmsPermission record, @Param("example") UpmsPermissionExample example);

    int updateByExample(@Param("record") UpmsPermission record, @Param("example") UpmsPermissionExample example);

    int updateByPrimaryKeySelective(UpmsPermission record);

    int updateByPrimaryKey(UpmsPermission record);
}