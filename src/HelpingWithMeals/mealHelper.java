package HelpingWithMeals;
//Matthew Lynn
//Java Prework Unit 1
import java.util.Scanner;

public class mealHelper {

	public static void main(String[] args) {
		// variables
		int eventTypeNum=0;
		String[] eventType = {"error", "casual", "semi-formal", "formal"};
		String[] mealType = {"error" , "sandwhiches" , "fried chicken" , "chicken parmesan"};
		int partySize=0;
		int preparationNum = 0;
		String participant= " participants";
		String[] preparation = {"error" , "in the microwave" , "in your kitchen" , "by a caterer"};
		
		
		String result = "You should not be seeing this, please contact tech support at (586)747-3592";
		
		System.out.println("Greetings, and welcome to Meal Helper!\n");
		System.out.println("What event type will this be?\n\n1) " + eventType[1] + "\n2) " + eventType[2] + "\n3) " + eventType[3] + "\n0) Quit Meal Helper\n\n");
		
		do {
		System.out.print("Please enter the corresponding number: ");
		Scanner userEntry = new Scanner(System.in);
		eventTypeNum=userEntry.nextInt();
		} while(eventTypeNum < 0 || eventTypeNum > 3);
		
		if(eventTypeNum == 0) {
			System.exit(0);
		}
		System.out.println("Excellent! How many people will be present for the meal?\n");
		do {
		System.out.print("Please enter a number greater than 0: ");
		Scanner userEntry = new Scanner(System.in);
		partySize = userEntry.nextInt();
		
		} while(partySize <= 0);
		
		if(partySize==1) {
			preparationNum = 1;
		}
		else if(partySize/13 == 0) {
			preparationNum = 2;
		}
		else {
			preparationNum = 3;
		}
		
		System.out.println("Thank you!\n");
		
		//result concatenation and single eater grammar check
		
		if(partySize == 1)
		{
			participant = " participant";
		}
		result = "Since you're hosting a " + eventType[eventTypeNum] + " event for " + partySize + participant + ", you should serve "
				+ mealType[eventTypeNum] + " prepared " + preparation[preparationNum] + ".";
		System.out.println(result);
		System.out.println("Enjoy your meal!");
		
	}

}