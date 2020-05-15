package com.hmhs.portal.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hmhs.portal.dto.IdCardDTO;

@Service("RestTempleteEurekaRibbon")
public class RibbonRestTemplateClient implements PortalClient {

	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * In this case IDCard will be read from Eureka server and will be replaced by 
	 * IDCARD =192.168.1.14:8081 this also can be seen in eureka server logs
	 */
	@Override
	public IdCardDTO getIdCardMetadata(String umi) {
		ResponseEntity<IdCardDTO> restExchange = 
				restTemplate.exchange("http://idcard/idCard/getIdCard/{umi}", HttpMethod.GET,
						null, IdCardDTO.class, umi);
				
		return restExchange.getBody();
	}
}
