package JavaProgramms;

import java.util.Scanner;

public class Calc {
	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public static double divide(double num1, double num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {

			System.out.println("Enter the first number: ");
			double num1 = scanner.nextDouble();

			System.out.println("Enter the second number: ");
			double num2 = scanner.nextDouble();

			System.out.println(
					"Select an operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5.Exit");
			int operation = scanner.nextInt();

			double result;

			switch (operation) {
			case 1:
				result = add(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 2:
				result = subtract(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 3:
				result = multiply(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 4:
				if (num2 == 0) {
					System.out.println("Cannot divide by zero.");
				} else {
					result = divide(num1, num2);
					System.out.println("Result: " + result);
				}
				break;
			case 5:
				exit = true;
				System.out.println("Exiing Calculator");
				break;
			default:
				System.out.println("Invalid operation.");
			}
			if (!exit) {
				System.out.println("Press Enter to continue");
				scanner.nextLine(); // clear a newline character from a buffer.
				scanner.nextLine(); // wait for user input for continuing.
			}
		}
	}
}
