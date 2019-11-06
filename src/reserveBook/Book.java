/*
 * Package: reserveBook
 * File name: Book.java
 * Author: yourself
 * Date: 2019-08-5
 */
package reserveBook;

import reserveBook.Author;

public class Book {
	private Author author; // ชื่อเจ้าของหนังสือ
	private String name; // ชื่อหนังสือ
	private double price; // ราคาหนังสือ
	
	/*
	 * Constructor
	 * Parameter: void
	 * Author: yourself
	 * Date: 2019-08-5
	 */
	public Book() {
		this.name = "default";
		this.price = 0.0;
		this.author = new Author();
	}
	
	/*
	 * Constructor
	 * Parameter: name type: nameBook, price type: double
	            , author type: Author, nameAuthor type: String
	            , email type: String
	 * Author: yourself
	 * Date: 2019-08-5
	 */
	public Book(String nameBook, double price, String nameAuthor, String email) {
		this.name = nameBook;
		this.price = price;
		this.author = new Author(nameAuthor, email);
	}
	
	/*
	 * Name: setBook
	 * Parameter: nameBook type: string, price type: double
	 * Return: void
	 * Author: yourself
	 * Date: 2019-08-05
	 */
	public void setBook(String nameBook, double price) {
		this.name = nameBook;
		this.price = price;
	}
	
	/*
	 * Name: setAuthor
	 * Parameter: nameBook type: string, price type: double
	 * Return: void
	 * Author: yourself
	 * Date: 2019-08-05
	 */
	public void setAuthor(String nameAuthor, String email) {
		this.author.setName(nameAuthor);
		this.author.setEmail(email);
	}

		/*
	 * Name: setName
	 * Parameter: nameBook type: string, price type: double
	 * Return: void
	 * Author: yourself
	 * Date: 2019-08-05
	 */
	public void setName(String nameAuthor) {
		this.author.setName(nameAuthor);
	}

	/*
	 * Name: getPrice
	 * Parameter: void
	 * Return: price of book
	 * Author: yourself
	 * Date: 2019-08-05
	 */
	public double getPrice() {
		return this.price;
	}

	/*
	 * Name: getName
	 * Parameter: void
	 * Return: name of book
	 * Author: yourself
	 * Date: 2019-08-05
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * Name: printBook
	 * Parameter: void
	 * Return: Information of book
	 * Author: yourself
	 * Date: 2019-08-05
	 */
	public void printBook() {
		System.out.println("\nName: " + this.name);
		System.out.println("Author: " + this.author.getName());
		System.out.println("Price: " + this.price + "\n\n");
	}
}
