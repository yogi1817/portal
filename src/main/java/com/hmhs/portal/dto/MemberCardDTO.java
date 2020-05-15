package com.hmhs.portal.dto;

import java.io.Serializable;
import java.net.URL;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MemberCardDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String relCode;
	private URL memberIdCardUrl;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastname
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the relCode
	 */
	public String getRelCode() {
		return relCode;
	}
	/**
	 * @param relCode the relCode to set
	 */
	public void setRelCode(String relCode) {
		this.relCode = relCode;
	}
	/**
	 * @return the memberIdCardUrl
	 */
	public URL getMemberIdCardUrl() {
		return memberIdCardUrl;
	}
	/**
	 * @param memberIdCardUrl the memberIdCardUrl to set
	 */
	public void setMemberIdCardUrl(URL memberIdCardUrl) {
		this.memberIdCardUrl = memberIdCardUrl;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "MemberCardDTO [firstName=" + firstName + ", lastname=" + lastName + ", relCode=" + relCode
				+ ", memberIdCardUrl=" + memberIdCardUrl + "]";
	}
}
