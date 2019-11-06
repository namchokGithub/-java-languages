package Employee;

/**
 * Employee
 */
public class Employee {

    protected String name;
    protected double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public double calSalary(){
        return this.salary;
    }

    public String toString(){
        return  "My name is " + this.name + ". \n" + "I am an employee. \n" + "My salary is " + this.salary;
    }
}