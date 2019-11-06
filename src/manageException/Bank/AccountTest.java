package manageException.Bank;


import manageException.Bank.NegativeBalance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest{ 
    public static void main(String[] args) throws NegativeBalance{ 
        Scanner tk = new Scanner(System.in); 

        try {
            System.out.print("Enter initial balance : "); 
        
            BankAccount acc= new BankAccount(tk.nextDouble()); 
            
            System.out.println(acc); 
        } catch (NegativeBalance e) {
            System.out.println(e);
        } catch (InputMismatchException e){
            System.out.println("Your input invalid");
        }
        
        tk.close();
    } 
}