
public class PairOfDice {
	/* Assignment 6
	 * Ayumi Kojima
	 * 2/11/2017
	 */
	
	//Create 2 instances of Die class
	Die die1 = new Die();
	Die die2 = new Die();
	private int value1, value2;
	
	public PairOfDice(){
		//Constructor. Create a pair of dice with 6 sides
	}
	
	public PairOfDice(int sides){
		//Constructor that takes parameters. Create a pair of dice with 6 sides
	}
	
	public void roll(){
		//roll two dice
		die1.roll();
		die2.roll();	
	}
	
	public int getValue1(){
		//get a value of die1
		return value1 = die1.getValue();	
	}
	
	public int getValue2(){
		//get a value of die2
		return value2 = die2.getValue();
	}
	
	public int getSum(){
		//get the sum of two dice
		return value1 + value2;
	}
}//end of PairOfDice class
