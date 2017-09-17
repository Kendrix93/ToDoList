package data.holder;

import java.util.ArrayList;

import data.model.Task;
import data.model.User;

public class DataHolder {
	
	private static ArrayList<User> user = new ArrayList<>();
	private static ArrayList<Task> task = new ArrayList<>();

	
	public static ArrayList<User> getUser() {
		return user;
	}
	public static void setUser(ArrayList<User> user) {
		DataHolder.user = user;
	}
	public static ArrayList<Task> getTask() {
		return task;
	}
	public static void setTask(ArrayList<Task> task) {
		DataHolder.task = task;
	}
	
	

}
