package com.Regix;

import java.util.Scanner;

public class RegisterationMain {
	

	UserDetails userDetails = new UserDetails();
	Scanner sc = new Scanner(System.in);
		
		public void choice() {
	        while (true) {
	            System.out.println("Enter 1 To Check First Name\n"
	                             + "Enter 2 To Check Second Name\n"
	                             + "Enter 3 To Check EmailId\n"
	                             + "Enter 4 To Check Mobile Number\n"
	                             + "Enter 5 To Check Password\n"
	                             + "\nEnter 6 To test the sample EmailIds\n"
	                             + "Enter 0 To Exit");
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1 :
	                	userDetails.userFirstName();
	                    break;
	                case 2 :
	                	userDetails.userLastName();
	                    break;
	                case 3 :
	                	userDetails.userEmail();
	                    break;
	                case 4 :
	                	userDetails.userMobile();
	                    break;
	                case 5 :
	                	userDetails.userPassword();
	                    break;
	               case 6 :
	            	   userDetails.sampleEmail();
	            	   break;
	                case 0:
	                    System.exit(0);
	                    break;
	                default :
	                    System.out.println("Enter the wrong input \n Please enter the Correct input");
	                    continue;
	            }
	        }
		}
	
		public static void main(String[] args) {
			RegisterationMain main = new RegisterationMain();	
			main.choice();
		}
}
	

