package com.hmhs.portal.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hmhs.portal.dto.IdCardDTO;

@FeignClient("idcard")
public interface IDCardFeignClient {

	@RequestMapping(
			method = RequestMethod.GET,
			value = "/idCard/getIdCard/{umi}",
			consumes = "aplication/json")
	IdCardDTO getIdCardMetadata(
			@PathVariable("umi") String umi);
}
