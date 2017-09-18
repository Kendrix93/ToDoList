package util;

import java.util.ArrayList;

import data.holder.DataHolder;
import data.model.Project;
import main.MenuPanel;

public class ProjectManage {
	
	
	private ArrayList<Project> projects = DataHolder.getProject();
	
	public void addProject(Project project, String userType) {
		
		for(Project p : projects) {
			if(p.getProjectName().equals(project.getProjectName())) {
				System.out.println("That project is already existence");
				if (userType == "ADMIN") {
					MenuPanel.adminPanel();
				}else {
					MenuPanel.userPanel();
				}
				}			
		}
		projects.add(project);
		
		
	}
	
	public void deleteProject(String projectNema, String userType) {
		
		
	}

}
