import java.util.Random;
import java.util.Scanner;
public class RNGDriver {

	public static void main(String[] args) 
	{
		char answer = 'Y';
		int count = 7;
		int lowGuess = 0;
		int highGuess = 100;
		int number;
		int input;
		boolean valid;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This application generates a random integer between 1 and 100\nand asks the user to guess repeatedly until they guess correctly.");
		
		while(answer == 'Y')
		{
			answer = 'Y';	
			System.out.println("\n\nEnter your first guess: ");
			number = RNG.rand();
			//System.out.println(number);
			input = keyboard.nextInt();
			valid = RNG.inputValidation(input, lowGuess, highGuess);
			while(valid == false)
			{
				input = keyboard.nextInt();
				valid = RNG.inputValidation(input, lowGuess, highGuess);
			}

			while(count > 1)
			{
			if(valid == true)
			{
				if(input == number)
				{
					System.out.println("Congratulations! The number you guessed was correct!");
					lowGuess = 0;
					highGuess = 100;
					System.out.println("Play again?");
					answer = keyboard.next().charAt(0);
					if(answer == 'Y')
					{
						count = 7;
						input = 0;
						System.out.println("Enter your first guess");
						input = keyboard.nextInt();
						number = RNG.rand();
						//System.out.println(number);
						
					}
					else
					{
						count = 0;
						number = input;
						answer = 'F';
						System.out.println("Thanks for playing...");
						System.out.println("Programmer name: Douglas Gomez");
						
					}
					
				}
				else if(input != number)
				{
					
					
					if(input < number)
					{
						lowGuess = input;
						count--;
						System.out.println("Sorry that is not the correct number. Your next guess should be between the numbers " + lowGuess + " and " + highGuess + ". You have " + ( count) + " tries left.");
						System.out.println("Enter your next guess");
						input = keyboard.nextInt();
						valid = RNG.inputValidation(input, lowGuess, highGuess);
						while(valid == false)
						{
							input = keyboard.nextInt();
							valid = RNG.inputValidation(input, lowGuess, highGuess);
						}
						
					}
					else if(input > number)
					{
						highGuess = input;
						count--;
						System.out.println("Sorry that is not the correct number. Your next guess should be between the numbers " + lowGuess + " and " + highGuess + ". You have " + ( count) + " tries left.");
						System.out.println("Enter your next guess");
						input = keyboard.nextInt();
						valid = RNG.inputValidation(input, lowGuess, highGuess);
						while(valid == false)
						{
							input = keyboard.nextInt();
							valid = RNG.inputValidation(input, lowGuess, highGuess);
						}
						
						
					}
					
				}
				}
			
				
			}
			if(count == 1)
			{
				System.out.println("Sorry, you have run out of guesses. Would you like to try again?");
				answer = keyboard.next().charAt(0);
					if(answer == 'Y')
					{
						count = 7;
						lowGuess = 0;
						highGuess = 100;
						//System.out.println(count);
					}
					else
					{
						count = 0;
						number = input;
						answer = 'F';
						System.out.println("Thanks for playing...");
						System.out.println("Programmer name: Douglas Gomez");
					}
			}
		
		
	}

	}
	}
