package com.zx.forum_front.controller;

import com.alibaba.fastjson.JSONObject;
import com.zx.forum_front.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangxiang
 * @date 2020/4/18 18:17
 * @content
 **/
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @ResponseBody
    @RequestMapping("/validateLogin")
    public JSONObject validateLogin(@RequestParam("userId") String userId, @RequestParam("password") String password) {
        JSONObject jsonObject = loginService.validateLogin(userId, password);
        return jsonObject;
    }
}
