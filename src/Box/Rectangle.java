package Box;

/*
 * Class Rectangle
 * File name: Rectangle.java
 * Author: yourself
 * Create date: 2019-08-23
 * Update date: 2019-08-23
 */
 
public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void setDimension(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }
    
    public double surface(){
        return (2*this.width) + (2*this.length);
    }

    public String toString(){
        return "Rectangle: width = " + this.width + " length = " + this.length;
    }

    public double area(){
        return this.length * this.width;
    }
}