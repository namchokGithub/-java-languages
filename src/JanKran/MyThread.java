package JanKran;

/**
 * MyThread
 */
public class MyThread extends Thread {

    int mather;

    public MyThread(int mather){
        this.mather = mather;
    }

    public void run(){
        for(int i=1;i<=12;i++){
            System.out.println( this.mather + " * " + i + " = " + this.mather *i);
        }
    }
    
}