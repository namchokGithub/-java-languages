package SheriffAndPolice;

/**
 * Person
 * File name: Person.java
 * Author: yourself
 * Create date: 2019-08-27
 * Update date: 2019-08-27
 */
public class Person {

    public String name;
    public int bornYear;


    public Person(){
        
    }

    /**
     * Constructor
     * @param name
     * @param bornYear
     * Author: yourself
     * Create date: 2019-08-27
     * Update date: 2019-08-27
     */
    public Person(String name, int bornYear){
        this.bornYear = bornYear;
        this.name = name;
    }

    /**
     * introduce
     * Input: none
     * Output: information of person
     * Author: yourself
     * Create date: 2019-08-27
     * Update date: 2019-08-27
     */
    public void introduce(){
        System.out.println("My name is " + this.name);
        System.out.println("I was born in " + this.bornYear);
    }
}