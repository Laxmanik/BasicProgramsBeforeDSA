package Basics;

import java.util.Scanner;

public class PositiveNegativeZeroNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		if(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			
			if(num > 0)
				System.out.println(num+" is a positive number");
			else if(num < 0)
				System.out.println(num+" is a negative number");
			else
				System.out.println(num+" is a zero");
		} else {
			System.out.println("Invalid input. Enter a valid integer.");
		}
		
		scanner.close();
	}
}