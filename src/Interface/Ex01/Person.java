package Interface.Ex01;

/**
 * Person
 * File name: Nameable.java
 * Author: yourself
 * Date: 2019-10-20
 */
public class Person implements Nameable{

    String name;
    int age;

    public Person(){}

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    
}