package ca.comit.classExamples.java2;

public class ArrayExample {

	public static void main(String[] args) {

		int mat[][] = new int[5][3];
		int number1 = 1;
		// assigning the value
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				mat[i][j] = number1++;

			}
		}

		// printing the value
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat[i][j] + " ");

			}
			System.out.println();
		}
	}

}
