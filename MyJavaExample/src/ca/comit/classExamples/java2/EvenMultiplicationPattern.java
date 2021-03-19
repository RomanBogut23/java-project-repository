package ca.comit.classExamples.java2;

import java.util.Scanner;

/**
 * 
 * Represent the class which shows how inner and outer loops work
 * 
 * @author bogut
 *
 */
public class EvenMultiplicationPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integer number: ");
		int number = scanner.nextInt();
		for (int i = number + 1; i >= 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" " + j * 10);
			}
			System.out.println();
		}
System.out.println();
System.out.println();
	}

}
