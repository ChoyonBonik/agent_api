package com.example.testapi.entity;

public class Item {

	private String title;
    private double addprice;
    private boolean state;
	public Item(String title, double addprice, boolean state) {
		super();
		this.title = title;
		this.addprice = addprice;
		this.state = state;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getAddprice() {
		return addprice;
	}
	public void setAddprice(double addprice) {
		this.addprice = addprice;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
    
    
}
