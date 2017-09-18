package util;

import java.util.ArrayList;

import data.holder.DataHolder;
import data.model.User;
import main.MenuPanel;

public class UserManage{
	
//	private Scanner in = new Scanner(System.in);
	private static UserManage instance = null;
	private ArrayList<User> users = DataHolder.getUser();
	
	
	  public static UserManage getInstance() {
		    if(instance == null)
		      instance = new UserManage();
		    return instance;
		  }
	  

	public void addUser(User user) {
		
		for (User u: users) {
			if(u.getLogin().equals(user.getLogin())) {
				System.out.println("Login unavailable");
				MenuPanel.adminPanel();
			}
			
		}
		users.add(user);
		
		
//		if(!users.contains(user))
//		users.add(user);
//		else 
//		System.out.println("User is already in base");	

	}

	public void deleteUser(String login) {
		
		for (User u: users) {
			if(u.getLogin().equals(login)) {
				users.remove(u);
				MenuPanel.adminPanel();
			}
		}
		System.out.println("Wrong login");

	}
	
	public void showUser() {
		for (User u: users) 
			System.out.println(u);
	}

}
