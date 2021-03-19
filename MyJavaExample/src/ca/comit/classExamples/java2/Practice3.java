package ca.comit.classExamples.java2;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * @author bogut
 *
 */
public class Practice3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integer number: ");
		int B = scanner.nextInt();
		if (B >= 0) {
			System.out.println(B + " is positive.");
		} else {
			System.out.println(B + " is negative.");
		}
	}
}
