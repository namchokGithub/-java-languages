package Interface.Ex03;

/**
 * BankAccount
 * Author: yourself
 * Date: 2019-10-20
 */
public class BankAccount implements Measurable{

    private String accNo;
    private double balance;

    public BankAccount(String accNo, double balance){
        this.accNo = accNo;
        this.balance = balance;
    }

    public double getMeasure(){
        return this.balance;
    }

    public String getAccNo(){
        return this.accNo;
    }

    public void setAccNo(String accNo){
        this.accNo = accNo;
    }

}