package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import data.holder.DataHolder;
import data.model.Project;
import data.model.Task;
import data.model.TaskStatus;
import data.model.User;
import data.model.UserType;

public class OpenFromCSV {
	
	
	private static ArrayList<User> user = DataHolder.getUser();
	private static ArrayList<Task> task = DataHolder.getTask();
	private static ArrayList<Project> project = DataHolder.getProject();
	
	static String filename1 = "User.csv";
	static String filename2 = "Project.csv";
	static String filename3 = "Task.csv"; 
	
	
	public static ArrayList<User> readFromFileUser(){
		
		Path path = Paths.get(filename1);
		ArrayList<String> read = new ArrayList<String>();
		try {
			read = (ArrayList<String>) Files.readAllLines(path);
		}catch (IOException ex) {
			System.out.println("Cant read from file user.csv");
		}
		ArrayList<User> user = toObjectUser(read);
		return user;
	}
	
	private static ArrayList<User> toObjectUser(ArrayList<String> read) {
		for (String line : read) {
			String[] l = line.split(";");
			if (l[4].equals("ADMIN")) {
				User users = new User(l[0], l[1], l[2], l[3], UserType.ADMIN);
				user.add(users);
			} else if(l[4].equals("USER") ){
				User users = new User(l[0], l[1], l[2], l[3], UserType.USER);
				user.add(users);
			}
		}
		return user;
	}
	
	public static ArrayList<Project> readFromFileProject(){
		
		Path path = Paths.get(filename2);
		ArrayList<String> read = new ArrayList<String>();
		try {
			read = (ArrayList<String>) Files.readAllLines(path);
		}catch (IOException ex) {
			System.out.println("Cant read from file project.csv");
		}
		ArrayList<Project> project = toObjectProject(read);
		return project;
	}
	
	private static ArrayList<Project> toObjectProject(ArrayList<String> read){
		for (String line: read) {
			String[] l = line.split(";");
			Project projects = new Project(l[0], l[1], l[2]);
			project.add(projects);
		}
		return project;
	}
	
	
	public static ArrayList<Task> readFromFileTask(){
		
		Path path = Paths.get(filename3);
		ArrayList<String> read = new ArrayList<String>();
		try {
			read = (ArrayList<String>) Files.readAllLines(path);
		}catch (IOException ex) {
			System.out.println("Cant read from file project.csv");
		}
		ArrayList<Task> task = toObjectTask(read);
		return task;
	}
	
	private static ArrayList<Task> toObjectTask(ArrayList<String> read){
		for (String line: read) {
			String[] l = line.split(";");
			if (l[3].equals("TODO")) {
			Task tasks = new Task(l[0], l[1], l[2], TaskStatus.TODO,l[4]);
			task.add(tasks);
			}else if (l[3].equals("DOING")) {
				Task tasks = new Task(l[0], l[1], l[2], TaskStatus.DOING,l[4]);
				task.add(tasks);
			}else if (l[3].equals("DONE")) {
				Task tasks = new Task(l[0], l[1], l[2], TaskStatus.DONE,l[4]);
				task.add(tasks);
			}
		}
		return task;
	}

}
