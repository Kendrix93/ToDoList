package main;

import java.util.Scanner;

import data.model.Task;
import util.TaskManage;

public class MenuTaskController {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void addTask(String userType, String userLogin) {
		
		String taskName, taskDescription, projectName;
		String taskStatus = "TODO";
		
		System.out.println("Project name");
		projectName = in.nextLine();
		System.out.println("Task name");
		taskName = in.nextLine();
		System.out.println("Task description");
		taskDescription = in.nextLine();
		in.nextLine();
		
		Task task = new Task(projectName, taskName, taskDescription, taskStatus, userLogin);
		
		TaskManage.addTask(task, userLogin, userType);
		
	}
	
	
	public static void deleteTask(String userType, String userLogin) {
		
		String taskName, projectName;
		
		System.out.println("Task name");
		taskName = in.nextLine();
		System.out.println("Project Name");
		projectName = in.nextLine();
		
		TaskManage.deleteTask(taskName, projectName, userLogin, userType);
		
	}
	
	public static void showAllTasks() {
		TaskManage.showAllTasks();
	}
	
	
	public static void changeTaskStatus(String userType, String userLogin) {
		
		String taskStatus, taskName, projectName;;
		
		System.out.println("Task status");
		taskStatus = in.next();
		System.out.println("Task name");
		taskName = in.nextLine();
		System.out.println("Project Name");
		projectName = in.nextLine();
		
		TaskManage.changeTaskStatus(taskName, projectName, userLogin, userType, taskStatus);
	}
	

}
