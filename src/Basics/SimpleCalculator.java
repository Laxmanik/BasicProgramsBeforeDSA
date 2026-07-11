package Basics;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Simple calculator program");

		System.out.print("Enter number1: ");
		
		if(scanner.hasNextDouble()) {
			double num1 = scanner.nextFloat();
			
			System.out.print("Enter operator: +, -, *, / ");
			char operator = scanner.next().charAt(0);

			System.out.print("Enter number2: ");
			
			if(scanner.hasNextDouble()) {
				double num2 = scanner.nextFloat();
				
				switch(operator) {
					case '+':
						System.out.println("Result = "+(num1 + num2));
						break;
					case '-':
						System.out.println("Result = "+(num1 - num2));
						break;
					case '*':
						System.out.println("Result = "+(num1 * num2));
						break;
					case '/':
						if(num2 != 0)
							System.out.println("Result = "+(num1 / num2));
						else
							System.out.println("Cannot be divided by zero");
						break;
					default:
						System.out.println("Invalid operator.");
				}	
				
			} else {
				System.out.println("Ivalid input. Enter a valid number");
			}
		} else {
			System.out.println("Ivalid input. Enter a valid number");
		}
		
		scanner.close();
	}
}