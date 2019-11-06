package Zoo;

/**
 * Ray
 * File name: Ray.java
 * Author: yourself
 * Date: 2019-09-06
 */
public class Ray extends Fish{
    
    public Ray(String name){
        this.name = name;
    }
    
    public String toString(){
        return super.toString() + "I like circulate swimming. I eat plankton.";
    }

    public String move(){
        return "circulate swimming";
    }

    public String eat(){
        return "plankton";
    }
}