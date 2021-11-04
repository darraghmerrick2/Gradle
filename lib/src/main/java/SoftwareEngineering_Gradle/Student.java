package SoftwareEngineering_Gradle;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Student {
	private String name;
	private String age;
	private int id;
	private DateTime DOB;
	private String username;
	private ArrayList<Module> modules;
	private ArrayList<Course> courses;

	public Student(String name, String age, int id, DateTime DOB)
	{
		this.name = name;
		this.age = age;
		this.id = id;
		this.DOB = DOB;
		//set username each time a student is created i.e each time someone joins the college
		setUsername(name, age);
		
		//Each student needs their own list of modules and courses so declare lists here
		modules = new ArrayList<Module>();
		courses = new ArrayList<Course>();
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
	public DateTime getDOB() {
		return DOB;
	}
	public void setDOB(DateTime DOB) {
		this.DOB = DOB;
	}
	public String getUsername() {
		System.out.println(username);
		return username;
	}
	public void setUsername(String name, String age) {
		username = name.concat(age);
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
	@Override
	public String toString() {
		String str = "Student [name=" + name + ", age=" + age + ", id=" + id + ", DOB=" + DOB + ", username=" + username
				+ ", modules=" + modules + ", courses=" + courses + "]";
		return str;
	}
	
	
}
