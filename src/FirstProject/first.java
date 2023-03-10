package FirstProject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class first {

	public static void main(String[] args) throws IOException {
		ArrayList<Department> dep = new ArrayList<Department>();
		Stack<String> myStack= new Stack<>();
		Scanner sca= new Scanner(System.in);
		boolean condition =true;
		while(condition) {
			System.out.println("1- create object chaining"); //For all classes
			System.out.println("2- School"); //For school class only
			System.out.println("3- Department"); //For department class only
			System.out.println("4- Teacher"); //For teacher class only
			System.out.println("5- Student"); // For student class only
			System.out.println("6- Course"); //For course class only
			System.out.println("7- Mark");  //For mark class only
			System.out.println("8- History");
			System.out.println("9- Exit");


			int i= sca.nextInt();
			
			//For all classes
			if(i==1) {
				try {
					 BufferedWriter writer = new BufferedWriter(new FileWriter("info.txt"));
					 writer.write("This is my text file...");
				
				System.out.println("Create object chainin!");
				
				School obj= new School();
				System.out.print("Please enter school name: ");
				String sName= sca.next();
				obj.setSchoolName(sName);
				System.out.print("Please enter school location: ");
				String location= sca.next();
				obj.setLocation(location);
				myStack.push(sName);
				myStack.push(location);
			
				//options
				boolean option=true;
				boolean option1=true;
				boolean option2=true;
				boolean option3=true;
				boolean option4=true;
			
				while(option) {
					
				Department obj1= new Department();
				System.out.print("Please enter department name: ");
				String dName= sca.next();
				obj1.setDepartmentName(dName);
				option1=true;
				myStack.push(dName);
				
				dep.add(obj1);
				
				while(option1) {
				Teacher obj2= new Teacher();
				System.out.print("Please enter teacher name: ");
				String tName= sca.next();
				obj2.setTeacherName(tName);
				myStack.push(tName);
				System.out.print("Please enter teacher ID: ");
				int teacherId= sca.nextInt();
				obj2.setTeacherId(teacherId);
				String Id= Integer.toString(teacherId);
				myStack.push(Id);
				
				obj1.teach.add(obj2);
				
				option2=true;
				
				while(option2) {
					Student obj3= new Student();
					System.out.print("Please enter student name: ");
					String stusentName= sca.next();
					obj3.setStudentName(stusentName);
					myStack.push(stusentName);
					System.out.print("Please enter student ID: ");
					int studentId= sca.nextInt();
					obj3.setStudentId(studentId);
					String Id2= Integer.toString(studentId);
					myStack.push(Id2); 

					option3=true;
					
					obj2.student.add(obj3);
					
				while(option3) {
					Course obj4= new Course();
					System.out.print("Please enter course name: ");
					String courseName= sca.next();
					obj4.setCourseName(courseName);
					myStack.push(courseName);
					System.out.print("Please enter course key: ");
					String courseKey= sca.next();
					obj4.setCoursekey(courseKey);
					myStack.push(courseKey);
					option4=true;
					
					obj3.cou.add(obj4);
					
				while(option4) {
					Mark obj5= new Mark();
					System.out.print("Please enter the mark: ");
					int courseMark= sca.nextInt();
					obj5.setCourseMark(courseMark);
					String mark= Integer.toString(courseMark);
					myStack.push(mark);
					
					obj4.mar.add(obj5);
					
					System.out.println("Do you Want to add more mark? \n1-yes 2-No");
					int a= sca.nextInt();
					//obj1.obj2.obj3.obj4.mar.add(obj1.obj2.obj3.obj4.obj5);
					if(a==1) {
					option4=true;
					}
					if(a==2) {
						option4= false;
					}
					
				}
					
				System.out.println("Do you Want to add more course? \n1-yes 2-No");
				int b= sca.nextInt();
				//obj1.obj2.obj3.cou.add(obj1.obj2.obj3.obj4);
				if(b==1) {
				option3=true;
				}
				if(b==2) {
					option3= false;
				}
				
			}
				
				
					obj1.obj2.student.add(obj1.obj2.obj3);
					System.out.println("Do you Want to add more student? \n1-yes 2-No");
					int j= sca.nextInt();
					if(j==1) {
					option2=true;
					}
					if(j==2) {
						option2= false;
					}
					
				}
					
					
					System.out.println("Do you Want to add more teacher? \n1-yes 2-No");
					int jj= sca.nextInt();
					//obj1.teach.add(obj1.obj2);
					if(jj==1) {
					option1=true;
					}
					if(jj==2) {
						option1= false;
					}
					
				}
				
				System.out.println("Do you Want to add more department? \n1-yes 2-No");
				int z= sca.nextInt();
				if(z==1) {
				option=true;
				}
				if(z==2) {
					
					System.out.print("\n");
					System.out.println("School Name is "+obj.getSchoolName());
					System.out.println("Its location in: "+obj.getLocation());
					 for(Department department : dep) {
						 System.out.println("Department Name is "+department.getDepartmentName());
						 for(Teacher teacher : department.getTeach()) {
							 System.out.println("Teacher name is "+teacher.getTeacherName());
								System.out.println("His ID: "+teacher.getTeacherId());
								for(Student stu : teacher.getStudent()) {
									System.out.println("Student Name is: "+stu.getStudentName());
									System.out.println("His ID: "+stu.getStudentId());
									for(Course cour : stu.getCou()) {
									System.out.println("Course Name is: "+cour.getCourseName());
									System.out.println("Its key is: "+cour.getCoursekey());
									for(Mark mark : cour.getMar()) {
									System.out.println("Its mark is: "+mark.getCourseMark());
									System.out.println("----------------------------------");
									
									 
									
									
									
						 }
					 }
					}
				 }
				}
					 
					option= false;
				}
				}
				for (String list : myStack)
				 {
				 writer.write("\n"+list);
				 }
				 writer.close();
				 } catch (IOException e) {
				 System.out.println("Error...");
				 e.printStackTrace();
				 }	
				finally {
					System.out.println("Finally");
				}
			}	
					
				
	
			//For school class
			else if(i==2) {
			
				School obj= new School();
				System.out.print("Please enter school name: ");
				String sName= sca.next();
				obj.setSchoolName(sName);
				System.out.print("Please enter school location: ");
				String location= sca.next();
				obj.setLocation(location);
				
				System.out.println("\n ");
				System.out.println("School Name is "+obj.getSchoolName());
				System.out.println("Its location in: "+obj.getLocation());
				System.out.println("\n\n ");
			}
			
			
			
			//For department class	
			else if(i==3) {
				
				Department obj1= new Department();
				System.out.print("Please enter department name: ");
				String dName= sca.next();
				obj1.setDepartmentName(dName);
				System.out.print("Please enter number of floors: ");
				int numOfFloors= sca.nextInt();
				obj1.setNoOfFloors(numOfFloors);				

			}				
			
			//For teacher class
			else if(i==4) {
				
				Teacher obj2= new Teacher();
				System.out.print("Please enter teacher name: ");
				String tName= sca.next();
				obj2.setTeacherName(tName);
				System.out.print("Please enter teacher ID: ");
				int teacherId= sca.nextInt();
				obj2.setTeacherId(teacherId);
				
				System.out.println("\n ");
				System.out.println("Teacher name is: "+obj2.getTeacherName());
				System.out.println("His ID: "+obj2.getTeacherId());
				System.out.println("\n\n ");

			}
			
			//student class
			else if(i==5) {
				try {
				Student obj3= new Student();
				System.out.print("Please enter student name: ");
				String stusentName= sca.next();
				obj3.setStudentName(stusentName);
				System.out.print("Please enter student ID: ");
				int studentId= sca.nextInt();
				obj3.setStudentId(studentId);
				
				Mark obj5= new Mark();
				System.out.print("Please enter the mark: ");
				int courseMark= sca.nextInt();
				obj5.setCourseMark(courseMark);
				
				System.out.println("\n ");
				System.out.println("Student Name is: "+obj3.getStudentName());
				System.out.println("His ID: "+obj3.getStudentId());
				System.out.println("Its mark is: "+obj5.getCourseMark());
				
				if(courseMark>=60) {
					throw new ArithmeticException();
				}
				
				
					else if(courseMark<60) {
						throw new Exception();
										}
				
			} catch (ArithmeticException e) {
						System.out.println("\n ");
						System.out.println("PASS");
						System.out.println("\n ");
						System.out.println("[| o o |]");
				        System.out.println(" |  v | ");
						System.out.println("\n\n ");
					}
				 catch (Exception e) {
					 System.out.println("\n ");
						System.out.println("FALL");
						System.out.println("\n ");
						System.out.println("[| o o |]");
				        System.out.println(" |  ^  | ");
						System.out.println("\n\n ");	
					}
			}
			//course class
			else if(i==6) {
				
				Course obj4= new Course();
				System.out.print("Please enter course name: ");
				String coueseName= sca.next();
				obj4.setCourseName(coueseName);
				System.out.print("Please enter course key: ");
				String courseKey= sca.next();
				obj4.setCoursekey(courseKey);
			
				System.out.println("\n ");
				System.out.println("Course Name is: "+obj4.getCourseName());
				System.out.println("Its key is: "+obj4.getCoursekey());
				System.out.println("\n\n ");

			}
			
			//Mark class
			else if(i==7) {
				
				Mark obj5= new Mark();
				System.out.print("Please enter the mark: ");
				int courseMark= sca.nextInt();
				obj5.setCourseMark(courseMark);
				
				System.out.println("\n ");
				System.out.println("Its mark is: "+obj5.getCourseMark());
				
				if(courseMark>=60) {
					System.out.println("\n ");
					System.out.println("PASS");
					System.out.println("\n ");
					System.out.println("[| o o |]");
			        System.out.println(" |  v | ");
					System.out.println("\n\n ");
				}
				
					else if(courseMark<60) {
						System.out.println("\n ");
						System.out.println("FALL");
						System.out.println("\n ");
						System.out.println("[| o o |]");
				        System.out.println(" |  ^  | ");
						System.out.println("\n\n ");
					}
			}
		
			else if (i==8) {
				System.out.print("\n");
				System.out.println("History");
				for(String stack : myStack) {
				System.out.println(stack);
			}
				System.out.print("\n");
			}
			
			else if(i==9) {
				
				condition= false;
				System.out.print("The end");
			}
			
					}
	}

}


