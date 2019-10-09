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
	
	private StringBuffer history;  // additional variable
	
	public AddingMachine () {
		
		total = 0;  // not needed - included for clarity
		history = new StringBuffer("0");  // Set the initial value of the history 0.
	}
	
	public int getTotal () {  // return total value from calculation
		
		return total;
	}
	
	public void add (int value) {  // Create addition function
		
		total += value ;
		history.append(" + " + value);  // merge operator + with value
		
	}
	
	public void subtract (int value) {  // Create subtraction function
		
		total -= value;	
		history.append(" - " + value);  // merge operator - with value
		
	}
		
	public String toString () {       // A history of the transactions must be kept to be returned by the toString method.
		return history.toString();               // return history of the transactions: 0 + 4 – 2 + 5
	}

	public void clear() {               // clear total and the history string
		
		total = 0;                     // set total to zero.
		history.setLength(1);         // Set the history string back to zero for the next calculation.
		
	}
	
	public static void main(String args[]){ 
		
		AddingMachine myCalculator = new AddingMachine(); // 
		
		/**
		 *  Call add() method and/or subtract() method to add and/or subtract values.
		 */
		
		myCalculator.add(4); 	
		
		myCalculator.subtract(2);
		
		myCalculator.add(5);
				
		/**
		 * Using standard output stream for giving the output.
		 */
		System.out.println("Total: " + myCalculator.getTotal() + '\n'); // Displaying the total
		
		System.out.println("History:" + myCalculator.toString() + '\n');
		
		/**
		 * Call clear() method to clear total.
		 */
		myCalculator.clear();			// Clearing the Set using clear() method 	
		
		System.out.println("Total Deleted: " + myCalculator.getTotal() + '\n'); // Displaying the total
		
		System.out.println("History Deleted:" + myCalculator.toString() + '\n');  // Displaying the history
		
		
	}
}
