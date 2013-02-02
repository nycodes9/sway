package com.sway.app.datamodels;

import java.util.ArrayList;

import android.location.Location;
import android.provider.ContactsContract.CommonDataKinds.Email;

public class WishMakerObject {

	long personID;
	String personName;
	ArrayList<WishObject> wishListObjectArray;
	Location lastKnownLocation;
	Email personEmail;
	
}
