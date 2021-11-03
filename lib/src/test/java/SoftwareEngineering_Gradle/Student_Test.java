package SoftwareEngineering_Gradle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Student_Test {

	@Test
	void test() {
		Student student = new Student("Darragh", "22");
		
		student.getUsername();
		
	}

}
