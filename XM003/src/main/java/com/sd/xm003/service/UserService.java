package com.sd.xm003.service;

import com.github.pagehelper.PageInfo;
import com.sd.xm003.model.User;

/**
 * Created by yangqj on 2017/4/21.
 */
public interface UserService extends IService<User>{
    PageInfo<User> selectByPage(User user, int start, int length);
    //根据用户名查询用户
    User selectByUsername(String username);
    //根据id删除用户
    void delUser(Integer userid);

}
