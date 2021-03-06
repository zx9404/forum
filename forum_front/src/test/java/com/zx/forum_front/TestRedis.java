package com.zx.forum_front;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author zhangxiang
 * @date 2020/4/18 17:48
 * @content
 **/
@SpringBootTest
public class TestRedis {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void set() {
        redisTemplate.opsForValue().set("myKey", "myValue");
        System.out.println(redisTemplate.opsForValue().get("myKey"));
    }
}
