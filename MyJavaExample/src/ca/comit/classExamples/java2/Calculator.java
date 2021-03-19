package ca.comit.classExamples.java2;

public class Calculator {
	private int number1;
	private int number2;

	Calculator() {
		number1 = 15;
		number2 = 7;

	}

	Calculator(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int subNumber() {
		int result = number1 - number2;
		return result;

	}

	//public void subNumbers() {
	//	System.out.println("Subtraction of " + number1 + " and " + number2 + " = " + (number1 - number2));
	//}

}
