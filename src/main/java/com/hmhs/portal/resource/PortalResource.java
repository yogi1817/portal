package com.hmhs.portal.resource;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmhs.portal.dto.IdCardDTO;
import com.hmhs.portal.service.PortalService;

@RestController
@RequestMapping("portal")
public class PortalResource {

	private static final Logger logger = Logger.getLogger(PortalResource.class.getName());
	
	@Autowired
	private PortalService portalService;
	
	@GetMapping(value = "getIdCard/{umi}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<IdCardDTO> getIdCardMetadata(@PathVariable String umi){
		logger.info("inside PortalResource getIdCardMetadata");
		return new ResponseEntity<>(portalService.getIdCard(umi), HttpStatus.OK);
	}
}
