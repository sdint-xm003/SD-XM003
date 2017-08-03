package com.sd.xm003.mapper;


import com.sd.xm003.model.User;
import com.sd.xm003.util.MyMapper;

public interface UserMapper extends MyMapper<User> {
      User findByUserName(String userName);
}