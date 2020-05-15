package com.hmhs.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.hmhs.portal.client.IDCardFeignClient;
import com.hmhs.portal.client.PortalClient;
import com.hmhs.portal.dto.IdCardDTO;

@Service
public class PortalServiceImpl implements PortalService{

	/**
	 * @Value directly use the application.property file to read tha values.
	 */
	@Value("${portal.clientType}")
	private String clientType;
	
	@Autowired
	@Qualifier("RestTempleteCallingIPAddressDirectly")
	private PortalClient restClient;
	
	@Autowired
	@Qualifier("RestTempleteEurekaRibbon")
	private PortalClient ribbonClient;
	
	@Autowired
	private IDCardFeignClient feignClient;
	
	@Override
	public IdCardDTO getIdCard(String umi) {
		if("RestTempleteCallingIPAddressDirectly".equals(clientType)) {
			return restClient.getIdCardMetadata(umi);
		}else if("RestTempleteEurekaRibbon".equals(clientType)) {
			return ribbonClient.getIdCardMetadata(umi);
		}else if("feignClient".equals(clientType)) {
			return feignClient.getIdCardMetadata(umi);
		}
		return null;
	}
}
