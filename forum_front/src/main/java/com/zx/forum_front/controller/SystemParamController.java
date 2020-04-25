package com.zx.forum_front.controller;

import com.zx.forum_front.service.SystemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangxiang
 * @date 2020/4/18 23:13
 * @content
 **/
@Controller
@RequestMapping("/systemParam")
public class SystemParamController {
    @Autowired
    SystemParamService systemParamService;

    /**
     * 新增系统参数
     *
     * @param paramCode    参数代码
     * @param paramValue   参数取值
     * @param paramDesc    参数描述
     * @param paramPrepare 参数是否需要开启预热:1|是;2|否
     * @return
     */
    @RequestMapping("addSystemParam")
    public int addSystemParam(@RequestParam("paramCode") String paramCode, @RequestParam("paramValue") String paramValue,
                              @RequestParam("paramDesc") String paramDesc, @RequestParam("paramPrepare") String paramPrepare) {
        int result = systemParamService.insertSystemParam(paramCode, paramValue, paramDesc, paramPrepare);
        return result;
    }

    /**
     * 修改系统参数
     *
     * @param paramCode    参数代码
     * @param paramValue   参数取值
     * @param paramDesc    参数描述
     * @param paramPrepare 参数是否需要开启预热:1|是;2|否
     * @return
     */
    @RequestMapping("updateSystemParam")
    public int updateSystemParam(@RequestParam("paramCode") String paramCode, @RequestParam("paramValue") String paramValue,
                                 @RequestParam("paramDesc") String paramDesc, @RequestParam("paramPrepare") String paramPrepare) {
        int result = systemParamService.updateSystemParam(paramCode, paramValue, paramDesc, paramPrepare);
        return result;
    }
    /**
     * 删除系统参数
     *
     * @param paramCodes    参数代码，可多个
     * @return
     */
    /*@RequestMapping("deleteSystemParam")
    public int updateSystemParam(@RequestParam("paramCodes") String paramCodes) {
        int result = systemParamService.updateSystemParam(paramCode, paramValue, paramDesc, paramPrepare);
        return result;
    }*/
}
