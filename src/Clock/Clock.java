package Clock;

/**
 * Clock
 * File name: Clock.java
 * Author: yourself
 * Create date: 2019-08-29
 * Update date: 2019-08-29
 */
public class Clock {

    private int hour;
    private int minute;
    private String timeSystem;

    public Clock(int hour, int minute, String type){
        this.hour = hour;
        this.minute = minute;
        this.timeSystem = type;
    }

    // private void setHour(int hour){
    //     this.hour = hour;
    // }

    // private void setMinute(int minute){
    //     this.minute = minute;
    // }

    // private void setType(String type){
    //     this.timeSystem = type;
    // }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public String getType(){
        return this.timeSystem;
    }

    public void convertTime(){
        if(this.timeSystem.equals("PM")){
            if(this.hour==11){
                this.hour = 23;
            }else if(this.hour==10){
                this.hour = 22;
            }else if(this.hour==9){
                this.hour = 21;
            }else if(this.hour==8){
                this.hour = 20;
            }else if(this.hour==7){
                this.hour = 19;
            }else if(this.hour==6){
                this.hour = 18;
            }else if(this.hour==5){
                this.hour = 17;
            }else if(this.hour==4){
                this.hour = 16;
            }else if(this.hour==3){
                this.hour = 15;
            }else if(this.hour==2){
                this.hour = 14;
            }else if(this.hour==1){
                this.hour = 13;
            }
        }
    } 


    public String toString(){
        return this.hour +  " : " + this.minute; 
    }
    
}