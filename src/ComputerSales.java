import java.util.Scanner;

/**
 * Create a program that asks the user to input the total number of computers
 * sold. Each computer costs $500.
 * 
 * There is a discount if the customer purchases a large quantity of computers:
 * 
 * 10-19 Computers : 15% 
 * 20-49 Computers : 20% 
 * 50-99 Computers : 25% 
 * 100 or more Computers : 30%
 * 
 * Print the total cost (with the appropriate discount applied, if any). The
 * total cost should be formatted to two decimal places and include commas.
 * 
 * @author Josh Alcoba
 */
public class ComputerSales {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the number of computers sold: ");
		final double COMPUTERCOST = 500;
		double discountLevel = 0;
		double totalCost = 0;
		int numberEntered = Integer.parseInt(keyboard.nextLine());
		
		while (numberEntered < 0) {
			System.out.println("Must be a number greater than 0.");
			System.out.print("Please enter the number of computers sold: ");
			numberEntered = Integer.parseInt(keyboard.nextLine());
		}
		
		if(numberEntered >= 100) discountLevel = 0.3;
		else if(numberEntered >= 50) discountLevel = 0.25;
		else if(numberEntered >= 20) discountLevel = 0.2;
		else if(numberEntered >= 10) discountLevel = 0.15;
		else discountLevel = 0;		
		
		totalCost = numberEntered * (COMPUTERCOST - (COMPUTERCOST*discountLevel));
		
		System.out.printf("Total cost: $%,.2f%n", totalCost);
		
		
		/***
		 * SAMPLE INPUT/OUTPUT ***
		 * 
		 * Please enter the number of computers sold: 15 
		 * Total Cost: $6,375.00
		 * 
		 */
		keyboard.close();
	}

}
