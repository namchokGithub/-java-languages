package DriverLicense;


/**
 * Class Card
 * File name: Card.java
 * Author: yourself
 * Create date: 2019-08-23
 * Update date: 2019-08-23
 */
public class Card {
    
    protected String name;

    public Card(){
        this.name = "unknown";
    }
    
    public Card(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Name : " + this.name;
    }
}