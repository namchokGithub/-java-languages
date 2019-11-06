package employeeAndProductionWorker;

/*
 * class Employee
 * File name: Employee.java
 * Author: yourself
 * Date: 2019-08-9
 */
public class Employee {

    protected String empName;
    protected String empNumber;
    protected String hireDate;

    /*
	 * Constructor
	 * Parameter: None 
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public Employee(){
        this.empName = "None";
        this.empNumber = "XXXX-L";
        this.hireDate = "00-00-0000";
    }

    /*
	 * Constructor
	 * Parameter: empName type String, empNumber type String, hireDate type String  
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public Employee(String empName, String empNumber, String hireDate){
        this.empName = empName;
        this.empNumber = empNumber;
        this.hireDate = hireDate;
    }
    
    /*
	 * setEmpName
	 * Parameter: empName type String
     * Return: none
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public void setEmpName(String empName){
        this.empName = empName;
    }

    /*
    * setHireDate
    * Parameter: empNumber type String
    * Return: none
    * Author: yourself
    * Date: 2019-08-9
    */
    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
    }

    /*
    * setEmpNumber
    * Parameter: empNumber type String
    * Return: none
    * Author: yourself
    * Date: 2019-08-9
    */
    public void setEmpNumber(String empNumber){
        this.empNumber = empNumber;
    }

    /*
	 * getEmpName
	 * Parameter: none
     * Return: employee name
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public String getEmpName(){
        return this.empName;
    }

    /*
    * getHireDate
    * Parameter: empNumber type String
    * Return: date of hire  
    * Author: yourself
    * Date: 2019-08-9
    */
    public String getHireDate(){
        return this.hireDate;
    }

    /*
    * getEmpNumber
    * Parameter: none
    * Return: Employee number
    * Author: yourself
    * Date: 2019-08-9
    */
    public String getEmpNumber(){
        return this.empNumber;
    }

    /*
     * showInfo
     * Parameter: none
     * Author: yourself
     * Date: 2019-08-9
     */
    public void showInfo(){
        System.out.println("Name: " + this.empName);
        System.out.println("Number: " + this.empNumber);
        System.out.println("Date: " + this.hireDate);
    }
}