package SoftwareEngineering_Gradle;

import java.util.ArrayList;

public class Module {
	private String moduleName;
	private String moduleCode;
	private ArrayList<Student> students;
	private ArrayList<Course> associatedCourses = new ArrayList<>();
	
	public Module(String name, String code)
	{
		this.moduleName = name;
		this.moduleCode = code;
		//Instantiate Lists here so they're unique to each Module instance
		students = new ArrayList<Student>();
		associatedCourses = new ArrayList<Course>();
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

	@Override
	public String toString() {
		String str = "Module [moduleName=" + moduleName + ", moduleCode=" + moduleCode + ", students=" + students
				+ ", associatedCourses=" + associatedCourses + "]";
		return str;
	}
	
	
}
