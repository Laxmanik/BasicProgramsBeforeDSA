package Basics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a message: ");
		String message = scanner.nextLine();
		scanner.close();
		System.out.println("Message entered: "+message);
	}
}