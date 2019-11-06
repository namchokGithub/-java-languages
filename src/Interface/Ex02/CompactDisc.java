package Interface.Ex02;

/**
 * CompactDisc
 */
public class CompactDisc implements RetailItem{

    private String title;
    private String artist;
    private double retailPrice;

    public CompactDisc(String title, String artist, double retailPrice){
        this.title = title;
        this.artist = artist;
        this.retailPrice = retailPrice;
    }

    public double getRetailPrice(){
        return this.retailPrice;
    }

    public String getTitle(){
        return this.title;
    }

    public String getArtist(){
        return this.artist;
    }

}