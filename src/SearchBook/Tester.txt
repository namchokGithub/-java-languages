package SearchBook;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;;

/**
 * Tester
 * File name: Tester.java
 * Author: yourself
 * Date: 2019-10-08
 */
public class Tester {

    public static void main(String[] args) throws IOException{
        File file = new File("E:/JAVA/FILE/book.txt");
        Scanner f = new Scanner(file);
        Scanner tk = new Scanner(System.in);

        ArrayList<String> nameBook = new ArrayList<String>();
        ArrayList<String> nameAuthor = new ArrayList<String>();
        ArrayList<String> email = new ArrayList<String>();
        ArrayList<String> tel = new ArrayList<String>();
        ArrayList<String> year = new ArrayList<String>();
        ArrayList<String> price = new ArrayList<String>();

        while(f.hasNext()){
            nameBook.add(f.next());
            nameAuthor.add(f.next());
            email.add(f.next());
            tel.add(f.next());
            year.add(f.next());
            price.add(f.next());
        }

        String year_for_search = tk.next();
        int check_found = 0;

        for (int i=0;i<nameAuthor.size();i++){
            if(year_for_search.equals(year.get(i))){
                System.out.println(nameBook.get(i) + " " + nameAuthor.get(i) + " " + email.get(i) + " " + price.get(i));
            }else{
                check_found++;  // เมื่อค้นหาไม่เจอให้บวกเพิ่ม
            }
        }

        if(check_found==nameAuthor.size()){     // ถ้า check_found เท่ากับ จำนวนข้อมูลที่โหลดมาได้ทั้งหมด
            System.out.println("not found");
        } 

        f.close();
        tk.close();
    }
    
}