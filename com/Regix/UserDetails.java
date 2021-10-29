package com.Regix;

import java.util.Scanner;

public class UserDetails {
	UserRegistration ur = new UserRegistration();
	Scanner sc = new Scanner(System.in);
	
	public void userFirstName() {
		System.out.println("Enter the first name: ");
		String fName = sc.next();
		ur.firstName(fName);
	}
	
	public void userLastName() {
		System.out.println("Enter the Last name: ");
		String lName = sc.next();
		ur.lastName(lName);
	}
	
	public void userEmail() {
		System.out.println("Enter the Email: ");
		String mailId = sc.next();
		ur.emailId(mailId);
	}
	
	public void userMobile() {
		System.out.println("Enter the Mobile Number: ");
		String mobileNumber = sc.next();
		ur.phoneNumber(mobileNumber);
	}
	
	public void userPassword() {
		System.out.println("Enter the Password: ");
		String password = sc.next();
		ur.password(password);
	}
	
	public void sampleEmail() {
		SampleEmail sampleEmail = new SampleEmail();
		sampleEmail.testForValidEmails();
	}
}


