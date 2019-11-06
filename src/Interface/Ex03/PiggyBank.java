package Interface.Ex03;

/**
 * PiggyBank
 * Author: yourself
 * Date: 2019-10-20
 */
public class PiggyBank implements Measurable{
    private int one;
    private int five;
    private int ten;
    private int size;

    private boolean isFull(){
        int total = this.one + this.five + this.ten;
        
        System.out.println(this.one  + " one");
        System.out.println(this.five + " five");
        System.out.println(this.ten  + " ten");

        if(total==this.size){
            return true;
        }else{
            return false;
        }
    }

    public PiggyBank(int size){
        this.size = size;
        one = 0;
        five = 0;
        ten = 0;
    }

    public void addOne(int one){
        if(!isFull()){
            System.out.println(this.size + " size");
            this.one += one;
        }else{
            System.out.println("PiggyBank is Full!!");
        }
    }

    public void addFive(int five){
        if(!isFull()){
            this.five += five;
        }else{
            System.out.println("PiggyBank is Full!!");
        }
    }

    public void addTen(int ten){
        if(!isFull()){
            this.ten += ten;
        }else{
            System.out.println("PiggyBank is Full!!");
        }
    }

    public double getMeasure(){
        return this.one + (this.five*5) + (this.ten*10);
    }
    
}