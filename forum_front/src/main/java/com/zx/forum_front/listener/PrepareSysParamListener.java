package com.zx.forum_front.listener;

import com.zx.forum_front.dao.SystemParamMapper;
import com.zx.forum_front.entity.SystemParamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;

/**
 * @author zhangxiang
 * @date 2020/4/18 22:39
 * @content
 **/
@WebListener
public class PrepareSysParamListener implements ServletContextListener {
    @Autowired
    SystemParamMapper systemParamMapper;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        /**
         * 系统参数进行预热
         */
        List<SystemParamEntity> list = systemParamMapper.selectSystemParamsNeedCached();
       /* for (SystemParamEntity entity : list) {
            redisTemplate.opsForValue().set(entity.getParamCode(), entity.getParamValue());
        }*/
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
