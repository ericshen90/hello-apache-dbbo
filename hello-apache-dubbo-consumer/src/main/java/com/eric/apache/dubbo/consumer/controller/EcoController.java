package com.eric.apache.dubbo.consumer.controller;

import com.eric.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EricShen
 * @date 2019-11-28
 */
@RestController
public class EcoController {

  @Reference(version = "1.0.0")
  private EchoService echoService;

  @GetMapping(value = "echo/{str}")
  public String echo(@PathVariable String str) {
    return echoService.echo(str);
  }

}
