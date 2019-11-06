package File;

// import java.lang.*;
import java.util.Scanner;
import java.io.*;

/**
 * EX04
 * File name: EX04.java
 * Author: yourself
 * Date: 2019-10-04
 */
public class EX04 {

    public static void main(String[] args) throws IOException{
        File fileRead = new File("E:/JAVA/FILE/text.txt");
        Scanner fr = new Scanner(fileRead); // read file

        File fileWrite = new File("E:/JAVA/FILE/revtext.txt");
        PrintStream fw = new PrintStream(fileWrite); // write file

        String text;

        while(fr.hasNextLine()){
            text = fr.nextLine();

            StringBuilder reverse = new StringBuilder();
            reverse.append(text);
            reverse.reverse();  // การกลับข้อความ

            fw.println(reverse);
        }

        fr.close();
        fw.close();
    }
    
}