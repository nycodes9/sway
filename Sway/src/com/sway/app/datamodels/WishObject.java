package com.sway.app.datamodels;

import java.net.URL;
import java.util.Date;

public class WishObject {

	long wishID;
	String productName;
	URL productURL;
	String merchantName;
	double price;
	
	long merchantID;
	
	Date whenCreated;
	Date whenExpires;
	
}
