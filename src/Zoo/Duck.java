package Zoo;

/**
 * Duck
 * File name: Duck.java
 * Author: yourself
 * Date: 2019-09-06
 */
public class Duck extends Poultry{

    public Duck(){}

    public Duck(String name){
        this.name = name;
    }
    
    public String toString(){
        return super.toString() + "I like swimming. I eat rice";
    }

    public String move(){
        return "swimming";
    }

    public String eat(){
        return "rice";
    }
}