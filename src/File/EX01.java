package File;

import java.util.Scanner;
import java.io.*;

/**
 * EX01
 * File name: EX01.java
 * Author: yourself
 * Date: 2019-10-04
 */
public class EX01 {

    public static void main(String[] args) throws IOException {
        File file = new File("E:/JAVA/FILE/student.txt");
        Scanner f = new Scanner(file);

        int numOfIt=0, numOfCs=0;   //จำนวนนักเรียน
        String id="", major="", firstName="", lastName="";

        while(f.hasNext()){        // hasNext() เพื่อตรวจสอบว่ายังมีขอมูลในไฟล์เหลือไม่อ่านอีกหรือไม่

            id = f.next();         
            major = f.next();
            firstName = f.next();
            lastName = f.next();    // อ่านข้อมูลจากไฟล์

            if(major.equals("IT")){
                numOfIt++;
            }else if(major.equals("CS")){
                numOfCs++;
            }
        }

        System.out.println(id + major + firstName + lastName);
        System.out.println("There are "+ numOfCs +" persons in the Computer Science.");
        System.out.println("There are "+ numOfIt +" persons in the Information Technology.");

        f.close();
    }
    
}