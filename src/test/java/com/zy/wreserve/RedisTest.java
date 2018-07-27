package com.zy.wreserve;

import com.zy.wreserve.common.utils.JedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;


import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Resource
    private JedisUtil redisUtil;
    // 字符串操作
    @Test
    public void testStr() {
        Jedis jedis = redisUtil.getJedis();
        jedis.set("id", "15"); // 只能是字符串
        String id = jedis.get("id");
        System.out.println(id);
        jedis.close();
    }
}
