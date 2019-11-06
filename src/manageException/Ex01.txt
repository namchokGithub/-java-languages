package manageException;

import java.util.Scanner;
/**
 * Ex01
 * // exception 
 * File name: EX01.java
 * Author: yourself
 * Date: 2019-10-09
 */
public class Ex01 {

    public static void main(String[] args) {
        int [] number = {1, 2, 3}; 
        Scanner tk = new Scanner(System.in);

        
        try{
            
            System.out.print("Enter index of array : ");
            int n = tk.nextInt();
            System.out.println(number[n]);

        } catch (ArrayIndexOutOfBoundsException exception){

            System.out.println("Array index is out of bound");

        } catch (Exception exception) {

            System.out.println("Your input mismatch");
        }
        
        tk.close();
    }
    
}