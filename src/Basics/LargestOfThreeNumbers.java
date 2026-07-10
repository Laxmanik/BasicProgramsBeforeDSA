package Basics;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		
		if(scanner.hasNextInt()) {
			int num1 = scanner.nextInt();
			
			if(scanner.hasNextInt()) {
				int num2 = scanner.nextInt();
				
				if(scanner.hasNextInt()) {
					int num3 = scanner.nextInt();
					
					if(num1 >= num2 && num1 >= num3)
						System.out.println(num1+" is the largest number");
					else if(num2 >= num1 && num2 >= num3)
						System.out.println(num2+" is the largest number");
					else
						System.out.println(num3+" is the largest number");
				} else {
					System.out.println("Third input is not a valid integer.");	
				}
			} else {
				System.out.println("Second input is not a valid integer.");
			}
			
		} else {
			System.out.println("First input is not a valid integer.");
		}
		
		scanner.close();
	}
}