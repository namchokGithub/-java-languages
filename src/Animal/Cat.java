package Animal;

import Animal.Animal;

/**
 * Cat
 * File name: Cat.java
 * Author: yourself
 * Date: 2019-08-15
 */
public class Cat extends Animal{

    protected String species;

    /*
	 * cute
	 * Input: none
     * Output: cat so cute
	 * Author: yourself
	 * Date: 2019-08-15
	 */
    public void cute(){
        System.out.println(this.name + " so cuteeee");
    }

    /*
	 * setSpecies
	 * Input: species of cat
     * Output: none
	 * Author: yourself
	 * Date: 2019-08-15
	 */
    public void setSpecies(String species){
        this.species = species;
    }

    /*
	 * getSpecies
	 * Input: none
     * Output: species of cat
	 * Author: yourself
	 * Date: 2019-08-15
	 */
    public String getSpecies(String species){
        return this.species;
    }

    /*
	 * getSpecies
	 * Input: none
     * Output: show species of cat
	 * Author: yourself
	 * Date: 2019-08-15
	 */
    public void showInfo(){
        System.out.println("I am " + this.species);
    }
    
}