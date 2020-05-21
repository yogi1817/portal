package com.hmhs.portal;

import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.client.RestTemplate;

import com.hmhs.portal.util.UserContextInterceptor;

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
	
	@Primary
	@Bean
	public RestTemplate getCustomRestTemplete() {
		RestTemplate template = new RestTemplate();
		List<ClientHttpRequestInterceptor> interceptors = template.getInterceptors();
		if(interceptors == null) {
			template.setInterceptors(Collections.singletonList(new UserContextInterceptor()));
		}else {
			interceptors.add(new UserContextInterceptor());
			template.setInterceptors(interceptors);
		}
		return template;
	}
}