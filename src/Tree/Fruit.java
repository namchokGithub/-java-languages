package Tree;
/*
 * Class Fruit
 * File name: Fruit.java
 * Author: yourself
 * Create date: 2019-08-22
 * Update date: 2019-08-22
 */
public class Fruit extends Tree{

    private double weight;
    private double price;

    public Fruit(){
        this.price = 0.0;
        this.weight = 0.0;
    }
    
    public Fruit(double weight, double price){
        this.price = price;
        this.weight = weight;
    }

    
    public Fruit(Tree t, double weight, double price){
        this.price = price;
        this.weight = weight;
        this.name = t.getName();
        this.type = t.getType();
    }

    public String toString(){
        return this.name + " Fruit " + this.weight + " " + this.price;
    }
    
    public double getWeight(){
        return this.weight;
    }

    public double getPrice(){
        return this.price;
    }
}