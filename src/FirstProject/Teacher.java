package FirstProject;

import java.util.ArrayList;

public class Teacher {
	
	private String teacherName;
	private int teacherId;
	
	ArrayList<Student> student = new ArrayList<Student>();

	Student obj3= new Student();
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	

	public ArrayList<Student> getStudent() {
		return student;
	}
	public void setStudent(ArrayList<Student> student) {
		this.student = student;
	}


}
