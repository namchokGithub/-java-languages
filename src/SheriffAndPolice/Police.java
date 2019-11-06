package SheriffAndPolice;

/**
 * Police
 * File name: Police.java
 * Author: yourself
 * Create date: 2019-08-27
 * Update date: 2019-08-27
 */
public class Police extends Person{

    public String workCountry;

    /**
     * Constructor
     * @param name
     * @param workCountry
     * Author: yourself
     * Create date: 2019-08-27
     * Update date: 2019-08-27
     */
    public Police(String name, int bornYear, String workCountry){
        this.name = name;
        this.bornYear = bornYear;
        this.workCountry = workCountry; 
    }
    
    /**
     * introduce
     * Input: none
     * Output: information of Sheriff
     * Create date: 2019-08-27
     * Update date: 2019-08-27
     */
    public void introduce(){
        System.out.println("My name is " + this.name);
        System.out.println("I was born in " + this.bornYear);
        System.out.println("I'm a police and work in " + this.workCountry);
    }

    public String getName(){
        return this.name;
    }
    
    public String getWork(){
        return this.workCountry;
    }
}