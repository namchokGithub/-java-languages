package SheriffAndPolice;

/**
 * Sheriff
 * File name: Sheriff.java
 * Author: yourself
 * Create date: 2019-08-27
 * Update date: 2019-08-27
 */
public class Sheriff extends Person{

    public String workState;     

    /**
     * Construct
     * @param name
     * @param bornYear
     * @param workState
     * Author: yourself
     * Create date: 2019-08-27
     * Update date: 2019-08-27
     */
    public Sheriff(String name, int bornYear, String workState) {
        this.name = name;
        this.bornYear = bornYear;
        this.workState = workState;
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
        System.out.println("I'm a sheriff and work in " + this.workState);
    }

    public String getName(){
        return this.name;
    }
    
    public String getWork(){
        return this.workState;
    }
}