package com.sd.xm003.mapper;


import com.sd.xm003.model.Role;
import com.sd.xm003.util.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}