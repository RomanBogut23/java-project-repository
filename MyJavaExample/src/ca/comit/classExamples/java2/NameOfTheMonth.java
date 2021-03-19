package ca.comit.classExamples.java2;

import java.util.Scanner;

public class NameOfTheMonth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name of the month: ");
		String nameOfTheMonth = scanner.next();

		switch (nameOfTheMonth) {
		case "January":
			System.out.println("January");
			break;
		case "Fabruary":
			System.out.println("Fabruary");
			break;
		case "March":
			System.out.println("March");
			break;
		case "April":
			System.out.println("April");
			break;
		case "May":
			System.out.println("May");
			break;
		case "June":
			System.out.println("June");
			break;
		case "July":
			System.out.println("July");
			break;
		case "August":
			System.out.println("August");
			break;
		case "September":
			System.out.println("September");
			break;
		case "October":
			System.out.println("October");
			break;
		case "November":
			System.out.println("November");
			break;
		case "December":
			System.out.println("December");
			break;
		default:

			System.out.println("Error input");

		}

	}

}
