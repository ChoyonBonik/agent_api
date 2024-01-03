package com.example.testapi.entity;

import java.util.List;

public class Product {
	
	private int id;
    private String img;
    private String name;
    private String shortdesc;
    private double price;
    private int rating;
    private List<Integer> category;
    private List<Size> sizes;
    private String sku;
    private List<Integer> tags;
    private List<Attribute> attributes;
    private String longdescription;
    private List<Review> reviews;
	public Product(int id, String img, String name, String shortdesc, double price, int rating, List<Integer> category,
			List<Size> sizes, String sku, List<Integer> tags, List<Attribute> attributes, String longdescription,
			List<Review> reviews) {
		super();
		this.id = id;
		this.img = img;
		this.name = name;
		this.shortdesc = shortdesc;
		this.price = price;
		this.rating = rating;
		this.category = category;
		this.sizes = sizes;
		this.sku = sku;
		this.tags = tags;
		this.attributes = attributes;
		this.longdescription = longdescription;
		this.reviews = reviews;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getShortdesc() {
		return shortdesc;
	}
	public void setShortdesc(String shortdesc) {
		this.shortdesc = shortdesc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public List<Integer> getCategory() {
		return category;
	}
	public void setCategory(List<Integer> category) {
		this.category = category;
	}
	public List<Size> getSizes() {
		return sizes;
	}
	public void setSizes(List<Size> sizes) {
		this.sizes = sizes;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public List<Integer> getTags() {
		return tags;
	}
	public void setTags(List<Integer> tags) {
		this.tags = tags;
	}
	public List<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}
	public String getLongdescription() {
		return longdescription;
	}
	public void setLongdescription(String longdescription) {
		this.longdescription = longdescription;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
    
    

}
