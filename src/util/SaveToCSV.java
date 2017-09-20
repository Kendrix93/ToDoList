package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import data.holder.DataHolder;
import data.model.Project;
import data.model.Task;
import data.model.User;

public class SaveToCSV {
	
	private static ArrayList<User> user = DataHolder.getUser();
	private static ArrayList<Task> task = DataHolder.getTask();
	private static ArrayList<Project> project = DataHolder.getProject();
	
	static String filename1 = "User.csv";
	static String filename2 = "Project.csv";
	static String filename3 = "Task.csv"; 

	
	public static void saveToFileUser() {
		
		Path path = Paths.get(filename1);
		ArrayList<String> out = new ArrayList<>();
		for (User u: user) {
			out.add(u.getName() + ";" + u.getSurname() + ";" + u.getLogin() + ";" 
					+ u.getPassword() + ";" + u.getUserType());
		}try {
			Files.write(path, out);
		}catch (IOException ex) {
			System.out.println("Cant save to file user.csv");
		}
		
	}
	
	public static void saveToFileProject() {
		
		Path path = Paths.get(filename2);
		ArrayList<String> out = new ArrayList<>();
		for (Project p: project) {
			out.add(p.getProjectName() + ";" + p.getProjectDescription() + ";" + p.getUserName());
		}try {
			Files.write(path, out);
		}catch (IOException ex) {
			System.out.println("Cant save to file project.csv");
		}
		
	}
	
	public static void saveToFileTask() {
		
		Path path = Paths.get(filename3);
		ArrayList<String> out = new ArrayList<>();
		for (Task t: task) {
			out.add(t.getProjectName() + ";" + t.getTaskName() + ";" + t.getTaskDescription() + 
					";" + t.getTaskStatus() + ";" + t.getUserLogin());
		}try {
			Files.write(path, out);
		}catch (IOException ex) {
			System.out.println("Cant save to file task.csv");
		}
		
	}
	
	
	
}
