/*
 * Package: reserveBook
 * File name: Reserve.java
 * Author: yourself
 * Date: 2019-08-6
 */
package reserveBook;

import java.util.Scanner;
import reserveBook.Book;

public class Reserve {

	public static void main(String[] args){

		// สร้างแบบที่ 1 สร้างโดยกำหนดค่า
		// กำหนดผ่าน Constructor
		Book book1 = new Book("Harry Potter", 599, "Joanne Jo Rowling", "Joanna@email.com");
		book1.printBook();
		
		// แบบกำหนดผ่าน Method
		Book book11 = new Book();
		book11.setAuthor("Joanne Jo Rowling", "Joanna@email.com"); 
		book11.setBook("Harry Potter", 599);
		book11.printBook();

		// -------------------------------------------------------------- //

		// สร้างแบบที่ 2 รับค่าผ่านคึย์บอล์ด 
		Scanner tk = new Scanner(System.in);

		// รับค่าข้อมูลของหนังสือ
		System.out.println("----- Book information -----");
		System.out.print("Please enter name of book: ");
		String nameBook = tk.nextLine();
		System.out.print("Please enter price of book: ");
		double price = tk.nextDouble();
		tk.nextLine(); // เพื่อรับค่าต่อไป

		// รับค่าข้อมูลของผู้แต่ง
		System.out.println("\n----- Author information -----");
		System.out.print("Please enter name of author: ");
		String nameAuthor = tk.nextLine();

		// แบบกำหนดผ่าน Method
		Book book2 = new Book();
		book2.setName(nameAuthor);
		book2.setBook(nameBook, price);
		book2.printBook();

		tk.close();

	}
}
