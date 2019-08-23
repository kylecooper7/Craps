import java.util.Scanner;
public class GamblingCraps
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				Scanner userInput = new Scanner(System.in);
				boolean flag2 = true;
				while(flag2) {
				System.out.println("Let's play craps. ");
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello " + name);
				int randomNumber = (int) ( (Math.random()) * 6) + 1;
				int randomNumber2 = (int) ( (Math.random()) * 6) + 1;
				int theTotal2 = 0;
				int randomNumber3 = 0;
				int randomNumber4 = 0;
				int theTotal = randomNumber + randomNumber2;
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
					System.out.println("" + name + " your point is " + theTotal + "." );
					
					
					
					while(flag1) {
						System.out.println("Roll the dice?");
						String theResponse2 = userInput.nextLine();
						if(theResponse2.contentEquals("No")) {
						System.out.println("Okay then you lose");
						flag1 = false;
						}
						else {
					randomNumber3 = (int) ( (Math.random()) * 6) + 1;
					randomNumber4 = (int) ( (Math.random()) * 6) + 1;
					theTotal2 = randomNumber3 + randomNumber4;
					System.out.println("You rolled a " + randomNumber3 +" and a "+ randomNumber4 + " for a total of "+ theTotal2 + ".");	
					if(theTotal2 == 7) {
					System.out.println("Sorry, you lost " + name + ". :(");		
					flag1=false;
					}
					if(theTotal2 == theTotal) {
					System.out.println("Congrats, You win " + name + "!");
					flag1=false;
					}
					if (flag1) {
					System.out.println("Keep on going!");
					}
						}
					}
					System.out.println("Play Again?");
					String theResponse3 = userInput.nextLine();
					if(theResponse3.equals("yes")) {
					flag2 = true;	
					}
					else {
					flag2 = false;
					System.out.println("Thanks for playing craps.");
					}
					}
				
				}	
				}
			}

	}
