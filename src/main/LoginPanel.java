package main;

import java.util.Scanner;

import util.LoginManage;

public class LoginPanel {
	
	private static Scanner in = new Scanner(System.in);
	
	
	public static void Panel() {
		
		String login, password;
		
		System.out.println("Login");
		login = in.next();
		System.out.println("Password");
		password = in.next();
		
		LoginManage.Login(login, password);
	}

}
