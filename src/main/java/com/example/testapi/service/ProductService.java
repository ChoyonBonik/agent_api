package com.example.testapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.testapi.entity.Attribute;
import com.example.testapi.entity.Item;
import com.example.testapi.entity.Product;
import com.example.testapi.entity.Review;
import com.example.testapi.entity.Size;

public class ProductService {
	
	public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(createSampleProduct(1));
        products.add(createSampleProduct(2));

        return products;
    }
	
	private Product createSampleProduct() {

        Product product = new Product(0, null, null, null, 0, 0, null, null, null, null, null, null, null);
        product.setId(1);
        product.setImg("assets/img/prods-sm/5.png");
        product.setName("Pepperoni Pizza");
        product.setShortdesc("Por scientie, musica, sport etc");
        product.setPrice(12.99);
        product.setRating(4);
        product.setCategory(Arrays.asList(2));

        // Set sizes
        Size size = new Size(null, false);
        size.setSize("11");
        size.setState(true);
        product.setSizes(Arrays.asList(size));

        product.setSku("N/A");
        product.setTags(Arrays.asList(5, 4, 7));

        // Set attributes
        Attribute attribute = new Attribute(null, null, null, null);
        attribute.setName("Dough");
        attribute.setIcon("flaticon-bread-roll");
        attribute.setType("radio");

        Item item = new Item(null, 0, false);
        item.setTitle("Regular");
        item.setAddprice(0.00);
        item.setState(true);

        attribute.setItems(Arrays.asList(item));
        product.setAttributes(Arrays.asList(attribute));

        product.setLongdescription("Anim pariatur cliche reprehenderit");

        // Set reviews
        Review review = new Review(null, null, null, 0, null);
        review.setImg("assets/img/people/1.jpg");
        review.setName("Henry Crow");
        review.setDate("January 13, 2021");
        review.setRating(4);
        review.setComment("There are many variations of passages of Lorem Ipsum available");

        product.setReviews(Arrays.asList(review));

        return product;
    }
    
    
    private Product createSampleProduct(int productId) {
        
        Product product = new Product(productId, null, null, null, productId, productId, null, null, null, null, null, null, null);
        product.setId(2);
        product.setImg("assets/img/prods-sm/6.png");
        product.setName("Pepperoni Pizza");
        product.setShortdesc("Por scientie, musica, sport etc");
        product.setPrice(12.99);
        product.setRating(4);
        product.setCategory(Arrays.asList(2));

        // Set sizes
        Size size = new Size(null, false);
        size.setSize("12");
        size.setState(true);
        product.setSizes(Arrays.asList(size));

        product.setSku("N/A");
        product.setTags(Arrays.asList(5, 4, 7));

        // Set attributes
        Attribute attribute = new Attribute(null, null, null, null);
        attribute.setName("Dough");
        attribute.setIcon("flaticon-bread-roll");
        attribute.setType("radio");

        Item item = new Item(null, productId, false);
        item.setTitle("Regular");
        item.setAddprice(0.00);
        item.setState(true);

        attribute.setItems(Arrays.asList(item));
        product.setAttributes(Arrays.asList(attribute));

        product.setLongdescription("Anim pariatur cliche reprehenderit");

        // Set reviews
        Review review = new Review(null, null, null, productId, null);
        review.setImg("assets/img/people/1.jpg");
        review.setName("Henry Crow");
        review.setDate("January 13, 2021");
        review.setRating(5);
        review.setComment("There are many variations of passages of Lorem Ipsum available");

        product.setReviews(Arrays.asList(review));

        
        product.setId(productId);


        return product;
    }
    
    

}
