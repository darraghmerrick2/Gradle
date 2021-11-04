package SoftwareEngineering_Gradle;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {

	private String courseName;
	private String courseCode;
	private ArrayList<Student> enrolledStudents;
	private ArrayList<Module> modules;
	private DateTime startDate;
	private DateTime endDate;
	
	public Course(String name, String code)
	{
		this.courseCode = code;
		this.courseName = name;
		//2021-2022 academic year
		//In format year, month, day, hour, minute
		startDate = new DateTime(2021, 8, 1, 0, 0);
		endDate = new DateTime(2022, 6, 12, 23, 59);
		//create lists here as each course needs their own lists for students and modules
		enrolledStudents = new ArrayList<Student>();
		modules = new ArrayList<Module>();
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

	@Override
	public String toString() {
		String str =  "Course [courseName=" + courseName + ", courseCode=" + courseCode + ", enrolledStudents="
				+ enrolledStudents + ", modules=" + modules + ", startDate=" + startDate + ", endDate=" + endDate + "]";
		return str;
	}
	
}
