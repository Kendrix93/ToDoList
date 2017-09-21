package data.model;

public class Project {
	
	private String projectName;
	private String projectDescription;
	private String userLogin;

	
	public Project (String projectName, String projectDescription, String userName) {
		
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.userLogin = userName;
		
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getProjectDescription() {
		return projectDescription;
	}


	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}


	public String getUserName() {
		return userLogin;
	}


	public void setUserName(String userName) {
		this.userLogin = userName;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projectDescription == null) ? 0 : projectDescription.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
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
		Project other = (Project) obj;
		if (projectDescription == null) {
			if (other.projectDescription != null)
				return false;
		} else if (!projectDescription.equals(other.projectDescription))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
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
		return "Project [projectName=" + projectName + ", projectDescription=" + projectDescription + ", userName="
				+ userLogin + "]";
	}
	
	
}
