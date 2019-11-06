package File;

import java.util.Scanner;
import java.io.*;

/**
 * EX02
 * File name: EX02.java
 * Author: yourself
 * Date: 2019-10-04
 */
public class EX02 {

    public static void main(String[] args) throws IOException {
        File file = new File("E:/JAVA/FILE/score.txt");
        Scanner f = new Scanner(file);

        String id, score;

        while(f.hasNext()){
            id = f.next();
            score = f.next();

            if(Integer.parseInt(score) >= 60){  //  Integer.parseInt(score) // เปลี่ยน String เป็น Int
                System.out.println("ID : " + id + " Grade : S");
            }else{
                System.out.println("ID : " + id + " Grade : U");
            }
        }

        f.close();
    }
    
}