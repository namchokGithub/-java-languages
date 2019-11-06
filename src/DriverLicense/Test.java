package DriverLicense;

import java.util.Scanner;
import DriverLicense.DriverLicense;;
/**
 * Class Test
 * File name: Test.java
 * Author: yourself
 * Create date: 2019-08-23
 * Update date: 2019-08-23
 */
public class Test {

    public static void main(String[] args) {
        IDCard c1 = new IDCard("Jame", "1111111111111");
        DriverLicense c2 = new DriverLicense("Jame", "1111111111111", 2020);
        DriverLicense c3 = new DriverLicense("Bell", "2222222222222", 2018);

        System.out.println("***IDCard***");
        System.out.println(c1.toString());

        System.out.println("***DriverLicense***");
        System.out.println(c2.toString());

        System.out.println("***DriverLicense***");
        System.out.println(c3.toString());

        if(c2.isExpired()){
            System.out.println("DriverLicense of " + c2.getName() + " is expired!!!");
        }else{
            System.out.println("DriverLicense of " + c2.getName() + " is not expired");
        }
        if(c3.isExpired()){
            System.out.println("DriverLicense of " + c3.getName() + " is expired!!!");
        }else{
            System.out.println("DriverLicense of " + c3.getName() + " is not expired");
        }

        Scanner tk = new Scanner(System.in);

        String name;
        String IDNumber;
        int expYear;

        System.out.print("Enter name : ");
        name = tk.nextLine();
        System.out.print("Enter ID : ");
        IDNumber = tk.nextLine();
        System.out.print("Enter expiration year : ");
        expYear = tk.nextInt();

        DriverLicense c4 = new DriverLicense(name, IDNumber, expYear);

        if(c4.isExpired()){
            System.out.println("DriverLicense of " + c4.getName() + " is expired!!!");
        }else{
            System.out.println("DriverLicense of " + c4.getName() + " is not expired");
        }

        tk.close();
    }
}