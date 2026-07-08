package Basics;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Program to add two numbers");
		System.out.print("Enter num1: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter num2: ");
		int num2 = scanner.nextInt();
		scanner.close();
		
		System.out.println("num1 + num2 = "+(num1+num2));
	}
}