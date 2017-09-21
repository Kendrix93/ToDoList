package data.model;

public class Task {
	
	private String projectName;
	private String taskName;
	private String taskDescription;
	private TaskStatus taskStatus;
	private String userLogin;
	
	
	public Task (String projectName, String taskName,
			String taskDescription, TaskStatus taskStatus, String userLogin) {
		
		this.projectName = projectName;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.taskStatus = taskStatus;
		this.userLogin = userLogin;
		
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	public String getTaskDescription() {
		return taskDescription;
	}


	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}


	public TaskStatus getTaskStatus() {
		return taskStatus;
	}


	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}


	public String getUserLogin() {
		return userLogin;
	}


	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result + ((taskDescription == null) ? 0 : taskDescription.hashCode());
		result = prime * result + ((taskName == null) ? 0 : taskName.hashCode());
		result = prime * result + ((taskStatus == null) ? 0 : taskStatus.hashCode());
		result = prime * result + ((userLogin == null) ? 0 : userLogin.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		if (taskDescription == null) {
			if (other.taskDescription != null)
				return false;
		} else if (!taskDescription.equals(other.taskDescription))
			return false;
		if (taskName == null) {
			if (other.taskName != null)
				return false;
		} else if (!taskName.equals(other.taskName))
			return false;
		if (taskStatus != other.taskStatus)
			return false;
		if (userLogin == null) {
			if (other.userLogin != null)
				return false;
		} else if (!userLogin.equals(other.userLogin))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Task [projectName=" + projectName + ", taskName=" + taskName + ", taskDescription=" + taskDescription
				+ ", taskStatus=" + taskStatus + ", userLogin=" + userLogin + "]";
	}
	
	
	
		
}
