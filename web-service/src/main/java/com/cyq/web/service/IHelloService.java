package com.cyq.web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cyq.web.fallback.HelloServiceFallBack;

/**
 * IHelloService
 * 配置服务提供者：business-service 是服务提供者的 application.name
 * @author xqcao2
 *
 */
@FeignClient(value = "business-service", fallback = HelloServiceFallBack.class)
public interface IHelloService {
	
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
    String hello();

}
