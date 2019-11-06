package TreeType;

/**
 * Tree
 * File name Tree.java
 * Author: yourself
 * Date Create: 27-09-2019
 */
public class Tree {

    String name;
    String type;
    double price;

    public Tree(){}

    public Tree(String name, String type, double price){
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public double getPrice(){
        return this.price;
    }

    public String toString(){
        return this.name + " " + this.type + " " + this.price;
    }
}