package com.eric.apache.dubbo.provider.service;

import com.eric.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author EricShen
 * @date 2019-11-28
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

  @Value("${dubbo.protocol.port}")
  private int port;

  @Override
  public String lb() {
    return "Dubbo LoadBalance with port:" + port;
  }

  @Override
  public String echo(String str) {
    return "Echo Hello Dubbo " + str;
  }


}
