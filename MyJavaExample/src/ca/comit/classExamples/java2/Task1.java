package ca.comit.classExamples.java2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string:");
		String input = scanner.next();

		for (int i = input.length()-1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}

	}

}
