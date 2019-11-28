package com.eric.apache.dubbo.provider.api;

public interface EchoService {

    String lb();
    String echo(String str);
}