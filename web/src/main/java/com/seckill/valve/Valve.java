package com.seckill.valve;

import com.seckill.protocol.OrderRequest;
import com.seckill.protocol.OrderResponse;

/**
 * User: 黄锴
 * Date: 13-11-17
 * Time: 下午2:16
 */
public interface Valve {

    public String getInfo();

    public Valve getNext();

    public void setNext(Valve valve);

    public void backgroundProcess();

    public void invoke(OrderRequest request, OrderResponse response);

}
