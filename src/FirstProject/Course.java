package FirstProject;

import java.util.ArrayList;

public class Course {

	private String courseName;
	private String coursekey;
	
	ArrayList<Mark> mar = new ArrayList<Mark>();

	public ArrayList<Mark> getMar() {
		return mar;
	}
	public void setMar(ArrayList<Mark> mar) {
		this.mar = mar;
	}
	Mark obj5= new Mark();

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCoursekey() {
		return coursekey;
	}
	public void setCoursekey(String coursekey) {
		this.coursekey = coursekey;
	}
	
	
	
}
