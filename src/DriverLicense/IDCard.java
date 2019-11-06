package DriverLicense;

/**
 * Class IDCard
 * File name: IDCard.java
 * Author: yourself
 * Create date: 2019-08-23
 * Update date: 2019-08-23
 */
public class IDCard extends Card{

    protected String  idNumber;

    public IDCard(){
        this.idNumber = "unknown";
    }

    public IDCard(String name, String idNumber){
        this.idNumber = idNumber;
        this.name = name;
    }

    public void setIDNumber(String idNumber){
        this.idNumber = idNumber;
    }

    public String getIDNumber(){
        return this.idNumber;
    }

    public String toString(){
        return "Name : " + this.name + "\n IDNumber : " + this.idNumber;
    }
    
}