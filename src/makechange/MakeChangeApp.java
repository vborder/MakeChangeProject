package makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
//		In the cash register we will calculate the amount of change
//		returned to a customer based on the purchase price and the 
//		amount tendered. We will also notify the attendant how many 
//		of each piece of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c,
//		.01c) is needed to make the change for the customer. Change 
//		should be provided using the largest bill and coin denominations
//		as possible. Denominations that are not used should not be displayed.

//		Hint: Mod operator

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

//		Grading
//		This is a graded project. You are expected to have your project
//		completed by the start of class on Monday morning.

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
		
		System.out.println("Welcome to the Cash Register!");
		System.out.println();
		System.out.print("What was the price of the item you purchased (in dollars and cents)? $");
		double price = kb.nextDouble();
		
		System.out.print("How much money did you pay for the item (in dollars and cents)? $");
		double tender = kb.nextDouble();
		System.out.println();
		
		if (price == tender) {
			System.out.println("You provided the exact amount of money for the price of the item."
					+ " You don't get back any change!");
		} else if (tender < price) {
			System.out.println("You didn't provide enough money to cover the price of the item."
					+ " You owe us change!");
		} else {
			double diff = tender - price;
//			System.out.println(diff + " difference");
			change(diff);
			System.out.println(change(diff));
		}
		
		System.out.println();

	} 
	
	static public double change (double diff) {
		int counter = 0;
		int counter20 = 0;
		int counter10 = 0;
		int counterT = 0;
		
		while (diff >= 20.00) {
			double change20 = diff - 20.00;
			counter++;
			counter20 = counter;
			System.out.println(counter20);
		}
//		while (diff >= 10.00) {
//			double change10 = diff - 10;
//			counter++;
//			counter10 = counter;
//		}
		
		counterT = counter20 + counter10;
		
		return counterT;
		
		
	}
	
	

}
