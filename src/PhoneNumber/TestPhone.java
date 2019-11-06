package PhoneNumber;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Test
 * File name: Test.java
 * Author: yourself
 * Date: 2019-09-26
 */
public class TestPhone {
    public static void main(String[] args) {
        Scanner tk = new Scanner(System.in);

        String name;
        int number;
        String choice=" ";
        char choiceDelete;
        ArrayList<PhoneNumber> phone = new ArrayList<PhoneNumber>();

        System.out.println("This program run util you key Q");
        while(!choice.equals("Q")){
            System.out.print("Insert what do you want: ");
            choice = tk.next();

            if(choice.equals("add")){
                name = tk.next();
                number = tk.nextInt();
                phone.add(new PhoneNumber(number, name));
                for (int i = 0; i < phone.size(); i++) {
                    System.out.println(phone.get(i));
                }
            }else if(choice.equals("search")){
                name = tk.next();
                boolean NotFound = true;
                for(int i=0;i<phone.size();i++){
                    if(name.equals(phone.get(i).getName())){
                        System.out.println(phone.get(i));
                        NotFound = false;
                        break;
                    }
                }
                if(NotFound){
                    System.out.println("Not found");
                }

            }else if(choice.equals("delete")){
                name = tk.next();
                System.out.print("Do you confirm to delete this item? (Y/N) : ");
                choiceDelete = tk.next().charAt(0);

                if(choiceDelete=='Y'){
                    for(int i=0;i<phone.size();i++){
                        if(name.equals(phone.get(i).getName())){
                            phone.remove(i);
                        }
                    }
                }
                for (int i = 0; i < phone.size(); i++) {
                    System.out.println(phone.get(i));
                }
            }else if(choice.equals("Q")){
                System.out.println("End program");
            }else{
                System.out.println("Try again!");
            }
        }

        tk.close();
    }
}