package Zoo;

/**
 * Chicken
 * File name: Chicken.java
 * Author: yourself
 * Date: 2019-09-06
 */
public class Chicken extends Poultry{

    public Chicken(){}

    public Chicken(String name){
        this.name = name;
    }
    
    public String toString(){
        return super.toString() + "I like walking. I eat worm.";
    }

    public String move(){
        return "walking";
    }

    public String eat(){
        return "worm";
    }
}