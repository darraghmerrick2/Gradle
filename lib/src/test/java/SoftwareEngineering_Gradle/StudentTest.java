package SoftwareEngineering_Gradle;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class StudentTest {
	

	//create Student in wrapper class
	Student student;
	//Create the student with all its values before any tests
	@Before
	public void createStudent()
	{
		//DateTime.parse in format day/month/year
		student = new Student("Darragh", "22", 12345678, DateTime.parse("28/10/1999"));
	}
	
	//Test Name, age, username and 
	
	public void testName()
	{
		assertEquals("Darragh", student.getName());
	}
	
	public void testAge()
	{
		assertEquals("22", student.getAge());
	}
	
	public void testUsername()
	{
		System.out.println(student.getUsername());
		student.getUsername();
	}
	
	public void testDateTime()
	{
		assertEquals(student.getDOB(), DateTime.parse("28/10/1999"));
	}
	
	public void course() {
		//Create course and add to students list and check courses
		Course computerScience = new Course("Computer Science", "BCT");
		student.enrollInCourse(computerScience);
		student.getCourses();
	}
	
	public void modules()
	{
		//create module and add to students list then check the modules that the student is enrolled in
		Module softwareEngineering = new Module("Software Engineering", "CT417");
		student.addModule(softwareEngineering);
		student.getModules();
	}
}
