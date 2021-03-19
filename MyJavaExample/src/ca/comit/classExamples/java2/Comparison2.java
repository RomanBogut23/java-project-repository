package ca.comit.classExamples.java2;

import java.util.Scanner;

/**
 * 
 * Comparing the numbers, and telling what number is bigger or smaller
 * 
 * @author bogut
 *
 */
public class Comparison2 {
	// Write a program in Java that reads two numbers on the keyboard and say which
	// is the largest and which is the smallest.
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter integer number: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter other integer number: ");
		int number2 = scanner.nextInt();

		int result = number1 - number2;

		if (result == 0) {
			System.out.println("The first entered number equal to the second one.");
		} else if (result > 0) {
			System.out.println("The first entered number is the largest.");
		}

		else {
			System.out.println("The first entered number is the smallest.");
		}
		
	}

}
