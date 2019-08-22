import java.util.Scanner;
public class GamblingCraps
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				Scanner userInput = new Scanner(System.in);
				System.out.println("Let's play craps. ");
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello " + name);
				int randomNumber = (int) ( (Math.random()) * 6) + 1;
				int randomNumber2 = (int) ( (Math.random()) * 6) + 1;
				int theTotal = randomNumber + randomNumber2;
				int randomNumber3 = (int) ( (Math.random()) * 6) + 1;
				int randomNumber4 = (int) ( (Math.random()) * 6) + 1;
				int theTotal2 = randomNumber3 + randomNumber4;
				boolean flag1 = true;
				System.out.println("Roll the dice?");
				String theResponse = userInput.nextLine();
				if(theResponse.equals("No")) {
					System.out.println("Then why are you here");
				}
				else 
				{
				System.out.println("You rolled a " + randomNumber +" and a "+ randomNumber2 + " for a total of "+ theTotal + ".");	
				if(theTotal == 7 || theTotal == 11)	{
				System.out.println("Congrats, You win " + name + "!");
					
				}
				if(theTotal == 2 || theTotal == 12)	{
				System.out.println("Sorry, you lost " + name + ". :(");	
					
				}
				else{
					System.out.println("" + name + " your point is " + theTotal);
					while() {
						
						
					}
				}	
				}
			}

	}
