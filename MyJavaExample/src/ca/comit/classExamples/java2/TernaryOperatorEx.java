package ca.comit.classExamples.java2;

import java.util.Scanner;

public class TernaryOperatorEx {
	// Write a Java program to read two numbers from the console and print the
	// smallest number using ternary operator.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number1: ");
		int number1 = scanner.nextInt();
		System.out.println("Input number2: ");
		int number2 = scanner.nextInt();
		int smallestNumber = (number1 < number2) ? number1 : number2;
		System.out.println("Smallest Number " + smallestNumber);

	}

}
