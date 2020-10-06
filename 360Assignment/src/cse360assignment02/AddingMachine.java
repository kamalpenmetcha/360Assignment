package cse360assignment02;


public class AddingMachine {
  private int total;
  
  /**
   * creating a method AddingMachine and setting total = 0 and history = "0"
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
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
   */
  
  public void add (int value) {
  }

  /**
   * subtract method subtracts two values by taking an integer as a parameter
   */
  public void subtract (int value) {
  }

  /**
   * toString method returns the history of the actions taking place
   */
  public String toString () {
    return "";
  }

  /**
   * clear method clears the memory 
   */
  public void clear() {
  }
}