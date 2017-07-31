package com.sd.xm003.mapper;

import com.sd.xm003.model.UserModel;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by KF03 on 2017/7/22.
 */
public interface UserMapper extends Mapper<UserModel> {
    public List<UserModel>  queryAllUser(Map<String, Object> map);

//    void  updateUser(Integer id);

}
