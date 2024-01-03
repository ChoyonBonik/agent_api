package com.example.testapi.entity;

public class Size {
	
	private String size;
    private boolean state;
	public Size(String size, boolean state) {
		super();
		this.size = size;
		this.state = state;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
    
    

}
