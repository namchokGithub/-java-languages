package FinalExam;

import FinalExam.GradeActivity;

/**
 * class FinalExam
 * File name: FinalExam.java
 * Author: yourself
 * Date: 2019-08-9
 * Inherit: GradeActivity
 */
public class FinalExam extends GradeActivity{

    public int numQuestion; // จำนวนข้อสอบ
    public int numMissed; // จำนวนข้อผิด
    public double pointsEach; // คะแนนแต่ละข้อ
    /* 
     * คะแนนเต็ม 100 เสมอ 
     * เช่น ข้อสอบ 100 ข้อ pointsEach จะเท่ากับ 1
     * เช่น ข้อสอบ 10 ข้อ pointsEach จะเท่ากับ 10
     */

    /*
	 * Constructor
	 * Input: numQuestion type int, numMissed type int
     * Output: nonr
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public FinalExam(int numQuestion, int numMissed){
        this.numQuestion = numQuestion;
        this.numMissed = numMissed;
    }

    /*
	 * getPointsEach
	 * Input: none
     * Output: score points
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public double getPointsEach(){
        this.pointsEach =  100 / this.numQuestion;
        return this.pointsEach;
    }

    /*
	 * getNumMissed
	 * Input: none
     * Output: number of missed
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public int getNumMissed(){
        return this.numMissed;
    }
    
}