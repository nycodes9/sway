package com.sway.app.datamodels;

import java.net.URL;
import java.util.Date;

import com.stackmob.sdk.model.StackMobModel;

public class WishObject extends StackMobModel{

	public WishObject() {
		super(WishObject.class);
	}
	
	String wishID;
	String productName;
	URL productURL;
	URL productImageURL;
	
	String merchantID;
	String merchantName;
	double price;
	
	Date whenCreated;
	Date whenExpires;
	
	public String getWishID() {
		return wishID;
	}
	public void setWishID(String wishID) {
		this.wishID = wishID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public URL getProductURL() {
		return productURL;
	}
	public void setProductURL(URL productURL) {
		this.productURL = productURL;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMerchantID() {
		return merchantID;
	}
	public void setMerchantID(String merchantID) {
		this.merchantID = merchantID;
	}
	public Date getWhenCreated() {
		return whenCreated;
	}
	public void setWhenCreated(Date whenCreated) {
		this.whenCreated = whenCreated;
	}
	public Date getWhenExpires() {
		return whenExpires;
	}
	public void setWhenExpires(Date whenExpires) {
		this.whenExpires = whenExpires;
	}
	public URL getProductImageURL() {
		return productImageURL;
	}
	public void setProductImageURL(URL productImageURL) {
		this.productImageURL = productImageURL;
	}
}
