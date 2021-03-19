package ca.comit.practice.cl.java;

/**
 * Representing the class of calculation of average of three declared numbers
 * 
 * @author bogut
 *
 */
public class AverageOfThree {

	public static void main(String[] args) {
		int[] array = { 9, 24, 13 };
		int sum = 0;
		for (int i = 1; i < array.length; i++) { // finding the sum of the array numbers
			sum = sum + array[i];
		}
		int average = sum / array.length; // calculating the average of three declared numbers

		System.out.println("The average of three numbers is " + average);

	}

}
