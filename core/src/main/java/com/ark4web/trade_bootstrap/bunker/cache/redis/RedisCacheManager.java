package com.ark4web.trade_bootstrap.bunker.cache.redis;

import com.ark4web.trade_bootstrap.bunker.cache.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * User: 黄锴
 * Date: 13-11-19
 * Time: 下午11:23
 */
@Service
public class RedisCacheManager implements CacheManager {


    private JedisPoolConfig jedisPoolConfig;
    private JedisConfig jedisConfig;

    private JedisPool pool = null;


    private RedisCacheManager instance;

    private void init(){
        synchronized (this){
            if (this.pool == null){
                pool = new JedisPool(jedisPoolConfig, jedisConfig.getIp(), jedisConfig.getPort());
            }
        }
    }


    @Override
    public String get(String id) {
        init();



        Jedis jedis = pool.getResource();

        return jedis.get(id);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(String id) {
        init();
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean put(String id, String cache) {
        init();
        pool = new JedisPool(jedisPoolConfig, jedisConfig.getIp(), jedisConfig.getPort());
        Jedis jedis = pool.getResource();
        jedis.set(id, cache);
        return true;
    }

    @Autowired
    public void setJedisPoolConfig(JedisPoolConfig jedisPoolConfig) {
        this.jedisPoolConfig = jedisPoolConfig;
    }

    @Autowired
    public void setJedisConfig(JedisConfig jedisConfig) {
        this.jedisConfig = jedisConfig;
    }
}
