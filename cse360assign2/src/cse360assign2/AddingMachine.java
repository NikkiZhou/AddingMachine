package cse360assign2;

/**
 * @author Suihua Zhou Gerblick
 * @class ID 85141
 * @assignment 2
 * 
 */

public class AddingMachine {
	
/**
 * This is a program by using operator + and/or - as a calculator.
 * 
 */
	

	private int total;	
	
	
	private StringBuffer history;          // additional variable
	
	/**
	 * Use StringBuffer to satisfy no limit on the size of the String returned.
	 */
	
	
	public AddingMachine () {
		
		total = 0;                         // not needed - included for clarity
		
		history = new StringBuffer("0");   // Set the initial value of the history 0.
		
	}
	
	
	public int getTotal () {               // return total value from calculation
		
		return total;
	}
	
	
	public void add (int value) {     
		
	/**
	 * Create addition function, then merge operator + with parameter.
	 * @param value add it to the total variable.
	 * 
	 */
		
		total += value ;
		history.append(" + " + value);     
		
	}
	
	public void subtract (int value) {
		
	/**
	 * Create subtraction function, then merge operator - with parameter.
	 * @param value subtract it from the total variable.
	 * 
	 */
		
		total -= value;	
		history.append(" - " + value);   
		
	}
	
		
	public String toString () {
	
	/**
	 * A history of the transactions must be kept to be returned by the toString method.   
	 */
		return history.toString();         // return history of the transactions: 0 + 4 – 2 + 5
	}

	public void clear() {  

	/**
	 * Clear the total variable and the history string.
	 */
		total = 0;                          // set total to zero.
		
		history.delete(0,history.length()); // Set the history string to be empty.
	}
	
	
}
