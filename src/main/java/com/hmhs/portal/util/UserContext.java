package com.hmhs.portal.util;

import org.springframework.stereotype.Component;

@Component
public class UserContext {
	public static String CORRELATION_ID = "tmx-correlation-id";
    public static String AUTH_TOKEN     = "Authorization";
    public static String USER_ID        = "tmx-user-id";
    public static String ORG_ID         = "tmx-org-id";
	
    private String correlationId= new String();
    private String authToken= new String();
    private String userId = new String();
    private String orgId = new String();
	/**
	 * @return the correlationId
	 */
	public String getCorrelationId() {
		return correlationId;
	}
	/**
	 * @param correlationId the correlationId to set
	 */
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	/**
	 * @return the authToken
	 */
	public String getAuthToken() {
		return authToken;
	}
	/**
	 * @param authToken the authToken to set
	 */
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the orgId
	 */
	public String getOrgId() {
		return orgId;
	}
	/**
	 * @param orgId the orgId to set
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	} 
}
