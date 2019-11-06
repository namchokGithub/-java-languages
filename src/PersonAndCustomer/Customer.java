package PersonAndCustomer;

import PersonAndCustomer.Person;

/**
 * Customer
 */
public class Customer extends Person{

    private String custNo;
    private boolean wantMailList;

    public Customer(){
        this.custNo = "unknown";
        this.wantMailList = false;
    }

    public Customer(String cusNo, boolean wantMailList){
        this.custNo = cusNo;
        this.wantMailList = wantMailList;
    }

    public void setCustomer(String cusNo, boolean wantMailList){
        this.custNo = cusNo;
        this.wantMailList = wantMailList;
    }

    public String getCustNo(){
        return this.custNo;
    }

    public boolean getWantListMail(){
        return this.wantMailList;
    }

    public String toString(){
        return "*** Customer ***\n" + "Name = " + super.name + "\n" + "Address = " + this.address + "\n" + "Tel = " + this.telNumber + "\n" + "CustNo = " + this.custNo + "\n" + "wantMailList = " + this.wantMailList + "\n" ;
    }
}