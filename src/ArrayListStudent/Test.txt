package ArrayListStudent;

import java.util.Scanner;
import java.util.ArrayList;;

/**
 * Test
 * File name: Test.java
 * Author: yourself
 * Date: 2019-09-26
 */
public class Test {

    public static void main(String[] args) {
        Scanner tk = new Scanner(System.in);
        
        ArrayList<Student> student = new ArrayList<Student>();
        int numOfStudent;
        int id;
        String name;
        double gpa;

        numOfStudent = tk.nextInt();

        for(int i=0;i<numOfStudent;i++){
            id = tk.nextInt();
            name = tk.next();
            gpa = tk.nextDouble();
            student.add(new Student(id, name, gpa));
        }

        for(int i=0;i<student.size();i++){
            System.out.println(student.get(i).getName() + " (" + student.get(i).getType() + ") " + student.get(i).checkStatus());
        }

        tk.close();
    }
}