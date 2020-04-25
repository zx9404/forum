package com.zx.forum_front.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zhangxiang
 * @date 2020/4/18 18:04
 * @content
 **/
@Data
public class UserEntity {
    private int id;
    //用户id
    private String userId;
    //手机号码
    private String telephone;
    //邮箱
    private String yx;
    //用户姓名
    private String username;
    //用户密码
    private String password;
    //上次登录ip
    private String lastLoginIp;
    //性别
    private int sex;
    //上次修改密码的日期
    private Date lastChangePassword;
}
