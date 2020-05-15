package com.hmhs.portal.dto;

import java.io.Serializable;
import java.net.URL;
import java.util.List;

public class IdCardDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String umi;
	private String groupNumber;
	private URL familyIdCardUrl;
	private String brand;
	private List<MemberCardDTO> memberIDCards;
	
	/**
	 * @return the umi
	 */
	public String getUmi() {
		return umi;
	}
	
	/**
	 * @param umi the umi to set
	 */
	public void setUmi(String umi) {
		this.umi = umi;
	}
	
	/**
	 * @return the groupNumber
	 */
	public String getGroupNumber() {
		return groupNumber;
	}
	
	/**
	 * @param groupNumber the groupNumber to set
	 */
	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}
	
	
	
	/**
	 * @return the familyIdCardUrl
	 */
	public URL getFamilyIdCardUrl() {
		return familyIdCardUrl;
	}

	/**
	 * @param familyIdCardUrl the familyIdCardUrl to set
	 */
	public void setFamilyIdCardUrl(URL familyIdCardUrl) {
		this.familyIdCardUrl = familyIdCardUrl;
	}

	/**
	 * @return the memberIDCards
	 */
	public List<MemberCardDTO> getMemberIDCards() {
		return memberIDCards;
	}
	
	/**
	 * @param memberIDCards the memberIDCards to set
	 */
	public void setMemberIDCards(List<MemberCardDTO> memberIDCards) {
		this.memberIDCards = memberIDCards;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "IdCardDTO [umi=" + umi + ", groupNumber=" + groupNumber + ", familyIdCardUrl=" + familyIdCardUrl
				+ ", brand=" + brand + ", memberIDCards=" + memberIDCards + "]";
	}
}
