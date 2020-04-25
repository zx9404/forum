package com.zx.forum_front.entity;

import lombok.Data;

/**
 * @author zhangxiang
 * @date 2020/4/18 22:42
 * @content
 **/
@Data
public class SystemParamEntity {
    //参数代码
    private String paramCode;
    //参数取值
    private String paramValue;
    //参数描述
    private String paramDesc;
    //参数是否需要开启预热:1|是;2|否
    private String paramPrepare;
}
