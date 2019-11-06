package Zoo;

/**
 * Poultry
 * name: Poultry.java
 * Author: yourself
 * Date: 2019-09-06
 */
public class Poultry extends Animal{

    String my_type = "Poultry";
    public static int numOfPoultry=0;

    public Poultry(){
        this.my_type = "Poultry";
    }

    public Poultry(String my_type){
        this.my_type = my_type;
    }

    public String toString(){
    return super.toString() + " I am a Poultry. I have wing. ";

    }

}