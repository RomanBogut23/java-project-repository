package ca.comit.practice.cl1.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEmployee {

	/*
	 * Create a TestEmployee class to create array of 5 Employees, use constructor
	 * or getter and setter to set the attributes. Invoke the implemented methods of
	 * the class.
	 */

	public static void main(String[] args) throws ParseException {

		Employee[] employeeList = new Employee[5];
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		employeeList[0] = new Employee("David", "Johnson", sdf.parse("27-10-1979"), "Operator");
		employeeList[1] = new Employee();
		employeeList[1].setFirstName("Roman");
		employeeList[1].setLastName("Bogut");
		employeeList[1].setBirthDate(sdf.parse("23-08-1982"));
		employeeList[1].setDesignation("Junior (Java) Software Developer");
		employeeList[2] = new Employee("John","Johnson", sdf.parse("27-10-1979"), "QA tester");
		employeeList[3] = new Employee();
		employeeList[3].setFirstName("David");
		employeeList[3].setLastName("McKaine");
		employeeList[3].setBirthDate(sdf.parse("17-08-1984"));
		employeeList[3].setDesignation("Senior (Java) Software Developer");
		employeeList[4] = new Employee("Jack","Logan", sdf.parse("13-06-1975"), "Project Manager");
		employeeList[0].work();
		employeeList[1].work();
		employeeList[2].work();
		employeeList[3].work();
		employeeList[4].work();

		
	}

}
