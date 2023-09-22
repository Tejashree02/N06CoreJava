package org.tnsif.customexception;

import java.util.*;
public class CustomeExceptionExecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userid= sc.nextLine();
		String password= sc.nextLine();
		try {
		if(userid.equals("tejashreeagrahari123@gmil.com") && password.equals("Pass@123")) {
			System.out.println("Credentialsare matched");
		}else 
		{
			throw new LoginCredentials("invalid");
		}
	}
	catch(LoginCredentials e) {
		System.out.println("Exception Handeled "+e);
	}
	}
	

}
