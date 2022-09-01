
import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		int userInput = 0;
			
		Scanner scanner = new Scanner(System.in);
		int example = generateRandom();
		for(int i = 0; i < 5; i++) {
			
			
			userInput = Integer.parseInt(scanner.nextLine());
			
			checkMyNumber(userInput, example);
			
		}
		
		
		
		System.out.println(example);
		

		scanner.close();
		
		
	}
	
   
	private static int checkMyNumber(int input, int example) {
		
			
		if(input < 1 || input > 100) {
			System.out.println("Your Guess is not in between 0 and 100. Try again.");
			
		} else if( input < example) {
			System.out.println("Your number is: " + input + " The number you guessed is: " + example);
			System.out.println("Pick a higher number");
			return input;
		} else if (input > example) {
			System.out.println("Your number is: " + input + " he number you guessed is: " + example);
			System.out.println("Pick a lower number");
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
