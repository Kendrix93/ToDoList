package main;

import java.util.Scanner;

import data.model.User;
import util.UserManage;

public class MenuController {
	
	private static Scanner in = new Scanner(System.in);
	
	
	public static void addUser() {
		
		String name, surname, login, password, userType;
		
		System.out.println("User name");
		name = in.next();
		System.out.println("User surname");
		surname = in.next();
		System.out.println("User login");
		login = in.next();
		System.out.println("User password");
		password = in.next();
		System.out.println("User Type? ADMIN or USER");
		userType = in.next();
		
		UserManage.getInstance().addUser(new User(name, surname, login, password, userType));
		
		
	}
	
	
	public static void deleteUser() {
		
		System.out.println("User login");
		String login = in.next();
		UserManage.getInstance().deleteUser(login);
		
	}
	
	public static void showUsers() {
		UserManage.getInstance().showUser();
	}
	
	public static void addProject(String userType) {
		
		
	}
	
	public static void deleteProject(String userType) {
		
		
	}

}
