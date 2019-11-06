package Zoo;

import Zoo.Organ;

/**
 * ZooFile 
 * name: ZooFile.java
 * Author: yourself
 * Date: 2019-09-06
 */
public class Animal {

    protected String name;
    protected Organ o;

    public Animal(){
        this.name = "unknown";
    }

    public Animal(String name, Organ o){
        this.name = "unknown";
        this.o = o;
    }

    public String toString(){
        return "Hello, my name is "+ this.name + ".";
    }
    
}