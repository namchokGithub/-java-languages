package SheriffAndPolice;

import java.util.Scanner;
/**
 * Test
 * File name: Test.java
 * Author: yourself
 * Create date: 2019-08-27
 * Update date: 2019-08-27
 */
public class Test {

    public static void main(String[] args) {
        
        char type;
        String name;
        int bornYear;
        String workCountry;
        String workState;
        int numberOfPerson;
        String place;
        
        Scanner tk = new Scanner(System.in);
        
        System.out.print("Enter number of person : ");
        numberOfPerson = tk.nextInt();
        
        Police[] p = new Police[numberOfPerson];
        Sheriff[] s = new Sheriff[numberOfPerson];
        
        for(int i=0;i<numberOfPerson;i++){
            // tk.next();
            System.out.print("Enter information of person ("+ (i+1) +") [type name bornYear workPlace]: ");
            type = tk.next().charAt(0);
            name = tk.next();
            bornYear = tk.nextInt();

            if(type=='s'){
                workState = tk.next();
                s[i] = new Sheriff(name, bornYear, workState);
            }else if(type=='p'){
                workCountry = tk.next();
                p[i] = new Police(name, bornYear, workCountry);
            }
            tk.nextLine();
        }

        System.out.print("Enter place: ");
        place = tk.nextLine();
        
        for(int j=0;j<3;j++){
            
            if(s[j]!=null){
                if(s[j].getWork()==place){
                    System.out.println("Name = " + s[j].name);
                }
            }else if(p[j]!=null){
                if(p[j].getWork()==place){
                    System.out.println("Name = " + p[j].name);
                }
            }else{
                System.out.println("not found!!!");
            }
        }

        tk.close();
    }
}


// s Jack 2000 Mueang
// p Bell 2000 Chonburi
// p Bank 1988 Bangkok
