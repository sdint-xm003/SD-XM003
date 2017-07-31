package com.sd.xm003.service;

import com.sd.xm003.model.UserModel;

import java.util.List;
import java.util.Map;

/**
 * Created by KF03 on 2017/7/22.
 */
public interface UserService{
    public List<UserModel> queryAllUser(Map<String, Object> map);

//    void  updateUser(Integer id);
}
