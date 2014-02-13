package com.ark4web.trade_bootstrap.bunker.cache.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * User: 黄锴
 * Date: 13-11-20
 * Time: 下午9:49
 */
@Component
public class JedisConfig {

    private   String ip;
    private  int port;

    public int getPort() {
        return port;
    }
    @Value("${redis.port}")
    public void setPort(int port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }
    @Value("${redis.ip}")
    public void setIp(String ip) {
        this.ip = ip;
    }
}
