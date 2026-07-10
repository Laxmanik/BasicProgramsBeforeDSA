package Basics;

import java.util.Scanner;

public class EvenOrOddNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		if(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			if(num % 2 == 0)
				System.out.println(num+" is a even number");
			else
				System.out.println(num+" is a odd number");
		} else {
			System.out.println("Invalid input. Please enter an integer.");
		}
		
		scanner.close();
	}
}