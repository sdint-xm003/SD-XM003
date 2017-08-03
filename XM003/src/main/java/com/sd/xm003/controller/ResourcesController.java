package com.sd.xm003.controller;

import com.github.pagehelper.PageInfo;
import com.sd.xm003.model.Resources;
import com.sd.xm003.model.Role;
import com.sd.xm003.model.User;
import com.sd.xm003.service.ResourcesService;
import com.sd.xm003.shiro.ShiroService;
import org.apache.shiro.SecurityUtils;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by yangqj on 2017/4/25.
 */
@RestController
@RequestMapping("/resources")
public class ResourcesController {

    @Resource
    private ResourcesService resourcesService;
    @Resource
    private ShiroService shiroService;

    @RequestMapping
    public Map<String,Object> getAll(Resources resources, String draw,
                                     @RequestParam(required = false, defaultValue = "1") int start,
                                     @RequestParam(required = false, defaultValue = "10") int length){
        Map<String,Object> map = new HashMap<>();
        PageInfo<Resources> pageInfo = resourcesService.selectByPage(resources, start, length);
        System.out.println("pageInfo.getTotal():"+pageInfo.getTotal());
        map.put("draw",draw);
        map.put("recordsTotal",pageInfo.getTotal());
        map.put("recordsFiltered",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping("/resourcesWithSelected")
    public List<Resources> resourcesWithSelected(Integer rid){
        return resourcesService.queryResourcesListWithSelected(rid);
    }

    @RequestMapping("/loadMenu")
    public List<Resources> loadMenu(){
        Map<String,Object> map = new HashMap<>();
//        Integer userid = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userSessionId");
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        map.put("type",1);
        map.put("userid",user.getId());
        List<Resources> list = resourcesService.loadUserResources(map);
        return list;
    }

    @CacheEvict(cacheNames="resources", allEntries=true)
    @RequestMapping(value = "/add")
    public String add(Resources resources){
        try{
            resourcesService.save(resources);
            //更新权限
            shiroService.updatePermission();
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
    @CacheEvict(cacheNames="resources", allEntries=true)
    @RequestMapping(value = "/delete")
    public String delete(Integer id){
        try{
            resourcesService.delete(id);
            //更新权限
            shiroService.updatePermission();
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
}
