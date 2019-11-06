package FinalExam;

/**
 * class GradeActivity
 * File name: GradeActivity.java
 * Author: yourself
 * Date: 2019-08-9
 */
public class GradeActivity {
    public double score;

    /*
	 * setScore
	 * Input: s type double
     * Output: none
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public void setScore(double s){
        score = s;
    }

    /*
	 * getScore
	 * Input: none
     * Output: score
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public double getScore(){
        return score;
    }

    /*
	 * getGrade
	 * Input: none
     * Output: charactor of grade etc. A, B, F
	 * Author: yourself
	 * Date: 2019-08-9
	 */
    public char getGrade(){
        if(score>=90){
            return 'A';
        }else if(score>=80){
            return 'B';
        }else if(score>=70){
            return 'C';
        }else if(score>=60){
            return 'D';
        }else{
            return 'F';
        }
    }
    
}