package com.cyq.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.cyq.gateway.bean.RequestTimeGatewayFilterFactory;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args );
    }

    @Bean
    public RequestTimeGatewayFilterFactory requestTimeGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }
	

}
