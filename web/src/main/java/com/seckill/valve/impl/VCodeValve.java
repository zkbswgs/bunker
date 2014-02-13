package com.seckill.valve.impl;

import com.seckill.valve.Valve;
import com.seckill.protocol.OrderRequest;
import com.seckill.protocol.OrderResponse;

/**
 * User: 黄锴
 * Date: 13-11-17
 * Time: 下午3:26
 */
public class VCodeValve implements Valve {
    private final String info = "VCode_Valve";
    private Valve next;


    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public Valve getNext() {
        return this.next;
    }

    @Override
    public void setNext(Valve valve) {
        this.next = valve;
    }

    @Override
    public void backgroundProcess() {
        //DO Nothing
    }

    @Override
    public void invoke(OrderRequest request, OrderResponse response) {

    }
}
