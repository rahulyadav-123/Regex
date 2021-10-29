package com.Regix;

import java.util.Scanner;

public class RegisterationMain {
	public static void main(String[] args) {
		UserRegistration ur = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first name: ");
		String fName = sc.next();
		ur.firstName(fName);
		
		System.out.println("Enter the Last name: ");
		String lName = sc.next();
		ur.lastName(lName);
		
		System.out.println("Enter the Email: ");
		String mailId = sc.next();
		ur.emailId(mailId);
		
		System.out.println("Enter the phone number : ");
		String mobileNumber = sc.next();
		ur.phoneNumber(mobileNumber);
	}


}
		
	

	