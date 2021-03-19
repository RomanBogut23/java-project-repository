package ca.comit.practice.cl.java;

import java.util.Scanner;

public class AverageOfEnteredNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input total numbers you want to enter ");
		int n = scanner.nextInt();
		int arr[] = new int[n];// declaring an array of n element providing by the user;

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element #" + (i + 1) + ": ");
			arr[i] = scanner.nextInt();

		}
		scanner.close();
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double average = sum / arr.length;
		System.out.println(" The average is: " + average);

	}

}
