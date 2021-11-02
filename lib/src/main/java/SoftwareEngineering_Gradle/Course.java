package SoftwareEngineering_Gradle;
package SoftwareEngineering;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class Course {

	private String courseName;
	private String courseCode;
	private ArrayList<Student> enrolledStudents = new ArrayList<>();
	private ArrayList<Module> modules = new ArrayList<>();
	
	
	public Course(String name, String code)
	{
		this.courseCode = code;
		this.courseName = name;
		//DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour) 
		DateTime startDate = new DateTime(2021, 9, 1, 0, 0);
		DateTime endDate = new DateTime(2022, 5, 12, 23 ,59);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public ArrayList<Student> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
	public Student addStudent(Student student)
	{
		enrolledStudents.add(student);
		return student;
	}
	
	public void listStudents()
	{
		for(int i = 0; i<= enrolledStudents.size() ; i++)
		{
			System.out.println(enrolledStudents.get(i));
		}
	}
	public Module addModule(Module module)
	{
		modules.add(module);
		return module;
	}
	
	public void listModules() {
		for(int i = 0; i <= modules.size(); i++)
		{
			System.out.println(modules.get(i));
		}
	}
}
