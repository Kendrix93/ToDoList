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
	
	public static ArrayList<User> toObjectUser(ArrayList<String> read){
		for (String line: read) {
			String[] l = line.split(";");
			User users = new User(l[0], l[1], l[2], l[3],l [4]);
			user.add(users);
		}
		return user;
	}

}
