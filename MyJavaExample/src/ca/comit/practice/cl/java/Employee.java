package ca.comit.practice.cl.java;

/**
 * Represents Employee class with the attributes.
 * 
 * @author bogut
 *
 */
public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String designation;

	// creating parameterized constructor
	public Employee(int employeeId, String firstName, String lastName, String designation) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
	}

	// creating method to represent the employee
	public void employeeRepresentation()

	{
		System.out.println(designation + " " + firstName + " " + lastName + " has the employeeId " + employeeId + " is working for our company.");

	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", designation=" + designation + "]";
	}
}
