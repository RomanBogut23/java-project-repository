package ca.comit.practice.java.homework;

public class Person {
	/*
	 * Make a class called Person with the following conditions: Its attributes are:
	 * name, age, id, gender (M male, F female), weight and height. We do not want
	 * direct access to them. Think which access modifier is the most appropriate,
	 * also its type. If you want to add some extra attribute you can do it. By
	 * default, all attributes except the Id will be default values ​​according to
	 * their type (0 for numbers, empty string for String, etc.). Gender will be
	 * male by default, use a constant for it. Several constructors will be
	 * implemented: A default constructor. A constructor with the name, age and
	 * gender, the rest by default. A constructor with all the attributes as
	 * parameters. The methods that will be implemented are: Calculate (): calculate
	 * if the person is at his ideal weight (weight in kg / (height ^ 2 in meters)),
	 * return -1 if he is below his ideal weight, 0 if he’s at his ideal weight and
	 * 1 if he’s overweight. Use constants to return these values. isOver18 ():
	 * indicates if it is of legal age, it returns a Boolean. CheckGender(char gen):
	 * Check if the entered gender is correct. It will not be visible outside the
	 * class. ToString (): returns all object information. GeneratesID (): generates
	 * a random number of 8 digits. This method will be invoked when the object is
	 * built. You can split the method to make it easier for you. It will not be
	 * visible outside the class. Setter of each attribute except ID.
	 */

	private final char MALE = 'M';
	private final int BELOW = -1;
	private final int IDEAL = 0;
	private final int OVERWEIGHT = 1;

	private String name = "";
	private int age;
	private int id;
	private char gender = MALE;// (M male, F female), weight and height
	private double weight;
	private double height;

	public Person() {
		super();
	}

	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Person(String name, int age, char gender, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}

	public Person(String name, int age, int id, char gender, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}

	/**
	 * Calculate (): calculate if the person is at his ideal weight (weight in kg /
	 * (height ^ 2 in meters)), return -1 if he is below his ideal weight, 0 if he’s
	 * at his ideal weight and 1 if he’s overweight.
	 */
	public double calculate() {

		double bmi = weight / (height * height);
		if (bmi < 25) {
			System.out.println("The person has an ideal weight");
			return IDEAL;
		}
		if (bmi >= 25) {
			System.out.println("The person has overweight.");
			return OVERWEIGHT;
		}
		System.out.println("The weight of the person is below the ideal value.");
		return BELOW;
	}

	/**
	 * isOver18 (): indicates if it is of legal age, it returns a Boolean.
	 */
	public boolean isOver18() {
		if (age >= 18) {
			System.out.println("Age is legal.");
			return true;
		}
		System.out.println("Age is over 18");
		return false;

	}

	boolean CheckGender(char gen) {
		if (gen == 'M' || gen == 'F') {
			System.out.println("The entered gender value is correct");
			return true;

		}
		return false;

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + ", gender=" + gender + ", weight=" + weight
				+ ", height=" + height + "]";
	}

	/**
	 * GeneratesID (): generates a random number of 8 digits. This method will be
	 * invoked when the object is built. You can split the method to make it easier
	 * for you. It will not be visible outside the class. Setter of each attribute
	 * except ID.
	 * 
	 */
	int GeneratesID() {
		double random;

		random = Math.random() * 100000000;
		id = (int) random;
		return id;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
