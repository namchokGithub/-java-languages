package manageException.Bank;

/**
 * NegativeBalance
 * // exception 
 * File name: NegativeBalance.java
 * Author: yourself
 * Date: 2019-10-09
 */
public class NegativeBalance extends Exception { 
               
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public NegativeBalance() { 
        super("Error: Negative starting balance");         
    }       
    
    public NegativeBalance(double amount) { 
        super("Error: Negative starting balance: "+ amount);        
    }
}    