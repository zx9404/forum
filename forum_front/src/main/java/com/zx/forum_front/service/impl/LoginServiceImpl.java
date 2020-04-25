package com.zx.forum_front.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zx.forum_front.dao.LoginMapper;
import com.zx.forum_front.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录
 *
 * @author zhangxiang
 * @date 2020/4/18 18:20
 * @content
 **/
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginDao;

    @Override
    public JSONObject validateLogin(String userid, String password) {
        JSONObject jsonObject = new JSONObject();
        return jsonObject;
    }
}
