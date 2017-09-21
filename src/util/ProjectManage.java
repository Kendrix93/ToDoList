package util;

import java.util.ArrayList;
import java.util.List;

import data.holder.DataHolder;
import data.model.Project;
import data.model.Task;
import panelControlls.MenuPanel;

public class ProjectManage {
	
	
	private static List<Project> projects = DataHolder.getProject();
	private static ArrayList<Task> tasks = DataHolder.getTask();
	
	public static void addProject(Project project, String userType, String userLogin) {
		
		for(Project p : projects) {
			if(p.getProjectName().equals(project.getProjectName())) {
				System.out.println("That project is already existence");
				if (userType == "ADMIN") {
					MenuPanel.adminPanel(userLogin);
				}else {
					MenuPanel.userPanel(userLogin);
				}
				}			
		}
		projects.add(project);
		
		
	}
	
	public static void deleteProject(String projectName, String userType, String userLogin) {
		 for(Project p : projects) {
			 if(p.getProjectName().equals(projectName)) {
				 for (Task t: tasks) {
					 if(t.getProjectName().equals(projectName)) {
						 tasks.remove(t);
						 projects.remove(p);
					 }
				 }
			 }
		 }
		System.out.println("Done deleting project and all project's tasks.");
		if(userType == "ADMIN") {
			MenuPanel.adminPanel(userLogin);
		}else {
			MenuPanel.userPanel(userLogin);
		}
	}
	
	public static void showAllProjects() {
		for (Project p : projects)
			System.out.println(p);
		
	}

}
