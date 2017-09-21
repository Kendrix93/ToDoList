package panelControlls;

import java.util.Scanner;

import data.model.Project;
import data.model.User;
import data.model.UserType;
import util.ProjectManage;
import util.UserManage;

public class MenuController {
	
	private static Scanner in = new Scanner(System.in);
	
	
	public static void addUser(String userLogin) {
		
		String name, surname, login, password;
		UserType userType;
		int a = 0;
		
		System.out.println("User name");
		name = in.next();
		System.out.println("User surname");
		surname = in.next();
		System.out.println("User login");
		login = in.next();
		System.out.println("User password");
		password = in.next();
		System.out.println("User Type? ADMIN or USER");
		System.out.println("1. ADMIN");
		System.out.println("2. USER");
		if (a == 1) {
			userType = UserType.ADMIN;
		}else {
			userType = UserType.USER;
		}
		in.nextLine();
		
		UserManage.getInstance().addUser(new User(name, surname, login, password, userType), userLogin);
		
		
	}
	
	
	public static void deleteUser(String userLogin) {
		
		System.out.println("User login");
		String login = in.next();
		UserManage.getInstance().deleteUser(login, userLogin);
		
	}
	
	public static void changeUserPassword(String userLogin) {
		
		String login, password;
		
		System.out.println("User login");
		login = in.next();
		System.out.println("Write new password for " + login);
		password = in.next();
		
		UserManage.getInstance().changeUserPassword(login, password, userLogin);
	}
	
	public static void showUsers() {
		UserManage.getInstance().showUser();
	}
	
	public static void addProject(String userType, String userLogin) {
		
		String projectName, projectDescription;
		
		System.out.println("Project name");
		projectName = in.nextLine();
		System.out.println("Write project description");
		projectDescription = in.nextLine();
		
		
		ProjectManage.addProject(new Project(projectName, projectDescription, userLogin), userType, userLogin);
		
		
	}
	
	public static void deleteProject(String userType, String userLogin) {
		
		System.out.println("Project name");
		String projectName = in.nextLine();
		
		ProjectManage.deleteProject(projectName, userType, userLogin);
		
		
	}
	
	public static void showAllProjects() {
		ProjectManage.showAllProjects();
	}

}
