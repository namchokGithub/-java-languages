package manageException.Bank;


import manageException.Bank.NegativeBalance;

/**
 * BankAccount
 * File name: Ex03.java
 * Author: yourself
 * Date: 2019-10-09
 */

public class BankAccount {

    double balance; 
    
    public BankAccount(double initBalance) throws NegativeBalance{ 
        if(initBalance< 0) { 
            throw new NegativeBalance(initBalance); 
        } 
        balance = initBalance; 
    }

    public String toString() { 
        return "Your balance : " + balance; 
    } 

}