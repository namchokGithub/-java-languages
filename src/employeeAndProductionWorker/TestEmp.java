package employeeAndProductionWorker;

import java.util.Scanner;
// import employeeAndProductionWorker.Employee;

/*
 * TestEmp
 * File name: TestEmp.java
 * Author: yourself
 * Date: 2019-08-9
 */
public class TestEmp {

    public static void main(String[] args) {
        // Employee p1 = new Employee("Jame", "123-A", "1-1-2561");

        ProductionWorker pw1 = new ProductionWorker("Day", 50); // Jame
        pw1.setEmpName("Jame");
        pw1.setEmpNumber("123-A");
        pw1.setHireDate("1-1-2561");
        
        ProductionWorker pw2 = new ProductionWorker("Night", 100); // Bell
        pw2.setEmpName("Bell");
        pw2.setEmpNumber("222-A");
        pw2.setHireDate("2-2-2561");

        pw1.showInfo(); 
        pw2.showInfo();

        Scanner tk = new Scanner(System.in); 
        
        // รับค่าชม.ของเจม
        System.out.print("Enter the number of working hours for " + pw1.getEmpName() + " : ");
        double hours1 = tk.nextDouble();

        // แสดงเงินเดือนของเจม
        double salary1 = pw1.getHourlyPerRate() * hours1;
        System.out.println("Salary of " + pw1.getEmpName() + " = " + salary1);

        // รับค่าชม.ของเบล
        System.out.print("Enter the number of working hours for " + pw2.getEmpName() + " : ");
        double hours2 = tk.nextDouble();

        // แสดงเงินเดือนของเบล
        double salary2 = pw2.getHourlyPerRate() * hours2;
        System.out.println("Salary of " + pw2.getEmpName() + " = " + salary2);

        //เปรียบเทียบเงินเดือนของทั้งคู่
        if(salary1 == salary2){ //เท่ากัน
            System.out.println(pw1.getEmpName() + " and " + pw2.getEmpName() + " get the same salary");
        }else if(salary1 > salary2){ // เจมมากกว่า
            System.out.println(pw1.getEmpName() + " has more than " + pw2.getEmpName() + " = " + (salary1 - salary2));
        }else{ // เบลมากกว่า
            System.out.println(pw2.getEmpName() + " has more than " + pw1.getEmpName() + " = " + (salary2 - salary1));
        }

        tk.close();
    }
}