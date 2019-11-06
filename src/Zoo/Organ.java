package Zoo;

/**
 * Organ
 * name: ZooFile.java
 * Author: yourself
 * Date: 2019-09-06
 */
public class Organ {

    private String type;

    public Organ(){
        this.type = "";
    }

    public Organ(String type){
        this.type = type;
    }

    /*
	 * getType
	 * Input: none
     * Output: type of Organ
	 * Author: yourself
	 * Date: 2019-09-06
	 */
    public String getType(){
        return this.type;
    }

    /*
	 * setType
	 * Input: type of Organ
     * Output: none
	 * Author: yourself
	 * Date: 2019-09-06
	 */
    public void setType(String type){
        this.type = type;
    }
}