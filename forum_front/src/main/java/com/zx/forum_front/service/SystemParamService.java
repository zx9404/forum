package com.zx.forum_front.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author zhangxiang
 * @date 2020/4/18 23:15
 * @content
 **/
public interface SystemParamService {
    public int insertSystemParam(String paramCode, String paramValue, String paramDesc, String paramPrepare);

    public int updateSystemParam(String paramCode, String paramValue, String paramDesc, String paramPrepare);

    public int deleteSystemParam(String paramCodes);
}
