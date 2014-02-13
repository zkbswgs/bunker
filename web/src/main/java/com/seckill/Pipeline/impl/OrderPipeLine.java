package com.seckill.Pipeline.impl;

import com.seckill.Pipeline.PipeLine;
import com.seckill.valve.Valve;

/**
 * User: 黄锴
 * Date: 13-11-17
 * Time: 下午3:25
 */
public class OrderPipeLine implements PipeLine{
    @Override
    public Valve getBasic() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setBasic(Valve valve) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addValve(Valve valve) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Valve[] getValves() {
        return new Valve[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeValve(Valve valve) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Valve getFirst() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
