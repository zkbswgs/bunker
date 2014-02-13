package com.ark4web.trade_bootstrap.bunker.core.pipe;

import com.ark4web.trade_bootstrap.bunker.core.protocol.Request;
import com.ark4web.trade_bootstrap.bunker.core.protocol.Response;

/**
 * User: 黄锴
 * Date: 13-11-19
 * Time: 下午9:59
 */
public interface Pipe {
    public String getInfo();

    public Pipe getNext();

    public void  process(Request request,Response response);

}
