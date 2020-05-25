package com.cyq.web.fallback;

import org.springframework.stereotype.Component;

import com.cyq.web.service.IHelloService;

import feign.hystrix.FallbackFactory;

@Component
public class HelloServiceFallbackFactory implements FallbackFactory<IHelloService> {

	@Override
	public IHelloService create(Throwable arg0) {
		return new IHelloService() {
			
			@Override
			public String hello() {
				return "fallback";
			}
		};
	}

}
