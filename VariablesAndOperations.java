package week1VariablesAndOperations;

public class VariablesAndOperations {
	
	public static void main(String[] args) {
	
		//create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 120;
		int purchasedSeats = 2;
	
		//create a variable to hold the cost of groceries at checkout
		double groceryBill = 14.97;
	
		//create a variable to hold a person's middle initial
		char middleInitial = 'E';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHotOutside = true;
	
		//create a variable to hold a customer's first name
		String customerFirstName = "Walter";
	
		//create a variable to hold a street address
		String streetAddress = "1234 West North Street";
		
		//print all variables to the console
		System.out.println("Seats left on this flight: " + availablePlaneSeats);
		System.out.println("Total for groceries: " + groceryBill);
		System.out.println("Middle initial is " + middleInitial);
		System.out.println("It is hot outside today - " + isHotOutside);
		System.out.println("Customer First Name: " + customerFirstName);
		System.out.println("Address 1: " + streetAddress);
	
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats -= purchasedSeats;
		System.out.println(availablePlaneSeats + " seats left at this time");
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		//groceryBill = groceryBill + 2.15; 
		groceryBill += 2.15;
		System.out.println("Total for groceries: " + groceryBill);
	
		//birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'F';
		System.out.println("Changed middle initial to " + middleInitial);
	
		//the season has changed, update the hot outside variable to be opposite of what it was
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside + ", it is not hot outside.");
	
		//create a new variable called full name using the customer's first name, middle initial, and a last name of your choice
		String fullName = customerFirstName + " " + middleInitial + "." + " Smith";
		System.out.println(fullName);
	
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("I'd like you to meet " + fullName + ". " + "He lives at " + streetAddress + ".");
	
	}
}