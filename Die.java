
public class Die {
	/* Assignment 6
	 * Ayumi Kojima
	 * 2/11/2017
	 */
	private int sides, value;	
	public Die(){
		//constructor. Create a die that has 6 sides
		sides = 6;
	}
	
	public Die(int sides){
		//constructor with parameter. Create a die that has 6 sides
		this.sides = sides;
	}
	
	public void roll(){
		//Create a random number between 1 and 6
		value = (int) (Math.random() * sides) + 1;
	}
	
	public int getValue(){
		return value;
	}
}//end of Die class
