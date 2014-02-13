package com.seckill.cache;

/**
 * User: 黄锴
 * Date: 13-11-17
 * Time: 下午2:48
 */
public interface Cache<T> {
    public void set(String id, T t);
    public void remove(String id);
    public T get(String id);


}
