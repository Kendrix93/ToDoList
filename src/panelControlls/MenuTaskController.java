package panelControlls;

import java.util.Scanner;

import data.model.Task;
import data.model.TaskStatus;
import util.TaskManage;

public class MenuTaskController {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void addTask(String userType, String userLogin) {
		
		String taskName, taskDescription, projectName;
		TaskStatus taskStatus = TaskStatus.TODO;
		
		System.out.println("Project name");
		projectName = in.nextLine();
		System.out.println("Task name");
		taskName = in.nextLine();
		System.out.println("Task description");
		taskDescription = in.nextLine();
		
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
		
		String taskName, projectName;
		TaskStatus taskStatus = TaskStatus.TODO; 
		int a;
		
		
		System.out.println("Project Name");
		projectName = in.nextLine();
		System.out.println("Task name");
		taskName = in.nextLine();
		System.out.println("Task status");
		System.out.println("1. TODO");
		System.out.println("2. DOING");
		System.out.println("3. DONE");
		
		a = in.nextInt();
		if (a == 1) {
			taskStatus = TaskStatus.TODO;
		} else if ( a == 2) {
			taskStatus = TaskStatus.DOING;
		}else if (a == 3) {
			taskStatus = TaskStatus.DONE;
			
		}
		


		TaskManage.changeTaskStatus(taskName, projectName, userLogin, userType, taskStatus);
	}
	
	public static void editTask(String userType, String userLogin) {
		
		String taskDescription, taskName, projectName;
		
		System.out.println("Project Name");
		projectName = in.nextLine();
		System.out.println("Task name");
		taskName = in.nextLine();
		System.out.println("Task description");
		taskDescription = in.nextLine();
		
		TaskManage.editTask(taskName, projectName, userLogin, userType, taskDescription);
		
		
	}
	
	public static void showAllUserProjectTask(String userLogin) {
		
		System.out.println("Projest Name");
		String projectName = in.nextLine();
		
		TaskManage.showAllUserProjectTask(userLogin, projectName);
	}
	

}
