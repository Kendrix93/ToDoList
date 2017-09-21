package panelControlls;

import java.util.Scanner;

import util.SaveToCSV;

public class MenuPanel{
	
	private static Scanner in = new Scanner(System.in);
	
	
	public static void userPanel() {
		
		SaveToCSV.saveToFileUser();
		SaveToCSV.saveToFileProject();
		SaveToCSV.saveToFileTask();
		
		System.out.println("Welcome");
		System.out.println("1. Add project");
		System.out.println("2. Add task");
		System.out.println("3. Show all taks to project");
		System.out.println("4. Change task status");
		System.out.println("5. Edit task");
		System.out.println("6. Delete task");
		System.out.println("7. Delete project");
		System.out.println("0. Logout");
		
		int a = in.nextInt();
		
		switch(a) {
		
		case 1:
			
		case 2:
			
			
			
		}
		
	}
	
	
	
	public static void adminPanel(String userLogin) {
		
		
		SaveToCSV.saveToFileUser();
		SaveToCSV.saveToFileProject();
		SaveToCSV.saveToFileTask();
		
		String userType = "ADMIN";
		
		System.out.println("Welcome to Admin Panel");
		System.out.println("1. Add user");
		System.out.println("2. Delete user");
		System.out.println("3. Change user password");
		System.out.println("4. Add project");
		System.out.println("5. Add task");
		System.out.println("6. Show all taks to project");
		System.out.println("7. Change task status");
		System.out.println("8. Edit task");
		System.out.println("9. Delete task");
		System.out.println("10. Delete project");
		System.out.println("11. Show users");
		System.out.println("12. Show all projects");
		System.out.println("0. Logout");
		
		
		
		int a = in.nextInt();
		
		switch(a) {
		
		case 1:
			MenuController.addUser(userLogin);
			adminPanel(userLogin);
		case 2:
			MenuController.deleteUser(userLogin);
			adminPanel(userLogin);
		case 3:
			MenuController.changeUserPassword(userLogin);
			adminPanel(userLogin);
		case 4:
			MenuController.addProject(userType, userLogin);
			adminPanel(userLogin);
		case 5:
			MenuTaskController.addTask(userType, userLogin);
			adminPanel(userLogin);
		case 6:
			MenuTaskController.showAllTasks();
			adminPanel(userLogin);
			
			
		case 10:
			MenuController.deleteProject(userType, userLogin);
			adminPanel(userLogin);
		case 11:
			MenuController.showUsers();
			adminPanel(userLogin);
		case 12:
			MenuController.showAllProjects();
			adminPanel(userLogin);
		}
	}

}
