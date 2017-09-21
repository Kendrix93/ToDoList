package util;

import java.util.ArrayList;

import data.holder.DataHolder;
import data.model.User;
import panelControlls.LoginPanel;
import panelControlls.MenuPanel;

public class LoginManage {
	
	private static ArrayList<User> users = DataHolder.getUser();
	
	public static void Login (String login, String password) {
		
		for (User u: users) {
			if (u.getLogin().equals(login) && u.getPassword().equals(password)) {
				if (u.getUserType().equals("ADMIN")) {
					MenuPanel.adminPanel(u.getLogin());
				}else {
					MenuPanel.userPanel(u.getLogin());
				}
			}
		}
		System.out.println("Wrong login or password");
		LoginPanel.Panel();
	}

}
