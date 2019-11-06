package employeeAndProductionWorker;

import employeeAndProductionWorker.Employee;

/*
 * class ProductionWorker
 * File name: ProductionWorker.java
 * Author: yourself
 * Date: 2019-08-9
 * Inherit: Employee 
 */
public class ProductionWorker extends Employee {

    private String shift; // shift = "Day", shift = "Night"
    private double hourlyPerRate; // ค่าแรงต่อชั่วโมง

    /*
	 * Constructor
	 * Parameter: None 
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public ProductionWorker(){
        this.shift = "Day";
        this.hourlyPerRate = 50;
    }

    /*
	 * Constructor
	 * Parameter: None 
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public ProductionWorker(String shift, double hourlyPerRate){
        this.shift = shift;
        this.hourlyPerRate = hourlyPerRate;
    }

    /*
	 * setShift
	 * Parameter: shift type String
     * Return: none
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public void setShift(String shift){
        this.shift = shift;
    }
    
    /*
	 * setHourlyPerRate
	 * Parameter: hourlyPerRate type double
     * Return: none
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public void setHourlyPerRate(double hourlyPerRate){
        this.hourlyPerRate = hourlyPerRate;
    }

    /*
	 * getShift
	 * Parameter: none
     * Return: shift
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public String getShift(){
        return this.shift;
    }

    /*
	 * getHourlyPerRate
	 * Parameter: none
     * Return: hourly per rate
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public double getHourlyPerRate(){
        return this.hourlyPerRate;
    }

    /*
     * showInfo
     * Parameter: none
     * Return: none
     * Author: yourself
     * Date: 2019-08-9
     */
    public void showInfo(){
        System.out.println("Name: " + this.empName);
        System.out.println("Number: " + this.empNumber);
        System.out.println("Date: " + this.hireDate);
        System.out.println("Shift = " + this.shift);
        System.out.println("Rate = " + this.hourlyPerRate + "\n");
    }

}