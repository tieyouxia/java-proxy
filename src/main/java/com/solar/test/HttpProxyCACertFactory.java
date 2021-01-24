package com.solar.test;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;

/**
 * @author tieyouxia
 * @version 2021-01-22 15:05
 */
public interface HttpProxyCACertFactory {
    X509Certificate getCACert() throws Exception;

    PrivateKey getCAPriKey() throws Exception;

}
