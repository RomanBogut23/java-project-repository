package ca.comit.classExamples.java2;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		myCalc.subNumber();
		
		Calculator myCalc1 = new Calculator(46, 18);
		
		{
			System.out.println("The Substruction is: "+ myCalc1.subNumber());
		}
		
	

	}

}
