package com.cyq.web.fallback;

import org.springframework.stereotype.Component;

import com.cyq.web.service.IHelloService;

@Component
public class HelloServiceFallBack implements IHelloService {

	@Override
	public String hello() {
		return "进入熔断方法...";
	}

}
