package cse360assignment02;


public class AddingMachine {
  private int total;
  private String history;
  
  /**
   * creating a method AddingMachine and setting total = 0 and history = "0"
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  
  /**
   * getTotal method returns the current total 
   * @return total
   */
  
  public int getTotal () {
    return total;
  }
  
  /**
   * add method adds two values by taking an integer as a parameter
   * update the history of operation
   */
  
  public void add (int value) {
	  total = total + value;
	  history = history + "+ " + value;
  }

  /**
   * subtract method subtracts two values by taking an integer as a parameter
   * update the history of operations
   */
  public void subtract (int value) {
	  total = total - value;
	  history = history + "- " + value;
  }

  /**
   * toString method returns the history of the operations taking place
   */
  public String toString () {
	  return history;
  }

  /**
   * clear method clears the memory 
   */
  public void clear() {
	  total = 0;
	  history = "0";
  }
}