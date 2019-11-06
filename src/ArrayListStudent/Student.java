package ArrayListStudent;

/**
 * Student
 * File name: Student.java
 * Author: yourself
 * Date: 2019-09-26
 */

public class Student {

    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa){
        this.gpa = gpa;
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String checkStatus(){
        if(this.gpa>=2.0){
            return "Normal";
        }else if(this.gpa>=1.75){
            return "Probation";
        }else{
            return "Retried";
        }
    }

    public String getType(){
        String checkType = Integer.toString(this.id);
        if(checkType.charAt(2) == '1'){
            return "Day";
        }else{
            return "Special";
        }
    }
}