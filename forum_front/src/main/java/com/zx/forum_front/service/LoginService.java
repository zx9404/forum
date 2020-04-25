package com.zx.forum_front.service;

import com.alibaba.fastjson.JSONObject;

/**
 * 登录
 *
 * @author zhangxiang
 * @date 2020/4/18 18:20
 * @content
 **/
public interface LoginService {
    JSONObject validateLogin(String userid, String password);
}
