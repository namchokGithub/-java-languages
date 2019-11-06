package SubjectStudent;

import SubjectStudent.Subject;
/**
 * Student
 * File name: Student.java
 * Author: yourself
 * Create date: 2109-09-03
 * Update date: 2109-09-03
 */
public class Student {

    private String Id;
    private String name;
    private double grade;
    private Subject s;

    public Student(String Id, String name, double grade, Subject s){
        this.Id = Id;
        this.name = name;
        this.grade = grade;
        this.s = s;
    }

    public String getId(){
        return this.Id;
    }

    public String getName(){
        return this.name;
    }

    public Subject getSubject(){
        return this.s;
    }

    public void setId(String Id){
        this.Id = Id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSubject(Subject s){
        this.s = s;
    }

    public String toString(){
        return "รหัสนิสิต: " + this.Id + " à¸Šà¸·à¹ˆà¸­à¸§à¸´à¸Šà¸²: " + this.name + " à¹€à¸�à¸£à¸”à¹€à¸‰à¸¥à¸µà¹ˆà¸¢: " + this.grade + " " + this.s.toString();
    }
    
}