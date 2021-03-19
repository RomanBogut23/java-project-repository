package ca.comit.practice.cl.java;

/**
 * 
 * Represents the employee test class.
 * 
 * @author bogut
 *
 */
public class TestEmployee {

	public static void main(String[] args) {
// creating the object of the Employee class
		Employee comEmployee = new Employee(2, "Roman","Bogut", "Mr.");
		comEmployee.employeeRepresentation();
		System.out.println(comEmployee);

	}

}
