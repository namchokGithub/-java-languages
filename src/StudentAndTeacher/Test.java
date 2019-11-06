package StudentAndTeacher;

import java.util.Scanner;
import StudentAndTeacher.Student;
import StudentAndTeacher.Teacher;
/*
 * Class Test
 * File name: Test.java
 * Author: yourself
 * Create date: 2019-08-18
 * Update date: 2019-08-18
 */
public class Test {

    public static void main(String[] args) {
        String name;
        int age;
        char type;                                          // Person
        String Id;
        double gpa;                                         //  Student
        int salary;
        String academic_position;                           // Teacher
        String input;                                       // ตัวแปรที่จะรับค่ามาทีเดียว 5 ตัวแปร
        String[] input2 = new String[5];                    // ตัวแปรที่จะมาแบ่งเป็นตัวแปรอื่น ๆ

        Scanner tk = new Scanner(System.in);
        
        System.out.print("Enter number of person :");
        int numberOfPeople = tk.nextInt();                  // รับจำนวนคนจากแป้นพิมพ์

        Student[] student = new Student[numberOfPeople];    // สร้าง Object ของนักเรียนตามจำนวนที่รับมา
        int numOfStudent = 0;                               // เช็คจำนวนนักเรียน
        Teacher[] teacher = new Teacher[numberOfPeople];    // สร้าง Object ของอาจารย์ตามจำนวนที่รับมา
        int numOfTeacher = 0;                               // เช็คจำนวนอาจารย์
        int checkMoney = 0;                                 // เช็คว่า Teacher คนใดเงินเดือน 30000 ขึ้นไป
        
        for(int i=0; i<numberOfPeople; i++){
            System.out.print("Enter information of person("+ (i+1) + ") : ");
            tk.next();
            input = tk.nextLine();                          // รับค่าข้อมูล

            input2 = input.split(" ", 8);                   // แบ่งตัวแปรโดยใช้ " " (ช่องว่าง)

            name = input2[0];                               // เก็บชื่อ
            age = Integer.parseInt(input2[1]);              // เก็บอายุ
            type = input2[2].charAt(0);                     // เก็บชนิดของ Person

            Person p = new Person(name, age, type);         // กำหนดค่าให้

            if(type=='S'){                                  // เช็คชนิดของ Person S = Student, T = Teacher
                Id = input2[3];                             // เก็บรหัสนิสิต
                gpa = Double.parseDouble(input2[4]);        // เก็บเกรด
                student[numOfStudent] = new Student(p, Id, gpa); // กำหนดข้อมูลให้ object ตามตำแหน่งของ numOfStudent
                numOfStudent += 1;                          // เช็คจำนวนนักเรียน
            }else if(type=='T'){
                salary = Integer.parseInt(input2[3]);       // เก็บเงินเดือน
                academic_position = input2[4];              // เก็บตำแหน่ง
                teacher[numOfTeacher] = new Teacher(p, salary, academic_position); // กำหนดข้อมูลให้ object ตามตำแหน่งของ numOfTeacher

                if(salary >= 30000){
                    checkMoney+=1;
                }                                           // ถ้าเงินเดือนมากกว่า 30000 บวกเพิ่ม checkMoney ไป 1

                numOfTeacher += 1;                          // เช็คจำนวนอาจารย์
            }
        } // end loop for

        System.out.println("There are " + numOfStudent + " student(s).");
        System.out.println("There are " + numOfTeacher + " teacher(s).");
        System.out.println("There are " + checkMoney + " teacher(s) receive a salary of 30000 baths or more.");


        tk.close();
    }

}
// Jame 18 S 62164578 2.11
// Aom 25 T 31000 Teacher
// Bell 45 T 40000 Prof