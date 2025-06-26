package com.subodh.SpringBeans;

import java.time.LocalTime;

public class WishMessageGenerator {
	//Has -A property
	private LocalTime time;
	
	public WishMessageGenerator(){
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	//Setter method for setter injection
	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime()");
		this.time=time;
	}
	//develop the business method
	public String showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage()");
		//get current hour of the day
		
		int hour=time.getHour();
		//generate the wish message
		if(hour<12)
			return"Good Morning:"+user;
		else if(hour<16)
			return"Good Afternoon:"+user;
		else if(hour<20)
			return"Good Evening:"+user;
		else
			return"Good Night:"+user;
	}
}
