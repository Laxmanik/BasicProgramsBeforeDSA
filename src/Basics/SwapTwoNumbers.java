package Basics;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int temp = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Program to swap two numbers");
		System.out.print("Enter num1: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter num2: ");
		int num2 = scanner.nextInt();
		scanner.close();
		
		if(num1 == num2) {
			System.out.println("Enter two different numbers");
			return;
		}
		
		System.out.println("Numbers before swap.\nnum1 = "+num1+" num2 = "+num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Numbers swapped.\nnum1 = "+num1+" num2 = "+num2);
	 }
}