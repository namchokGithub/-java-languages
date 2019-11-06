package Tree;
/*
 * Tree
 * File name: Tree.java
 * Author: yourself
 * Create date: 2019-08-22
 * Update date: 2019-08-22
 */

public class Tree {

    protected String name;
    protected char type;

    public Tree(){
        this.name = "unknown";
        this.type = 'u';
    }

    public Tree(String name, char type){
        this.name = name;
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setType(char type){
        this.type = type;
    }

    public char getType(){
        return this.type;
    }

    public String toString(){
        if(this.type=='V'){
            return this.name + " Vegetable";
        }else if(this.type=='F'){
            return this.name + " Fruit";
        }else{
            return this.name;
        }
    }

}