package JanKran;

/**
 * MyThreadApp
 */
public class MyThreadApp {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread(18);
        MyThread myThread2 = new MyThread(15);
        MyThread myThread3 = new MyThread(1);
        
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}