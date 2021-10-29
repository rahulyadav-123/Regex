package com.Regix;

import java.util.Scanner;

public class RegisterationMain {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first name: ");
	String fName = sc.next();
	System.out.println("Enter the Last name: ");
	String lName = sc.next();
	UserRegistration ur = new UserRegistration();
	ur.firstName(fName);
	ur.lastName(lName);
	}
}
	

	