package StudentAndTeacher;

/*
 * class Person
 * File name: Person.java
 * Author: yourself
 * Create date: 2019-08-18
 * Update date: 2019-08-18
 */
public class Person {

    protected String name;
    protected int age;
    protected char type;

    /*
	 * Constructor
	 * Parameter: None 
	 * Author: yourself
     * Create date: 2019-08-18
     * Update date: 2019-08-18
	 */
    public Person(){
        this.age = 0;
        this.name = "unknown";
        this.type = 'u';
    }

    /*
	 * Constructor
	 * Parameter: name age and type of person 
	 * Author: yourself
     * Create date: 2019-08-18
     * Update date: 2019-08-18
	 */
    public Person(String name, int age, char type){
        this.age = age;
        this.name = name;
        this.type = type;
    }

    /*
	 * toString
	 * Parameter: none
     * Return: information of person
	 * Author: yourself
     * Create date: 2019-08-18
     * Update date: 2019-08-18
	 */
    public String toString(){
        return this.name + " " + this.age + " " + this.type + " \n";
    }
    
}