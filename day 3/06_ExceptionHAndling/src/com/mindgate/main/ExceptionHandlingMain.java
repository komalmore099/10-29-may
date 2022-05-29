package com.mindgate.main;

import com.mindgate.pojo.UserDetails;

public class ExceptionHandlingMain {

	public static void main(String[] args) {
		System.out.println("main start");
		UserDetails userDetails=new UserDetails();
	userDetails.acceptUserDetails();
	userDetails.displayUserDetails();
	System.out.println("main ends");
	
	try {
		Class.forName("com.mindgate.pojo.UserDatails");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	}

}
