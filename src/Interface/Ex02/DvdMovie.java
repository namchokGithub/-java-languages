package Interface.Ex02;

/**
 * DvdMovie
 */
public class DvdMovie implements RetailItem{

    private String title;
    private String runningTime;
    private double retailPrice;

    public DvdMovie(String title, String runningTime, double retailPrice){
        this.title = title;
        this.runningTime = runningTime;
        this.retailPrice = retailPrice;
    }

    public String getTitle(){
        return this.title;
    }

    public String runningTime(){
        return this.runningTime;
    }

    public double getRetailPrice(){
        return this.retailPrice;
    }
}