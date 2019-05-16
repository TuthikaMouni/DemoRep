package com.pnb.email;
import java.util.*;
import java.lang.*;
import java.security.SecureRandom;
class Email {
	String firstname,lastname,password,department,alternateemail,passwordchange;
	int mailBoxCapacity=300,n;
	Scanner sc = new Scanner(System.in);
	Email() {
		System.out.print("Enter FirstName : ");
		firstname=sc.next();
		System.out.print("Enter LastName : ");
		lastname=sc.next();
	}
	public String getDepartment() {
		System.out.print("Choose Department : ");
		n=sc.nextInt();
		if(n == 1) {
			department="sales";
		}
		else if(n == 2) {
			department="development";
		}
		else if(n == 3) {
			department="accounting";
		}
		else {
			System.out.println("Development is : -");
		}
		return department;
	}
	private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	public static String generatePassword(int length) {
        StringBuilder returnValue = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return new String(returnValue);
    }	
	public void alternateEmail() {
		System.out.print("Enter alternate email : ");
		alternateemail=sc.next();
	}
	public void changePassword() {
		System.out.print("Do you want to change the password : ");
		passwordchange=sc.next();
		if(passwordchange.equalsIgnoreCase("yes") || passwordchange.equalsIgnoreCase("no")) {
			System.out.println(passwordchange);
		}
	}
	public void createEmail() {
		System.out.println("Your emailid is : "+firstname+"."+lastname+"@"+department+"."+"pnb.com");
	}
}
public class EmailDemo {
	public static void main(String[] args) {
		Email email = new Email();
		String res=email.getDepartment();
		System.out.println("Department is : "+res);
		int passwordLength = 10;
        String password = email.generatePassword(passwordLength);
        System.out.println("Secure password: " + password);
        email.alternateEmail();
        email.changePassword();
        email.createEmail();
	}
}
