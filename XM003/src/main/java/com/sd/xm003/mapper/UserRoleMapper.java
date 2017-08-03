package com.sd.xm003.mapper;


import com.sd.xm003.model.UserRole;
import com.sd.xm003.util.MyMapper;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}