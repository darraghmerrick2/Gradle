package SoftwareEngineering_Gradle;
import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

class courseTest {

	//instantiate course first
	Course course;
	
	public void courseInfo()
	{
		course = new Course("Computer Science", "4BCT");
	}
	
	public void nameCheck()
	{
		assertEquals(course.getCourseName(), "Computer Science");
	}
	public void codeCheck()
	{
		assertEquals(course.getCourseCode(), "4BCT");
	}
	
	public void addStudents()
	{
		//add Students and check
		Student student1 = new Student("Darragh", "22", 12345678, DateTime.parse("28/10/1999"));
		Student student2 = new Student("Liam", "20", 6789876, DateTime.parse("10/12/2000"));
		course.addStudent(student1);
		course.addStudent(student2);
		
		course.getEnrolledStudents();
	}
	
	public void modules()
	{
		//create adn add modules then check
		Module module1 = new Module("Software Engineering", "CT417");
		Module module2 = new Module("Machine Learning", "CT4101");
		course.addModule(module1);
		course.addModule(module2);
		
		course.getModules();
	}
}
