package SoftwareEngineering_Gradle;

import java.util.ArrayList;

public class Module {
	public String moduleName;
	public String moduleCode;
	public ArrayList<Student> students = new ArrayList<>();
	public ArrayList<Course> associatedCourses = new ArrayList<>();
	
	public Module(String name, String code)
	{
		this.moduleName = name;
		this.moduleCode = code;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<Course> getAssociatedCourses() {
		return associatedCourses;
	}

	public void setAssociatedCourses(ArrayList<Course> associatedCourses) {
		this.associatedCourses = associatedCourses;
	}
	
	public Course addCourse(Course course)
	{
		associatedCourses.add(course);
		return course;
	}
	
	public void listCourses()
	{
		for(int i = 0; i<= associatedCourses.size() ; i++)
		{
			System.out.println(associatedCourses.get(i));
		}
	}
	
	public Student addStudent(Student student)
	{
		students.add(student);
		return student;
	}
	
	public void listStudents()
	{
		for(int i = 0; i<= students.size() ; i++)
		{
			System.out.println(students.get(i));
		}
	}
}
