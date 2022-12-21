package FirstProject;

import java.util.ArrayList;

public class School {
	
	private String schoolName;
	private String location;
	
	Department obj1= new Department();
	ArrayList<Department> dep = new ArrayList<Department>();

	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	

	public ArrayList<Department> getDep() {
		return dep;
	}
	public void setDep(ArrayList<Department> dep) {
		this.dep = dep;
	}




}
