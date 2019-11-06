package File;

import java.util.Scanner;
import java.io.*;

/**
 * EX03
 * File name: EX03.java
 * Author: yourself
 * Date: 2019-10-04
 */
public class EX03 {

    public static void main(String[] args) throws IOException {
        File file = new File("E:/JAVA/FILE/student2.txt");
        Scanner f = new Scanner(file);
        
        String id, fistName, lastName, gpa;

        while(f.hasNext()){
            id = f.next();
            fistName = f.next();
            lastName = f.next();
            gpa = f.next();

            if(Float.parseFloat(gpa) >= 2.0){         // Float.parseFloat(gpa)  เปลี่ยน String เป็น Float
                System.out.println(id + " " + fistName.substring(0,1).toUpperCase() + ". " + lastName + " Pass");
            }else if(Float.parseFloat(gpa) >= 1.0){
                System.out.println(id + " " + fistName.substring(0,1).toUpperCase() + ". " + lastName + " Critical");
            }else{
                System.out.println(id + " " + fistName.substring(0,1).toUpperCase() + ". " + lastName + " Retried");
            }
        }
        
        f.close();
    }
}