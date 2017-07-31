package com.sd.xm003.controller;

import com.sd.xm003.model.UserModel;
import com.sd.xm003.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by KF03 on 2017/7/22.
 */
@Controller
@EnableAutoConfiguration
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public Object login() {
        Map<String,Object>  map=new HashMap<String,Object>();
        List<UserModel> userModels=userService.queryAllUser(map);
        return userModels;
//
//        userService.updateUser(2);
//        return  null;
    }
}



