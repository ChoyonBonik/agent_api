package com.example.testapi.entity;

public class SubMenu {
	
	private Long subMenuId;
	private String header;
	private String logo;
	private Long menuId;
	
	public SubMenu(Long subMenuId, String header, String logo, Long menuId) {
		
		this.subMenuId = subMenuId;
		this.header = header;
		this.logo = logo;
		this.menuId = menuId;
	}
	
	

	public Long getSubMenuId() {
		return subMenuId;
	}



	public void setSubMenuId(Long subMenuId) {
		this.subMenuId = subMenuId;
	}



	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

}
