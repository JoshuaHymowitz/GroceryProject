
/**
The shopping class takes input and interfaces with the Shopping Bag to run commands.
It has a general run method, and numerous helper methods to process different commands, and interact
accordingly with ShoppingBag
@author Josh Hymowitz, Max Bartlik
*/
import java.util.Scanner;
public class Shopping {
	/**
	Takes user input to run commands.
	*/
	public void run() {
		String userInput = "  ";
		while(userInput.length() > 2 || !(userInput.substring(0,2).equals("Q "))) {
			
		
			Scanner input = new Scanner(System.in);
			userInput = input.nextLine();
			System.out.println("nextline: ");
		}
		
		
		
	}
}
