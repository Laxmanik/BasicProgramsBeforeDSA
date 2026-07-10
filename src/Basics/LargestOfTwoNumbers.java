package Basics;

import java.util.Scanner;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		
		if(scanner.hasNextInt()) {
			int num1 = scanner.nextInt();
			
			if(scanner.hasNextInt()) {
				int num2 = scanner.nextInt();
				
				if(num1 > num2)
					System.out.println(num1+" is greater than "+num2);
				else if(num2 > num1)
					System.out.println(num2+" is greater than "+num1);
				else
					System.out.println("Both the numbers are equal. "+num1+" = "+num2);
			} else {
				System.out.println("Second input is not a valid integer.");
			}
			
		} else {
			System.out.println("First input is not a valid integer.");
		}
		
		scanner.close();
	}
}