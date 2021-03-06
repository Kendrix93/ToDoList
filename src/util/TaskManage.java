package util;

import java.util.ArrayList;

import data.holder.DataHolder;
import data.model.Project;
import data.model.Task;
import data.model.TaskStatus;
import panelControlls.MenuPanel;

public class TaskManage {

	private static ArrayList<Task> tasks = DataHolder.getTask();
	private static ArrayList<Project> projects = DataHolder.getProject();

	public static void addTask(Task task, String userLogin, String userType) {

		for (Project p : projects) {
			if (p.getProjectName().equals(task.getProjectName())) {
				for (Task t : tasks) {
					if (t.getTaskName().equals(task.getTaskName())) {
						System.out.println("Task is already existance");
						if (userType == "ADMIN") {
							MenuPanel.adminPanel(userLogin);
						} else {
							MenuPanel.userPanel(userLogin);
						}
					}
				}
			}
		}
		tasks.add(task);

	}

	public static void showAllTasks() {

		for (Task t : tasks)
			System.out.println(t);

	}

	public static void deleteTask(String taskName, String projectName, String userLogin, String userType) {

		for (Task t : tasks) {
			if (t.getTaskName().equals(taskName) && t.getProjectName().equals(projectName)) {
				tasks.remove(t);
				if (userType == "ADMIN") {
					MenuPanel.adminPanel(userLogin);
				} else {
					MenuPanel.userPanel(userLogin);
				}
			}
		}
		System.out.println("Wrong task or project");

	}

	public static void changeTaskStatus(String taskName, String projectName, String userLogin, String userType,
			TaskStatus taskStatus) {

		for (Task t : tasks) {
			if (t.getTaskName().equals(taskName) && t.getProjectName().equals(projectName)) {
				t.setTaskStatus(taskStatus);
				if (userType == "ADMIN") {
					MenuPanel.adminPanel(userLogin);
				} else {
					MenuPanel.userPanel(userLogin);
				}
			}
		}
		System.out.println("Wrong task or project");

	}

	public static void editTask(String taskName, String projectName, String userLogin, String userType,
			String taskDescription) {

		for (Task t : tasks) {
			if (t.getProjectName().equals(projectName) && t.getTaskName().equals(taskName)) {
				t.setTaskDescription(taskDescription);
				if (userType == "ADMIN") {
					MenuPanel.adminPanel(userLogin);
				} else {
					MenuPanel.userPanel(userLogin);
				}
			}
		}
		System.out.println("Wrong task or project");
	}
	
	public static void showAllUserProjectTask(String userLogin, String projectName) {
		
		for (Task t : tasks) {
			if (t.getUserLogin().equals(userLogin) && t.getProjectName().equals(projectName)) {
				System.out.println(t);
			}
		}
		
	}
	

}
