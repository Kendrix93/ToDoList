package panelControlls;

import java.util.Scanner;

import util.SaveToCSV;

public class MenuPanel{
	
	private static Scanner in = new Scanner(System.in);
	
	
	public static void userPanel(String userLogin) {
		
		String userType = "USER";
		
		SaveToCSV.saveToFileUser();
		SaveToCSV.saveToFileProject();
		SaveToCSV.saveToFileTask();
		
		System.out.println("Welcome");
		System.out.println("1. Add project");
		System.out.println("2. Add task");
		System.out.println("3. Show all my project");
		System.out.println("4. Show my project and tasks");
		System.out.println("5. Show all my task to project");
		System.out.println("6. Change task status");
		System.out.println("7. Edit task");
		System.out.println("8. Delete task");
		System.out.println("9. Delete project");
		System.out.println("0. Logout");
		
		int a = in.nextInt();
		
		switch(a) {
		
		case 1:
			MenuController.addProject(userType, userLogin);
			userPanel(userLogin);
		case 2:
			MenuTaskController.addTask(userType, userLogin);
			userPanel(userLogin);
		case 3:
			MenuController.showAllUserProject(userLogin);
			userPanel(userLogin);
		case 4:
			MenuController.showAllUserProjectAndTask(userLogin);
			userPanel(userLogin);
		case 5:
			MenuTaskController.showAllUserProjectTask(userLogin);
			userPanel(userLogin);
		case 6:
			MenuTaskController.changeTaskStatus(userType, userLogin);
			userPanel(userLogin);
		case 7:
			MenuTaskController.editTask(userType, userLogin);
			userPanel(userLogin);
		case 8:
			MenuTaskController.deleteTask(userType, userLogin);
			userPanel(userLogin);
		case 9:
			MenuController.deleteProject(userType, userLogin);
			userPanel(userLogin);
		case 0:
			System.exit(0);
			
			
			
			
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
		System.out.println("6. Show all my projects");
		System.out.println("7. Show all taks to project");
		System.out.println("8. Show all my Projects and tasks");
		System.out.println("9. Change task status");
		System.out.println("10. Edit task");
		System.out.println("11. Delete task");
		System.out.println("12. Delete project");
		System.out.println("13. Show users");
		System.out.println("14. Show all projects");
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
			MenuController.showAllUserProject(userLogin);
			adminPanel(userLogin);
		case 7:
			MenuTaskController.showAllUserProjectTask(userLogin);
			adminPanel(userLogin);
		case 8:
			MenuController.showAllUserProjectAndTask(userLogin);
			adminPanel(userLogin);
		case 9:
			MenuTaskController.changeTaskStatus(userType, userLogin);
			adminPanel(userLogin);
		case 10:
			MenuTaskController.editTask(userType, userLogin);
			adminPanel(userLogin);
		case 11:
			MenuTaskController.deleteTask(userType, userLogin);
			adminPanel(userLogin);
		case 12:
			MenuController.deleteProject(userType, userLogin);
			adminPanel(userLogin);
		case 13:
			MenuController.showUsers();
			adminPanel(userLogin);
		case 14:
			MenuController.showAllProjects();
			adminPanel(userLogin);
		case 0:
			System.exit(0);
		}
	}

}
