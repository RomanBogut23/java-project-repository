package ca.comit.classExamples.java2;

public class TestPerson {

	public static void main(String[] args) {

		Person person1 = new Person();
		
		person1.setName("John");
		
		System.out.println("Name is " + person1.getName());
		
		Person person2 = new Person("AnotherPerson", "Female", "333 Brodway", "Winnipeg", "MB", "R3X3L7");
		
		System.out.println("Name is " + person2.getName());
		
		

	}

}
