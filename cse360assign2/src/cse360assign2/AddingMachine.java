package cse360assign2;

public class AddingMachine {

	private int total;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {  // return total value from calculation
		return total;
	}
	
	public void add (int value) {  // Addition Method
		total += value ;
		
	}
	
	public void subtract (int value) {  // Subtraction Method
		total -= value;					
		
	}
		
	public String toString () {       // tracking the history of operator uses
		return "";
	}

	public void clear() {               // clean up and free the heap after program done.

	
	}
}
