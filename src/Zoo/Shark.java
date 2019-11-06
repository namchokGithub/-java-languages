package Zoo;

/**
 * Shark
 * File name: Shark.java
 * Author: yourself
 * Date: 2019-09-06
 */
public class Shark extends Fish{

    public Shark(String name){
        this.name = name;
    }
    
    public String toString(){
        return super.toString() + "I like straight swimming. I eat smallfish";
    }

    public String move(){
        return "straight swimming";
    }

    public String eat(){
        return "smallfish";
    }
}