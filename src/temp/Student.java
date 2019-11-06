package temp;

import java.util.Scanner;  // Import the Scanner class เพื่อการรับค่าจากคีย์บอล์ด

public class Student{
    String studentId;
    String name;
    int year;
    // ตัวแปรภายใน class Student

    public Student(){};
    
    public Student(String studentId, String name, int year){
        this.studentId=studentId;
        this.name=name;
        this.year=year;
    }// Constructor

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    } //Set Student ID

    public void setName(String name) {
        this.name = name;
    }// Set name of student

    public void setYear(int year) {
        this.year = year;
    }// Set year

    public String getStudentId() {
        return studentId;
    }// Get student ID

    public String getName() {
        return name;
    }// Get name of student

    public int getYear() {
        return year;
    }// Get year

    public void printStudent(){
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Name: " + this.name);
        System.out.println("Year: " + this.year + "\n");
    }
    
    @SuppressWarnings("resource")
	public static void main(String[] args){
        Student student1 = new Student("62064578", "Manee", 1);
        Student student2 = new Student("61061457", "Meena", 2);
        Student student3 = new Student("60065896", "Mana", 3);
        Student student4 = new Student();
        // สร้าง Object มา 3 Object โดยการกำหนดค่าผ่าน Constructor

        student1.printStudent();
        student2.printStudent();
        student3.printStudent();
        //แสดงข้อมูลผ่านฟังก์ชั่น printStudent

     //--------------------------------------- รับค่าผ่านแป้นพิมพ์ ----------------------------------------------------------//
        System.out.println("\n--------------------------------------- รับค่าผ่านแป้นพิมพ์ ----------------------------------------------------------\n");
        
        Scanner tk = new Scanner(System.in);
        
        System.out.print("Enter student ID: ");
        String studentId = tk.nextLine(); //	รับค่า Student ID
        
        System.out.print("Enter Name: ");
        String name = tk.nextLine(); // 	รับค่าชื่อ
        
        System.out.print("Enter year: ");
        int year = tk.nextInt(); // 	รับค่าปี
        
        student4.setStudentId(studentId); // กำหนดค่า student ID
        student4.setName(name); // กำหนดค่า ชื่อ
        student4.setYear(year); // กำหนดค่าปี
        
        student4.printStudent();
        
        
    }// Main of program
}