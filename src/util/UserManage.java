package util;

import java.util.Scanner;

import data.model.User;

public class UserManage{
	
	private Scanner in = new Scanner(System.in);
	private static UserManage instance = null;
	
	
	  public static UserManage getInstance() {
		    if(instance == null)
		      instance = new UserManage();
		    return instance;
		  }

	public void addUser(User user) {
		

	}

	public void deleteUser(String login) {


	}

}
