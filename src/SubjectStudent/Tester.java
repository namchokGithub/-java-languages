package SubjectStudent;

import java.util.Scanner;
import SubjectStudent.Student;

/**
 * Tester
 * File name: Tester.java
 * Author: yourself
 * Create date: 2109-09-03
 * Update date: 2109-09-03
 */
public class Tester {

    public static void main(String[] args) {
        int numOfStudent;
        
        String idStudent;
        String idSubject;
        String nameStudent;
        String nameSubject;
        double grade;
        String input;

        Scanner tk = new Scanner(System.in);
        
        System.out.print("Enter the number of student : "); 
        numOfStudent = tk.nextInt();
        tk.nextLine();
        
        Student[] s = new Student[numOfStudent];

        for(int i=0;i<numOfStudent;i++){
            System.out.print("Enter data : ");
            idStudent = tk.next();
            nameStudent = tk.next();
            grade = tk.nextDouble();
            idSubject = tk.next();
            nameSubject = tk.next();

            Subject sub = new Subject(idSubject, nameSubject);
            s[i] = new Student(idStudent, nameStudent, grade, sub);
            System.err.println(s[i].toString());
        }

        System.out.print("Enter subject [id/name] : ");
        input = tk.next();

        for(int i=0;i<numOfStudent;i++){
            if(input.equals(s[i].getId())||input.equals(s[i].getName())){
                System.out.println(s[i].toString());
            }
        }


        tk.close();
    }
}

// 1234 s 3.12 885100 lo
// 5678 a 5.12 885101 lq
// 1122 q 4.12 885102 ls
// 3455 r 1.12 885103 ld
// 7888 y 0.12 885104 lf
