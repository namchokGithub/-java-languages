package PhoneNumber;

/**
 * PhoneNumber
 * File name: PhoneNumber.java
 * Author: yourself
 * Date: 2019-09-26
 */
public class PhoneNumber {

    int number;
    String name;

    public PhoneNumber(int number, String name){
        this.name = name;
        this.number = number;
    }
    
    public String getName(){
        return this.name;
    }

    public int getNumber(){
        return this.number;
    }

    public String toString(){
        return "Name : " + this.name + " Phone : " + this.number; 
    }
}