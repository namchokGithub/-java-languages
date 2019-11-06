package Interface.Ex03;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Tester
 * Author: yourself
 * Date: 2019-10-20
 */
public class Tester {

    public static void main(String[] args) {
        Scanner tk = new Scanner(System.in);

        System.out.print("Enter the number of BankAccount : ");
        int numAcc = tk.nextInt();

        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>(numAcc);
        
        for(int i=0;i<numAcc;i++){
            String accNo = tk.next();
            double balance = tk.nextDouble();
            bankAccounts.add(new BankAccount(accNo, balance));
        }

        for(int i=0;i<bankAccounts.size();i++){
            System.out.println("Acc no : " + bankAccounts.get(i).getAccNo() + " Balance : " + bankAccounts.get(i).getMeasure());
        }

        System.out.print("Enter the number of PiggyBank : ");
        int numPig = tk.nextInt();

        ArrayList<PiggyBank> piggyBanks = new ArrayList<PiggyBank>(numPig);

        for(int i=0;i<numPig;i++){

            System.out.print("Enter size and number of deposit : ");

            int size = tk.nextInt();
            int amount = tk.nextInt();

            piggyBanks.add(new PiggyBank(size));

            for(int j=0;j<amount;j++){
                int type = tk.nextInt();

                if(type==1){
                    int one = tk.nextInt();
                    piggyBanks.get(i).addOne(one);
                }else if(type==5){
                    int five = tk.nextInt();
                    piggyBanks.get(i).addFive(five);
                }else if(type==10){
                    int ten = tk.nextInt();
                    piggyBanks.get(i).addTen(ten);
                }
            }

            System.out.println("Total : " + piggyBanks.get(i).getMeasure());

        }

        tk.close();
    }
}