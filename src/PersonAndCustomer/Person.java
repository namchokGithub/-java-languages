package PersonAndCustomer;

/**
 * Person
 */
public class Person {

    protected String name;
    protected String address;
    protected String telNumber;

    public Person(){
        this.address = "unknow";
        this.name = "unknow";
        this.telNumber = "unknow";
    }

    public Person(String name, String address, String telNumber){
        this.address = address;
        this.name = name;
        this.telNumber = telNumber;
    }

    public void setPerson(String name, String address, String telNumber){
        this.address = address;
        this.name = name;
        this.telNumber = telNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public String getTelNumber(){
        return this.telNumber;
    }

    public String toString(){
       return "Name = " + this.name + "\n" + "Address = " + this.address + "\n" + "Tel = " + this.telNumber + "\n";
    }
}