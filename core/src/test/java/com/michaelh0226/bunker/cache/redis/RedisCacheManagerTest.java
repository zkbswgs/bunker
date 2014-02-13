package com.michaelh0226.bunker.cache.redis;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: 黄锴
 * Date: 13-11-20
 * Time: 下午10:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ctx-bunker.xml")
public class RedisCacheManagerTest {
    private static final Logger logger = Logger.getLogger(RedisCacheManagerTest.class);

    @Autowired
    RedisCacheManager cacheManager;

    @Test
    public void test() {
        logger.info("put id : 1, value: 1111");
        cacheManager.put("1", "1111");
        System.out.print("get id :1, value: " + cacheManager.get("1"));

    }


}
