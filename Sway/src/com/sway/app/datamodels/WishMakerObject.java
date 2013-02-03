package com.sway.app.datamodels;

import java.util.ArrayList;

import com.stackmob.sdk.api.StackMobGeoPoint;
import com.stackmob.sdk.model.StackMobModel;

public class WishMakerObject extends StackMobModel {

	public WishMakerObject() {
		super(WishMakerObject.class);
	}

	String personID;
	String personName;
	ArrayList<WishObject> wishListObjectArray;
	StackMobGeoPoint lastKnownLocation;
	String personEmail;

	public String getPersonID() {
		return personID;
	}

	public void setPersonID(String personID) {
		this.personID = personID;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public ArrayList<WishObject> getWishListObjectArray() {
		return wishListObjectArray;
	}

	public void setWishListObjectArray(ArrayList<WishObject> wishListObjectArray) {
		this.wishListObjectArray = wishListObjectArray;
	}

	public StackMobGeoPoint getLastKnownLocation() {
		return lastKnownLocation;
	}

	public void setLastKnownLocation(StackMobGeoPoint lastKnownLocation) {
		this.lastKnownLocation = lastKnownLocation;
	}

	public String getPersonEmail() {
		return personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

}
