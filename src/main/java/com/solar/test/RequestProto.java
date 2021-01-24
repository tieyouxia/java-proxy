package com.solar.test;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author tieyouxia
 * @version 2021-01-22 15:13
 */
public class RequestProto implements Serializable {

    private static final long serialVersionUID = -6471051659605127698L;
    private String host;
    private int port;
    private boolean ssl;

    public RequestProto() {
    }

    public RequestProto(String host, int port, boolean ssl) {
        this.host = host;
        this.port = port;
        this.ssl = ssl;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean getSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestProto that = (RequestProto) o;
        return port == that.port &&
                ssl == that.ssl &&
                host.equals(that.host);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, port, ssl);
    }
}

