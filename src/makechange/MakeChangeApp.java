package makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {

//		User Story #1
//		The user is prompted asking for the price of the item.

//		User Story #2
//		The user is then prompted asking how much money was tendered 
//		by the customer.

//		User Story #3
//		Display an appropriate message if the customer provided too 
//		little money or the exact amount.

//		User Story #4
//		If the amount tendered is more than the cost of the item, 
//		display the number of bills and coins that should be given to 
//		the customer.

//		You will be given either a pass or fail based on whether your 
//		code works given all of the following test conditions:

//		Amount: .67, Tendered: .50, Result: Error message
//		Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel,
//		3 pennies.
//		Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 
//		1 nickel, 1 penny.
//		Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five
//		dollar bill, 1 one dollar bill, 4 pennies.
//		Amount: any amount less than 20.00, Tendered: anything greater than 
//		amount: correct denominations for correct change.
//		If the project does work with all of the above test conditions, you will
//		be given a 1 for this week's project.

//		To turn in a project, you must push it to GitHub. You must
//		include a README.md that describes how to run your program.
		
		Scanner kb = new Scanner(System.in);
		double diff = 0;
		
		System.out.println("Welcome to the Cash Register!");
		System.out.println();
		System.out.print("What was the price of the item you purchased (in dollars and cents)? $");
		double price = kb.nextDouble();
		
		System.out.print("How much money did you pay for the item (in dollars and cents)? $");
		double tender = kb.nextDouble();
		
		kb.close();
		
		diff = tender - price;
//		System.out.println(diff);
		
		diff = diff * 100;
//		System.out.println(diff + " converted");
		System.out.println();
		
		if (price == tender) {
			System.out.println("You provided the exact amount of money for the price of the item."
					+ " You don't get back any change!");
		} else if (tender < price) {
			System.out.println("You didn't provide enough money to cover the price of the item."
					+ " You owe us change!");
		} 
		
		System.out.println("Your change is: ");
		
		while (diff != 0) {
			if (diff > 2000) {
				int twenty = (int)(diff / 2000);
				diff = diff % 20.00;
				System.out.println(twenty + " twenty dollar bills");
			}  
			if (diff > 1000) {
				int ten = (int)(diff / 1000);
				diff = diff % 1000;
				System.out.println(ten + " ten dollar bills");
			}  
			if (diff > 500) {
				int five = (int)(diff / 500);
				diff = diff % 500;
				System.out.println(five + " five dollar bills");
			}  
			if (diff > 100) {
				int one = (int)(diff / 100);
				diff = diff % 100;
				System.out.println(one + " one dollar bills");
			} 
			if (diff > 25) {
				int quarter = (int)(diff / 25);
				diff = diff % 25;
				System.out.println(quarter + " quarters");
			}  
			if (diff >= 10) {
				int dime = (int)(diff / 10);
				diff = diff % 10;
				System.out.println(dime + " dimes");
			}  
			if (diff >= 5) {
				int nickel = (int)(diff / 5);
				diff = diff % 5;
				System.out.println(nickel + " nickels");
			}  
			if (diff >= 1) {
				int penny = (int)(diff / 1 + .5);
				System.out.println(penny + " pennies");
				break;
			} 
		}
//	System.out.println(counter20 + " twenty dollar bills");
//	System.out.println(counter10 + " ten dollar bills");
//	System.out.println(counter5 + " five dollar bills");
//	System.out.println(counter1 + " one dollar bills");
//	System.out.println(counter25c + " quarters");
//	System.out.println(counter10c + " dimes");
//	System.out.println(counter5c + " nickels");
//	System.out.println(counter1c + " pennies");
		
	}
	
}
