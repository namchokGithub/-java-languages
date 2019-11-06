package TreeType;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Tester
 * File name Tester.java
 * Author: yourself
 * Date Create: 27-09-2019
 */
public class Tester {

    public static void main(String[] args) {
        Scanner tk = new Scanner(System.in);
        
        int numOfTree = tk.nextInt();

        ArrayList<Tree> t = new ArrayList<Tree>();
        
        for(int i=0;i<numOfTree;i++){
            String name = tk.next();
            String type = tk.next();
            double price = tk.nextDouble();

            t.add(new Tree(name, type, price));
        }
        String output = tk.next();
        double total = 0.0;

        for(int i=0;i<t.size();i++){
            if(output.toLowerCase().equals(t.get(i).getType().toLowerCase())){
                System.out.println(t.get(i).toString());
                total+=t.get(i).getPrice();
            }
        }
        System.out.println("Total :" + total);

        tk.close();
        
    }
    
}