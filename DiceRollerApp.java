import java.util.Scanner;

public class DiceRollerApp {
/* Assignment 6
 * Ayumi Kojima
 * 2/11/2017
 */
	public static void main(String[] args) {
		//Create an instance of PairOfDice
		PairOfDice pod = new PairOfDice();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Dice Roller");
		System.out.println("");
		
		//Prompt user input
		String choice = "y";
		System.out.println("Roll the dice? (y/n): ");
		choice = sc.nextLine();
		
		int counter = 0;
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.println("");
			counter++;
			System.out.println("Roll " + counter + ": ");
			
			//roll the dice
			pod.roll();
			System.out.println(pod.getValue1());
			System.out.println(pod.getValue2());
			
			if(pod.getSum() == 7){
				System.out.println("Craps!");
			}else if(pod.getSum() == 12){
				System.out.println("Box cars!");
			}else if(pod.getSum() == 2){
				System.out.println("Snake eyes!");
			}//end of if statements
			
			System.out.println("Roll again? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
		}//end of while loop
		sc.close();
	}//end of main 

}//end of class
