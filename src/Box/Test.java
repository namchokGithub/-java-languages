package Box;

import java.util.Scanner;
import Box.Box;
/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        double length1;
        double width1;
        double length2;
        double width2;
        double depth1;
        double depth2;

        Scanner tk = new Scanner(System.in);

        System.out.print("Enter length of R1: ");
        length1 = tk.nextDouble();
        System.out.print("Enter width of R1: ");
        width1 = tk.nextDouble();
        System.out.print("Enter length of R2: ");
        length2 = tk.nextDouble();
        System.out.print("Enter width of R2: ");
        width2 = tk.nextDouble();

        Rectangle R1 = new Rectangle(length1, width1);
        Rectangle R2 = new Rectangle(length2, width2);

        System.out.println(R1.toString());
        System.out.println(R2.toString());
        System.out.println("Area of R1 = " + R1.area() + "Area of R2 = " + R2.area());

        if(R1.area() == R2.area()){
            System.out.println("R1 is equal to R2");
        }else if(R1.area() > R2.area()){
            System.out.println("R1 is bigger than R2");
        }else {
            System.out.println("R1 is smaller than R2");
        }

        System.out.print("Enter [width, length, depth] of R1: ");
        length1 = tk.nextDouble();
        width1 = tk.nextDouble();
        depth1 = tk.nextDouble();
        System.out.print("Enter [width, length, depth] of R2: ");
        length2 = tk.nextDouble();
        width2 = tk.nextDouble();
        depth2 = tk.nextDouble();

        Box B1 = new Box(length1, width1, depth1);
        Box B2 = new Box(length2, width2, depth2);

        System.out.println(B1.toString());
        System.out.println(B2.toString());
        System.out.println("Volume of R1 = " + B1.volume() + "Volume of R2 = " + B2.volume());

        if(B1.volume() ==B2.volume()){
            System.out.println("B1 is equal to B2");
        }else if(B1.volume() > B2.volume()){
            System.out.println("B1 is bigger than B2");
        }else {
            System.out.println("B1 is smaller than B2");
        }

        tk.close();
    }
}