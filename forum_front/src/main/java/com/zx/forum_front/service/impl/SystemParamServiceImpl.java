package com.zx.forum_front.service.impl;

import com.zx.forum_front.dao.SystemParamMapper;
import com.zx.forum_front.service.SystemParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangxiang
 * @date 2020/4/18 23:16
 * @content
 **/
@Service
public class SystemParamServiceImpl implements SystemParamService {
    @Resource
    SystemParamMapper systemParamMapper;

    @Override
    public int insertSystemParam(String paramCode, String paramValue, String paramDesc, String paramPrepare) {
        int code = systemParamMapper.insertSystemParam(paramCode, paramValue, paramDesc, paramPrepare);
        return code;
    }

    @Override
    public int updateSystemParam(String paramCode, String paramValue, String paramDesc, String paramPrepare) {
        int code = systemParamMapper.updateSystemParam(paramCode, paramValue, paramDesc, paramPrepare);
        return code;
    }

    @Override
    public int deleteSystemParam(String paramCodes) {
        return 0;
    }
}
