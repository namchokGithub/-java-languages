package StudentAndTeacher;

import SubjectStudent.Subject;

/*
 * Class Student
 * File name: Student.java
 * Author: yourself
 * Create date: 2019-08-18
 * Update date: 2019-08-18
 */
public class Student extends Person{

    private String Id;
    private double gpa;

    /*
	 * Constructor
	 * Parameter: None 
	 * Author: yourself
     * Create date: 2019-08-18
     * Update date: 2019-08-18
	 */
    public Student(){
        this.Id = "unknown";
        this.gpa = 0.0;
    }

    /*
	 * Constructor
	 * Parameter: Id and GPA of student 
	 * Author: yourself
     * Create date: 2019-08-18
     * Update date: 2019-08-18
	 */
    public Student(String Id, double gpa){
        this.Id = Id;
        this.gpa = gpa;
    }

    /*
	 * Constructor
	 * Parameter: Information of person and Id and GPA of student 
	 * Author: yourself
     * Create date: 2019-08-18
     * Update date: 2019-08-18
	 */
    public Student(Person p, String Id, double gpa){
        this.Id = Id;
        this.gpa = gpa;
        this.name = p.name;
        this.age = p.age;
        this.type = p.type;
    }

    public Student(String idStudent, String nameStudent, double grade, Subject sub) {
	}

	/*
	 * toString
	 * Input: none
     * Output: information of student
	 * Author: yourself
     * Create date: 2019-08-18
     * Update date: 2019-08-18
	 */
    public String toString(){
        return this.name + " " + this.age + " " + this.type + " " + this.Id + " " + this.gpa +" \n";
    }
}