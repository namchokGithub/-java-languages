package Box;

/**
 * Class Box
 * File name: Box.java
 * Author: yourself
 * Create date: 2019-08-23
 * Update date: 2019-08-23
 */
public class Box extends Rectangle{

    private double depth;

    public Box(){
        this.depth = 0.0;
    }

    public Box(double length, double width, double depth){
        this.depth = depth;
        this.length = length;
        this.width = width;
    }

    public void setDimension(double length, double width, double depth){
        this.depth = depth;
        this.length = length;
        this.width = width;
    }

    public double getDepth(){
        return this.depth;
    }

    public double volume(){
        return this.length * this.width * this.depth;
    }

    public double surface(){
        return (2*this.width) + (2*this.length) + (2*this.depth);
    }

    public String toString(){
        return "Box: width = " + this.width + " length = " + this.length + " depth = " + this.depth;
    }
}