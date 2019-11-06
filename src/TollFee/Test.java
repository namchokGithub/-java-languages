package TollFee;
import java.util.Scanner;

/**
 * Test
 * File name: Test.java
 * Author: yourself
 * Date: 2019-10-09
 */
public class Test {

    public static void main(String[] args) {
        Scanner tk = new Scanner(System.in);

        int numOfTotalCar = tk.nextInt();

        String typeCar;
        String methodPay;
        int totalCar = 0;
        int totalTruck = 0;
        int totalTrailer = 0;
        int numOfCar = 0;
        int numOfTruck = 0;
        int numOfTrailer = 0;

        Car car = new Car();
        Truck truck = new Truck();
        Trailer trailer = new Trailer();

        for(int i=0;i<numOfTotalCar;i++){
                typeCar = tk.next();
                methodPay = tk.next();

                if(typeCar.equals("A")){
                    if(methodPay.equals("C")){
                        totalCar+=car.cashRate();
                    }else if(methodPay.equals("E")){
                        totalCar+=car.ePassRate();
                    }
                    numOfCar++;
                }else if(typeCar.equals("B")){
                    if(methodPay.equals("C")){
                        totalTruck+=truck.cashRate();
                    }else if(methodPay.equals("E")){
                        totalTruck+=truck.ePassRate();
                    }
                    numOfTruck++;
                }else if(typeCar.equals("C")){
                    if(methodPay.equals("C")){
                        totalTrailer+=trailer.cashRate();
                    }else if(methodPay.equals("E")){
                        totalTrailer+=trailer.ePassRate();
                    }
                    numOfTrailer++;
                }
            }

        System.out.println("You have " + numOfCar + " car. \tTotal Fee is " + totalCar + " Bath.");
        System.out.println("You have " + numOfTruck + " truck. \tTotal Fee is " + totalTruck + " Bath.");
        System.out.println("You have " + numOfTrailer + " trailer. \tTotal Fee is " + totalTrailer + " Bath.");

        tk.close();
    }

}