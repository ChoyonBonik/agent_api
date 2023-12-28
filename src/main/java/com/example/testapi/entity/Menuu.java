package com.example.testapi.entity;

import java.util.List;


public class Menuu {
	
	private Long menuId;
	private String header;
	private Boolean child;
	private String logo;
	
    List<SubMenu> subMenu;
	
	public Menuu(Long menuId, String header, Boolean child, String logo) {
	
		this.menuId = menuId;
		this.header = header;
		this.child = child;
		this.logo = logo;
	}
	

	public Menuu(Long menuId, String header, Boolean child, String logo, List<SubMenu> subMenu) {
		super();
		this.menuId = menuId;
		this.header = header;
		this.child = child;
		this.logo = logo;
		this.subMenu = subMenu;
	}


	public Menuu() {
		
	}
	
	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Boolean getChild() {
		return child;
	}

	public void setChild(Boolean child) {
		this.child = child;
	}
	
	public String getLogo() {
		return logo;
	}
	
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public List<SubMenu> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(List<SubMenu> subMenu) {
		this.subMenu = subMenu;
	}

	
}
