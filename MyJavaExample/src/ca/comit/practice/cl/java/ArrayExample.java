package ca.comit.practice.cl.java;
/*
 * Write a java class that iterates over an int
 *  array and prints the values of the array.
 *  Try to print the array element at index 20.
 *  Name the exception that gets generated during the above processing.
 *  Update your code to handle the exception.
 */
public class ArrayExample {
	public static void main(String[] args) {
	
	int[] intArray = {8,9,10,11,13};
	
	for(int i=0; i < 5; i++) 
	{
		System.out.println("The values of array are: " + intArray[i]);
	}
	try {
		System.out.println(intArray[20]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Index is not valid");
	}

}
}
