import java.util.Scanner;
public class NumberGuessingGame
	{

		public static void main(String[] args)
			{
				
				boolean stillPlaying = true;
			int secretNumber = (int) (Math.random() * 10) + 1;
			Scanner userInput = new Scanner (System.in);
			System.out.println("Pick a number between 1 and 10");
			int counter = 0;
			
			while (stillPlaying) {
			 int guess = userInput.nextInt();
			
			if(guess > secretNumber)
				{
					System.out.println("Too High Try Again!");
					}
			else if (guess < secretNumber)
				
				{
					System.out.println("Too Low Try Again!");
					
					}
			else 
				{
					System.out.println("You Got It!");
					stillPlaying = false;
		
					}
		
			counter ++; 
			}
			
			if (counter == 1){
				System.out.println("It Took You" + " " + counter + " " + "Try");
			}
			
			else {
				System.out.println("It Took You" + " " + counter + " " + "Tries");
			}
			
			
		}

	}
