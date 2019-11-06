package Clock;


import java.util.Scanner;
import Clock.Clock;
/**
 * Tester
 * File name: Clock.java
 * Author: yourself
 * Create date: 2019-08-29
 * Update date: 2019-08-29
 */
public class Tester {

    public static void main(String[] args) {

        Scanner tk = new Scanner(System.in);

        int numOfWatch;
        int hour;
        int minute;
        int hourCheck = 0;
        int minuteCheck = 0;
        String type;
        int lastTime = 0;

        System.out.print("How many your watch : ");
        numOfWatch = tk.nextInt();
        tk.nextLine();
        Clock[] c = new Clock[numOfWatch];

        for (int i = 0; i < numOfWatch; i ++) {
            System.out.print("Enter [hour, minute, and AM/PM] of (" + (i+1) + ") : ");
            hour = tk.nextInt();
            minute = tk.nextInt();
            type = tk.next();
            c[i] = new Clock(hour, minute, type);
        }

        System.out.println("Convert watch(es) to 24 hr.");
        for(int i=0;i<numOfWatch;i++){
            c[i].convertTime();


            if(i!=0){
                if(c[i].getHour()>=hourCheck&&c[i].getMinute()>minuteCheck){
                    lastTime = i;
                }
            }else{
                hourCheck = c[i].getHour();
                minuteCheck = c[i].getMinute();
            }
        }
        System.out.println("After convert ===>");

        for (int i = 0; i < numOfWatch; i ++) {
            System.out.println(c[i].toString());
        }
        
        System.out.println("The last time is " + c[lastTime].toString());

        tk.close();
    }
}


// 11 11 24
// 11 11 PM
// 11 15 PM
// 23 17 24