package com.sd.xm003.mapper;


import com.sd.xm003.model.User;
import com.sd.xm003.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface UserMapper extends MyMapper<User> {
      //根据用户名查询对应的用户，角色，资源信息
      User findByUserName(String userName);
}