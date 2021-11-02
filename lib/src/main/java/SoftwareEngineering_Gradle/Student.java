package SoftwareEngineering_Gradle;

import java.util.ArrayList;

public class Student {
	private String name;
	private String age;
	private int id;
	private String DOB;
	private String username;
	private ArrayList<Module> modules = new ArrayList<>();
	private ArrayList<Course> courses = new ArrayList<>();

	public Student(String name, String age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getUsername(String name, int age) {
		return username;
	}
	public void setUsername(String name, String age) {
		username = name.concat(age);
		this.username = username;
	}
	public ArrayList<Module> getModules() {
		return modules;
	}
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	public Module addModule(Module module) {
		modules.add(module);
		return module;
	}
	
	public void listModules() {
		for(int i = 0; i <= modules.size(); i++)
		{
			System.out.println(modules.get(i));
		}
	}
	
	public Course enrollInCourse(Course course)
	{
		courses.add(course);
		return course;
	}
	
	public void listCourse()
	{
		for(int i = 0; i <= courses.size(); i++)
		{
			System.out.println(courses.get(i));
		}
	}
}
