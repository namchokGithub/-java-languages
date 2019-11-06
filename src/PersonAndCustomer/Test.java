package PersonAndCustomer;

import PersonAndCustomer.Customer;
import java.util.Scanner;

/**
 * Tester
 */
public class Test {

    public static void main(String[] args) {

        // Person p1 = new Person("Jame", "Chonburi", "084-1254789");

        Customer c1 = new Customer("1122", false);
        c1.setPerson("Jame", "Chonburi", "084-1254789");

        System.out.print(c1.toString());

        // --------------------------------------- //

        Scanner tk = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = tk.nextLine();
        System.out.print("Enter Address: ");
        String address = tk.nextLine();
        System.out.print("Enter Tel: ");
        String telNumber = tk.nextLine();

        Person p2 = new Person(name, address, telNumber);
        System.out.print(p2.toString());

        tk.close();
    }
}