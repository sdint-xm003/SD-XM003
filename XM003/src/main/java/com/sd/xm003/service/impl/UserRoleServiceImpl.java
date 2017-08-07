package com.sd.xm003.service.impl;

import com.sd.xm003.mapper.UtilBaseMapper;
import com.sd.xm003.model.BaseMould;
import com.sd.xm003.model.UserRole;
import com.sd.xm003.service.UserRoleService;
import com.sd.xm003.service.UtilBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

/**
 * Created by yangqj on 2017/4/26.
 */
@Service("serRoleService")
public class UserRoleServiceImpl extends BaseService<UserRole> implements UserRoleService {


    @Override
    @Transactional(propagation= Propagation.REQUIRED,readOnly=false,rollbackFor={Exception.class})
    public void addUserRole(UserRole userRole) {
        //删除
        Example example = new Example(UserRole.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userid",userRole.getUserid());
        mapper.deleteByExample(example);
        //添加
        String[] roleids = userRole.getRoleid().split(",");
        for (String roleId : roleids) {
            UserRole u = new UserRole();
            u.setUserid(userRole.getUserid());
            u.setRoleid(roleId);
            mapper.insert(u);
        }

    }


}
