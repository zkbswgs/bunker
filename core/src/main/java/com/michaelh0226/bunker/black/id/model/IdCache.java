package com.michaelh0226.bunker.black.id.model;

import com.michaelh0226.bunker.cache.Cache;

/**
 * User: 黄锴
 * Date: 13-11-20
 * Time: 下午9:42
 */
public class IdCache implements Cache {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
