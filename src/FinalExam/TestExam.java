package FinalExam;

import java.util.Scanner;
import FinalExam.FinalExam;
/**
 * class TestExam
 * File name: TestExam.java
 * Author: yourself
 * Date: 2019-08-9
 */
public class TestExam {

    public static void main(String[] args) {
        
        Scanner tk = new Scanner(System.in);

        GradeActivity grade = new GradeActivity();
        
        System.out.print("Enter score : ");
        int score = tk.nextInt();
        
        grade.setScore(score);
        System.out.println("Grade : " + grade.getGrade());

        // กำหนดจำนวนข้อสอบ
        System.out.print("The number of question : ");
        int numQuestion = tk.nextInt();

        // กำหนดจำนวนข้อผิด
        System.out.print("The number of missed answer : ");
        int numMissed = tk.nextInt();

        FinalExam f1 = new FinalExam(numQuestion, numMissed);

        /*
         * วิธีการคำนวน: 
         *   นำจำนวนข้อสอบ (numQuestion) ลบ กับ จำนวนข้อผิด (numMissed) แล้วคูณด้วย ค่าคะแนนแต่ละข้อ (PointsEach)
         */
        double score2 = (numQuestion-numMissed) * f1.getPointsEach();
        System.out.println("Score : " + score2);
        f1.setScore(score2);
        System.out.println("Grade : " + f1.getGrade());

        tk.close();
    }
    
}