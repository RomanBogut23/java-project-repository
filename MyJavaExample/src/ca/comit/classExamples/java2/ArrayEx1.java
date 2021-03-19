package ca.comit.classExamples.java2;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] intArray1;
		int average=0;
		int sumOfArray=0;
		intArray1 = new int[5];
		Scanner scanner =new Scanner (System.in);
		for (int i=0; i<intArray1.length; i++)
		{
			System.out.print("Enter the number");
			intArray1[i]=scanner.nextInt();
			
		}
		// get values in the array
		for (int i=0; i<intArray1.length; i++)
		{
			System.out.println("Array value intArray1[" +i +"]" +intArray1[i]);
		}
		for (int i=0; i<intArray1.length; i++)
		{
			sumOfArray= sumOfArray+ intArray1[i];
		}
		System.out.println("The sum of array is " + sumOfArray);
		average= sumOfArray/intArray1.length;
		System.out.println("The average of array is " + average);
	}
}
