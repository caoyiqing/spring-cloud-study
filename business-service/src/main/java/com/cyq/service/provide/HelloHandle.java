package com.cyq.service.provide;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHandle {

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/hello")
	public String hello() {
		List<String> services = discoveryClient.getServices();
		for (String s : services) {
			System.out.println(s);
		}
		
		try {
			System.out.println("休眠20S");
			Thread.sleep(20000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "hello spring cloud!";
	}

}
