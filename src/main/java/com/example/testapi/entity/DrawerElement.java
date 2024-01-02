package com.example.testapi.entity;

public class DrawerElement {
	
	private Long elementId;
	private String elementName;
	private String logo;
	
	public DrawerElement(Long elementId, String elementName, String logo) {
		
		this.elementId = elementId;
		this.elementName = elementName;
		this.logo = logo;
	}

	public Long getElementId() {
		return elementId;
	}

	public void setElementId(Long elementId) {
		this.elementId = elementId;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	

}
