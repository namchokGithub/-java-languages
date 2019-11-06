package Zoo;

/**
 * Dolphin
 * File name: Dolphin.java
 * Author: yourself
 * Date: 2019-09-06
 */
public class Dolphin extends Fish{

    public Dolphin(String name){
        this.name = name;
    }
    
    public String toString(){
        return super.toString() + "I like hover swimming. I eat seaweed";
    }

    public String move(){
        return "hover swimming";
    }

    public String eat(){
        return "seaweed";
    }
}