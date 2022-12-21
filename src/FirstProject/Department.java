package FirstProject;

import java.util.ArrayList;

public class Department {
	
	private String departmentName;
	private int noOfFloors;
	
	Teacher obj2= new Teacher();
ArrayList<Teacher> teach = new ArrayList<Teacher>();
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getNoOfFloors() {
		return noOfFloors;
	}
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	
	

	public ArrayList<Teacher> getTeach() {
		return teach;
	}
	public void setTeach(ArrayList<Teacher> teach) {
		this.teach = teach;
	}

	
}
