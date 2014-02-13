package com.seckill.protocol;

import java.util.Map;

/**
 * User: 黄锴
 * Date: 13-11-17
 * Time: 下午2:27
 */
public class OrderResponse {
    private boolean success;
    private long orderId;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
