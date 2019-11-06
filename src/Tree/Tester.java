package Tree;

import java.util.Scanner;

/*
 * Class Tester
 * File name: Tester.java
 * Author: yourself
 * Create date: 2019-08-22
 * Update date: 2019-08-22
 */
public class Tester {

    public static void main(String[] args) {
        String name;
        char type;
        double weight;
        double price;
        String input;
        String[] info = new String[4];

        Scanner tk = new Scanner(System.in);
        System.out.print("Enter number of tree : ");
        int numOfTree = tk.nextInt();
        tk.nextLine();
        
      

        Tree t[] = new Tree[numOfTree];
        Vegetable v[] = new Vegetable[numOfTree];
        Fruit f[] = new Fruit[numOfTree];
        int countFruit = 0;
        int countVegetable = 0;
        double sumFruit = 0;
        double sumVegetable = 0;
        
        for(int i=0;i<numOfTree;i++){
            System.out.print("Enter Tree information ("+(i+1)+") : ");
            
            input = tk.nextLine();

            info = input.split(" ", 20);

            name = info[0];
            type = info[1].charAt(0);
            weight = Double.parseDouble(info[2]);
            price = Double.parseDouble(info[3]);
            
            t[i] = new Tree(name, type);

            if(type == 'V'){
                countVegetable++;
                System.out.println("***Vegetable ("+ countVegetable +")***");
                v[i] = new Vegetable(t[i], weight, price);
                System.out.println(v[i].toString() + " Total : " + (v[i].getPrice()*v[i].getWeight()));
                sumVegetable += v[i].getPrice()*v[i].getWeight();
            }else if(type == 'F'){
                countFruit++;
                System.out.println("***Fruit ("+ countFruit +")***");
                f[i] = new Fruit(t[i], weight, price);
                System.out.println(f[i].toString() + " Total : " + (f[i].getPrice()*f[i].getWeight()));
                sumFruit += f[i].getPrice()*f[i].getWeight();
            }
        }// for

        System.out.println("Sale Vegetable : " + countVegetable + " item(s). Sum Price : " + sumVegetable);
        System.out.println("Sale Fruit : " + countFruit + " item(s). Sum Price : " + sumFruit);
        System.out.println("Total Price = " + (sumFruit+sumVegetable));

        tk.close();
    }
}
// Cabbage V 0.8 10
// Tomato V 0.4 40
// Kale V 0.5 8
// Rambutan F 2 24
// Durain F 1.5 100
// Mangoteen F 5 16
// Mango F 2 28