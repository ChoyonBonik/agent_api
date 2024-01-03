package com.example.testapi.entity;

public class Review {
	
	private String img;
    private String name;
    private String date;
    private int rating;
    private String comment;
	public Review(String img, String name, String date, int rating, String comment) {
		super();
		this.img = img;
		this.name = name;
		this.date = date;
		this.rating = rating;
		this.comment = comment;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
    
    

}
