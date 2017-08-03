package com.sd.xm003.mapper;


import com.sd.xm003.model.Resources;
import com.sd.xm003.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface ResourcesMapper extends MyMapper<Resources> {
    //查询全部的资源
    public List<Resources> queryAll();
    //查询用户对应的资源
    public List<Resources> loadUserResources(Map<String, Object> map);
    //查询角色对应的资源
    public List<Resources> queryResourcesListWithSelected(Integer rid);
}