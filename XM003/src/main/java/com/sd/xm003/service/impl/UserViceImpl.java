package com.sd.xm003.service.impl;

import com.sd.xm003.mapper.UserMapper;
import com.sd.xm003.model.UserModel;
import com.sd.xm003.service.UserService;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by KF03 on 2017/7/22.
 */
@Service("userSerivce")
public  class UserViceImpl  implements  UserService{

    @Autowired
    UserMapper userMapper;
    @Autowired
    private     RedisTemplate redisTemplate;


    @Override
    public List<UserModel> queryAllUser(Map<String, Object> map) {

        return userMapper.queryAllUser(map);
    }

//    @Override
//    @Transactional
//    public void updateUser(Integer id) {
//        userMapper.updateUser(1);
//        int a=1/0;
//    }

}

