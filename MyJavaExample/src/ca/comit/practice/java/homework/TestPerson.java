package ca.comit.practice.java.homework;

import java.util.Scanner;

/*
 * Now, create an executable class that does the following: Ask by keyboard the name, age,
 * gender, weight and height. Create 3 objects of the previous class. The first
 * object will get the previous variables requested by keyboard, the second
 * object will get all the previous ones but the weight and height by default,
 * and the last one everything by default. For the latter, use setter methods to
 * give values to the attributes. For each object, you should check if you are
 * at ideal weight, overweight or below ideal weight and show a message.
 * Indicate for each object if it is of legal age. Finally, display the
 * information of each object. You can use methods in the executable class, to
 * make it easier for you.
 */
public class TestPerson {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name:");
		String name = scanner.next();

		System.out.println("Enter your age:");
		int age = scanner.nextInt();

		System.out.println("Enter your gender(M/F):");
		char gender = scanner.next().charAt(0);

		System.out.println("Enter your weight:");
		double weight = scanner.nextDouble();

		System.out.println("Enter your height:");
		double height = scanner.nextDouble();

		// creating the objects of the previous class

		Person p1 = new Person(name, age, gender, weight, height);
		Person p2 = new Person(name, age, gender);
		Person p3 = new Person();

		System.out.println("ID: " + p1.GeneratesID() + "\n");

		System.out.println(p1.toString());
		p1.calculate();
		System.out.println(p1.isOver18());

		System.out.println(p2.toString());
		p2.calculate();
		System.out.println(p2.isOver18());

		System.out.println(p3.toString());
		p3.calculate();
		System.out.println(p3.isOver18());
	}

}
