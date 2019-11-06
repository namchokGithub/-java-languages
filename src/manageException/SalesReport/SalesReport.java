package manageException.SalesReport;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.InputMismatchException;
/**
 * Ex01
 * // exception 
 * File name: SalesReport.java
 * Author: yourself
 * Date: 2019-10-09
 */

public class SalesReport{
    public static void main(String[] args) throws FileNotFoundException{ 
        int months= 0; 
        double oneMonth; 
        double totalSales= 0.0; 
        double averageSales; 

        // E:\JAVA\FILE\SalesData.txt   correct
        Scanner tk = new Scanner(System.in); 

        try{
            String filename = tk.nextLine();
    
            File file= new File(filename); 
            Scanner inputFile= new Scanner(file);
            
            while(inputFile.hasNext()) { 
                oneMonth= inputFile.nextDouble(); 
                totalSales+= oneMonth; months++; 
            } 
            inputFile.close();
            
            averageSales= totalSales / months; 
            System.out.println("Number of months : "+ months); 
            System.out.println("Total Sales : "+ totalSales); 
            System.out.println("Average Sales : "+ averageSales);
            
        } catch (FileNotFoundException exception) {
            System.out.println("File is not exist");
        } catch (InputMismatchException exception){
            System.out.println("Your input mismatch");
        }

        tk.close();
    } 
}