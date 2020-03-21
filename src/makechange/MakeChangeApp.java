package makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {

//		Pass or fail based on whether code works given all of the following test conditions:

//		1. Amount: .67, Tendered: .50, Result: Error message
		
//		2. Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
		
//		3. Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
		
//		4. Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar 
//		bill, 1 one dollar bill, 4 pennies.
		
//		5. Amount: any amount less than 20.00, Tendered: anything greater than amount: 
//		correct denominations for correct change.
	
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
		System.out.println("Your change is: ");
		
		if (price == tender) {
			System.out.println("Error: you provided the exact amount of money for the price of the item."
					+ " You don't get back any change!");
		} else if (tender < price) {
			System.out.println("Error: You did not provide enough money to cover the price of the item."
					+ " You owe the Register change!");
		} 
		
		while (diff != 0) {
			if (diff > 2000) {
				int twenty = (int)(diff / 2000);
				diff = diff % 20.00;
				if (twenty >= 2) {
					System.out.println(twenty + " twenty dollar bills");
				} else {
					System.out.println(twenty + " twenty dollar bill");
				}
			}  
			if (diff > 1000) {
				int ten = (int)(diff / 1000);
				diff = diff % 1000;
				if (ten >= 2) {
					System.out.println(ten + " ten dollar bills");
				} else {
					System.out.println(ten + " ten dollar bill");
				}
			}  
			if (diff > 500) {
				int five = (int)(diff / 500);
				diff = diff % 500;
				if (five >= 2) {
					System.out.println(five + " five dollar bills");
				} else {
					System.out.println(five + " five dollar bill");
				}
			}  
			if (diff > 100) {
				int one = (int)(diff / 100);
				diff = diff % 100;
				if (one >= 2) {
					System.out.println(one + " one dollar bills");
				} else {
					System.out.println(one + " one dollar bill");
				}
			} 
			if (diff > 25) {
				int quarter = (int)(diff / 25);
				diff = diff % 25;
				if (quarter >= 2) {
					System.out.println(quarter + " quarters");
				} else {
					System.out.println(quarter + " quarter");
				}
			}  
			if (diff >= 10) {
				int dime = (int)(diff / 10);
				diff = diff % 10;
				if (dime >= 2) {
					System.out.println(dime + " dimes");
				} else {
					System.out.println(dime + " dime");
				}
			}  
			if (diff >= 5) {
				int nickel = (int)(diff / 5);
				diff = diff % 5;
				if (nickel >= 2) {
					System.out.println(nickel + " nickels");
				} else {
					System.out.println(nickel + " nickel");	
				}
			}  
			if (diff >= 1) {
				int penny = (int)(diff / 1 + .5);
				if (penny >= 2) {
					System.out.println(penny + " pennies");
				} else {
					System.out.println(penny + " penny");
				}
				break;
			} 
		}
		
	}
	
}
