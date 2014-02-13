package com.ark4web.trade_bootstrap.bunker.cache;

/**
 * User: 黄锴
 * Date: 13-11-19
 * Time: 下午10:10
 */
public interface CacheManager {
    public String get(String id);

    public boolean delete(String id);

    public boolean put(String id, String cache);
}
