package com.ning.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ning.model.UserModel;
import com.ning.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:dongwn
 * @Description:
 * @Date: 2019/5/27 17:33
 * @Version: ning-parentV1.0
 */
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    /**
     * 演示是否整合mybatisplus成功
     *
     * @return
     */
    @GetMapping("find")
    public String findUserInfoById() {
        Long id = 1130371095053901826L;
        UserModel user = userService.queryOne(id);
        return "我是controller的测试"+user.getName();
    }


}
