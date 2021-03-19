package ca.comit.classExamples.java2;

import java.util.Scanner;

public class SelectionExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter integer number1: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter integer number2: ");
		int number2 = scanner.nextInt();

		if (number1 == number2)
			System.out.println("The numbers are the same.");

		else
			System.out.println("The numbers are different.");

	}

}
