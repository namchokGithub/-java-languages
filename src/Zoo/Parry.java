package Zoo;

/**
 * Parry
 * File name: Parry.java
 * Author: yourself
 * Date: 2019-09-06
 */
public class Parry extends Poultry{

    public Parry(){}

    public Parry(String name){
        this.name = name;
    }
    
    public String toString(){
        return super.toString() + "I like speaking. I eat bean";
    }

    public String move(){
        return "speaking";
    }

    public String eat(){
        return "bean";
    }
}