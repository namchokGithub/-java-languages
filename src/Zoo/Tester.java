package Zoo;

import java.util.Scanner;
/**
 * Tester
 * File name: Tester.java
 * Author: yourself
 * Date: 2019-09-06
 */
public class Tester {

    public static void main(String[] args) {

        Scanner tk = new Scanner(System. in);

        String type = "unknown";
        String name = "unknown";

        int numOfAnimal = 0;
        numOfAnimal = tk.nextInt();
        tk.nextLine();

        Animal[] a = new Animal[numOfAnimal];
        // String[] print = new String[numOfAnimal];

        for (int i = 0; i < numOfAnimal; i ++) {
            type = tk.next();
            name = tk.next();

            if (type.equals("Parry")) {
                a[i] = new Parry(name);
                Poultry.numOfPoultry += 1;
            } else if (type.equals("Chicken")) {
                a[i] = new Chicken(name);
                Poultry.numOfPoultry += 1;
            } else if (type.equals("Duck")) {
                a[i] = new Duck(name);
                Poultry.numOfPoultry += 1;
            }else if(type.equals("Shark")){
                a[i] = new Shark(name);
                Fish.numOfFish +=1;
            }else if(type.equals("Ray")){
                a[i] = new Ray(name);
                Fish.numOfFish +=1;
            }else if(type.equals("Dolphin")){
                a[i] = new Dolphin(name);
                Fish.numOfFish +=1;
            }
        }

        for (int i = 0; i < numOfAnimal; i ++) {
            System.out.println(a[i].toString());
        }

        System.out.println("The number of Poultry = " + Poultry.numOfPoultry);
        System.out.println("The number of Fish = " + Fish.numOfFish);

        tk.close();

    }
    
}