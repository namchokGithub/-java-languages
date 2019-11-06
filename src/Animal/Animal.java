package Animal;

/**
 * Class Animal
 * File name: Animal.java
 * Author: yourself
 * Date: 2019-08-15
 */
public class Animal {

    protected String name;
    protected int age;

    /*
	 * Constructor
	 * Input: none
     * Output: none
	 * Author: yourself
	 * Date: 2019-08-15
	 */
    public Animal(){
        this.name = "unknown";
        this.age = 0;
    }

    /*
	 * Constructor
	 * Input: name and age of animal
     * Output: none
	 * Author: yourself
	 * Date: 2019-08-15
	 */
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    /*
	 * setInfo
	 * Input: name and age of animal
     * Output: none
	 * Author: yourself
	 * Date: 2019-08-15
	 */
    public void setInfo(String name, int age){
        this.name = name;
        this.age = age;
    }

    /*
	 * getName
	 * Input: none
     * Output: name of animal
	 * Author: yourself
	 * Date: 2019-08-15
	 */
    public String getName(){
        return this.name;
    }

    /*
	 * getAge
	 * Input: none
     * Output: age of animal
	 * Author: yourself
	 * Date: 2019-08-15
	 */
    public int getAge(){
        return this.age;
    }

    /*
	 * walk
	 * Input: none
     * Output: animal is walking
	 * Author: yourself
	 * Date: 2019-08-15
	 */
    public void walk(){
        System.out.println(this.name + " is walking...");
    }

    /*
	 * printInfo
	 * Input: information of animal
     * Output: animal is walking
	 * Author: yourself
	 * Date: 2019-08-15
	 */
    public void printInfo(){
        System.out.println("My name is " + this.name + ".");
        System.out.println("I am " + this.age + "yeas old.");
    }
}