package com.hmhs.portal.client;

import com.hmhs.portal.dto.IdCardDTO;

public interface PortalClient {

	IdCardDTO getIdCardMetadata(String umi);

}
