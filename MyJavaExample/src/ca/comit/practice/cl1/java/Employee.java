package ca.comit.practice.cl1.java;

import java.util.Date;

public class Employee extends Person implements Profession {

	private String designation;

	public Employee() {

	}

	public Employee(String firstName, String lastName, Date birthDate, String designation) {
		super(firstName, lastName, birthDate);
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public void work() {
		System.out.println(String.format("The employee %s %s is working as %s", this.getFirstName(), this.getLastName(),
				designation));
	}

	@Override
	public String toString() {
		return "Employee [designation=" + designation + "]";
	}

}
