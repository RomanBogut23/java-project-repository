package ca.comit.classExamples.java2;

//Write a java program to read a number from the Console. 
//Add 10 to that number and check if the result is greater than 100 or not.
import java.util.Scanner;

/**
 * 
 * Represent the comparison class to check if the number is grater than 100
 * 
 */

public class Comparison {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter integer number: ");
		int number = scanner.nextInt();

		int result = number + 10;

		if (result == 100) {
			System.out.println("The result is equal to 100.");
		} else if (result > 100) {
			System.out.println("The result is greater than 100.");
		}

		else {
			System.out.println("The result is less than 100.");
		}

	}

}
