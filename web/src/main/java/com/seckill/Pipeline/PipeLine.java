package com.seckill.Pipeline;

import com.seckill.valve.Valve;

/**
 * User: 黄锴
 * Date: 13-11-17
 * Time: 下午2:23
 */
public interface PipeLine {

    public Valve getBasic();

    public void setBasic(Valve valve);

    public void addValve(Valve valve);

    public Valve[] getValves();

    public void removeValve(Valve valve);

    public Valve getFirst();
}
