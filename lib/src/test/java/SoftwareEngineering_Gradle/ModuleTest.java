package SoftwareEngineering_Gradle;

import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

class ModuleTest {

	//Create empty module
	Module SoftwareEngineering;
	
	public void createModule() {
		SoftwareEngineering = new Module("Software Engineering", "CT417");
	}

	public void checkName()
	{
		assertEquals(SoftwareEngineering.getModuleName(), "Software Engineering");
	}
	public void checkCode()
	{
		assertEquals(SoftwareEngineering.getModuleCode(), "CT417");
	}
	
	public void Students()
	{
		//Create Students and check list
		Student s1 = new Student("Darragh", "22", 12345678, DateTime.parse("28/10/1999"));
		SoftwareEngineering.addStudent(s1);
		SoftwareEngineering.getStudents();
	}
	
	public void courses()
	{
		//Create and add courses
		Course CSIT = new Course("CSIT", "BCT");
		SoftwareEngineering.addCourse(CSIT);
		SoftwareEngineering.getAssociatedCourses();
	}
}
