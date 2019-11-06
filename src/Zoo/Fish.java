package Zoo;

/**
 * Fish
 * File name: Fish.java
 * Author: yourself
 * Date: 2019-09-06
 */
public class Fish extends Animal{

    String my_type = "Fish";
    public static int numOfFish=0;

    public Fish(){
        this.my_type = "Poultry";
    }

    public Fish(String my_type){
        this.my_type = my_type;
    }

    public String toString(){
        return super.toString() + " I am a Fish. I have fin. ";
    }
}