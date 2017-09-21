package main;

import util.OpenFromCSV;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OpenFromCSV.readFromFileUser();
		OpenFromCSV.readFromFileProject();
		OpenFromCSV.readFromFileTask();
		
		
		LoginPanel.Panel();
		
		//MenuPanel.adminPanel(userLogin);

	}

}
