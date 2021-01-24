package com.solar.test;

import io.netty.channel.Channel;

/**
 * @author tieyouxia
 * @version 2021-01-22 15:14
 */
public class HttpProxyExceptionHandle {
    public void beforeCatch(Channel clientChannel, Throwable cause) throws Exception {
        throw new Exception(cause);
    }

    public void afterCatch(Channel clientChannel, Channel proxyChannel, Throwable cause)
            throws Exception {
        throw new Exception(cause);
    }

}
