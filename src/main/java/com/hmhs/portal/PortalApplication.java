package com.hmhs.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author yogesh
 *
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@ComponentScan(basePackages = "com.hmhs.portal")
@EnableResourceServer
public class PortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
	}
	
	/**
	 * Add LoadBalanced only if wanted to use the Eureka Ribbon feature
	 * Which it caches the service url and manages which container to use
	 * In our example use it only for RestTempleteEurekaRibbon
	 * @return
	 */
	@LoadBalanced
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}