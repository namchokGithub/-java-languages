package DriverLicense;

import java.time.LocalDate;

/**
 * Class DriverLicense
 * File name: DriverLicense.java
 * Author: yourself
 * Create date: 2019-08-23
 * Update date: 2019-08-23
 */
public class DriverLicense extends IDCard{

    private int expYear;

    public DriverLicense(){
        this.expYear = 0;
    }

    public DriverLicense(String name, String idNumber, int expYear){
        this.expYear = expYear;
        this.name = name;
        this.idNumber = idNumber;
    }

    public boolean isExpired(){
        LocalDate date = LocalDate.now();
        String dateNow = date.toString();
        dateNow = dateNow.substring(0,4);
        
        if(Integer.parseInt(dateNow) >= this.expYear){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "Name : " + this.name + "\n IDNumber : " + this.idNumber + "\n ExpYear : " + this.expYear;
    }
}