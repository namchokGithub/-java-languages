package JanKran;

/*
 *
 * HelloWorldApp
 */
public class HelloWorldApp extends Thread{

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
        
        for(int i = 0 ;i < 10 ;i ++){
            System.out.println((i+1) + " Namchok Singhachai");
        }
    }
    
}