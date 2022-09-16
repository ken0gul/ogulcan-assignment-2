
import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		int userInput = 0;
		int example = generateRandom();
		
		
		
		Scanner scanner = new Scanner(System.in);

		
	
		for(int i = 0; i < 5; i++) {
			
			userInput = Integer.parseInt(scanner.nextLine());
			
			checkMyNumber(userInput, example);
			if(userInput < 1 || userInput > 100) {
				i--;
			}
			
			if(i == 4 && userInput != example) {
				System.out.println("You lose! The Number to guess was " + example);
			}
			
			// Close Scanner and break the loop in case user wins
			if(userInput == example) {
				scanner.close();
				break;
			}
			
			
		}
		
		
		
		
			
			scanner.close();
		
		
		
	}
	
   
	private static int checkMyNumber(int input, int example) {
		
//			
		if(input < 1 || input > 100) {
			System.out.println("Your Guess is not in between 0 and 100. Try again.");
			return input;
		}	
//			
		else if( input < example) {
			System.out.println("Your number is: " + input + " Pick a higher number");
			return input;
		} else if (input > example) {
			System.out.println("Your number is: " + input + " Pick a lower number");
			
		return input;
		} else if(input == example) {
			System.out.println("You WIN!");
			return input;
			
			
		}
		return input;
		
		
	}
	
	private static int generateRandom() {
		Random random = new Random();
		
		int newRandom =random.nextInt(100);
		return newRandom;
	}

}
