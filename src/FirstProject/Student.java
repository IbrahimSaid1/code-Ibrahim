package FirstProject;

import java.util.ArrayList;

public class Student {
	
	private String studentName;
	private int studentId;
	
	ArrayList<Course> cou = new ArrayList<Course>();

	public ArrayList<Course> getCou() {
		return cou;
	}
	public void setCou(ArrayList<Course> cou) {
		this.cou = cou;
	}
	Course obj4= new Course();

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	

}
