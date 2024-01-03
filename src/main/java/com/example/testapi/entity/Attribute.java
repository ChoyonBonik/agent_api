package com.example.testapi.entity;

import java.util.List;

public class Attribute {
	
	private String name;
    private String icon;
    private String type;
    private List<Item> items;
	public Attribute(String name, String icon, String type, List<Item> items) {
		super();
		this.name = name;
		this.icon = icon;
		this.type = type;
		this.items = items;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
    
    

}
