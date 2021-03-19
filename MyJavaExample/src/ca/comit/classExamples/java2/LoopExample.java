package ca.comit.classExamples.java2;

import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter integer number: ");
		int number = scanner.nextInt();
		for (int i = number; i > 5; i = i-1) {
			  System.out.println(i);
			}

	}

}
