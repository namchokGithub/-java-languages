package StudentAndTeacher;

/*
 * Class Teacher
 * File name: Teacher.java
 * Author: yourself
 * Create date: 2019-08-18
 * Update date: 2019-08-18
 */
public class Teacher extends Person{

    private int salary;
    private String academic_position;

    /*
	 * Constructor
	 * Parameter: none
	 * Author: yourself
     * Create date: 2019-08-18
     * Update date: 2019-08-18
	 */
    public Teacher(){
        this.salary = 0;
        this.academic_position = "unknown";
    }
    
    /*
	 * Constructor
	 * Parameter: academic position and salary of teacher
	 * Author: yourself
     * Create date: 2019-08-18
     * Update date: 2019-08-18
	 */
    public Teacher(int salary, String academic_position){
        this.salary = salary;
        this.academic_position = academic_position;
    }
    
    /*
	 * Constructor
	 * Parameter: Information of person and academic position and salary of teacher
	 * Author: yourself
     * Create date: 2019-08-18
     * Update date: 2019-08-18
	 */
    public Teacher(Person p, int salary, String academic_position){
        this.salary = salary;
        this.academic_position = academic_position;
        this.name = p.name;
        this.age = p.age;
        this.type = p.type;
    }

    /*
	 * toString
	 * Parameter: none
     * Return: information of Teacher
	 * Author: yourself
     * Create date: 2019-08-18
     * Update date: 2019-08-18
	 */
    public String toString(){
        return this.name + " " + this.age + " " + this.type + " " + this.salary + " " + this.academic_position +" \n";
    }
}