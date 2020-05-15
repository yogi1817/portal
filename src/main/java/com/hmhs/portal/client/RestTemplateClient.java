package com.hmhs.portal.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hmhs.portal.dto.IdCardDTO;

@Service("RestTempleteCallingIPAddressDirectly")
public class RestTemplateClient implements PortalClient {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public IdCardDTO getIdCardMetadata(String umi) {
		IdCardDTO idCardDto = restTemplate.getForObject(
				"http://localhost:8080/idCard/getIdCard/"+umi, IdCardDTO.class);
		return idCardDto;
	}

}
