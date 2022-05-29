package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDetails {
	private int userid;
	private String name;
	private int age;

	
	public  void acceptUserDetails()
	{
		try {
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter user id ");
			userid=scanner.nextInt();
			
			System.out.println("Enter user name");
			name=scanner.next();
			
			System.out.println("Enter user age");
			age=scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
				System.out.println("Please enter valid input");
				System.out.println("Invalid Input from user");
		}
		finally {
			System.out.println("Details accepted!");
			
		}
		
     }
	public void displayUserDetails()
	{
		System.out.println("userid="+userid);
		System.out.println("name="+name);
		System.out.println("Age="+age);
	}
}
