/*
 * Package: reserveBook
 * File name: Author.java
 * Author: yourself
 * Date: 2019-08-5
 */
package reserveBook;
public class Author {
	private String name;
	private String email;
	
	/*
	 * Constructor
	 * Parameter: void
	 * Return: void
	 * Author: yourself
	 * Date: 2019-08-5
	 */
	public Author() {
		this.name = "default";
		this.email = "default";
	}
	
	/*
	 * Constructor
	 * Parameter: name type: String, name email type: String 
	 * Return: void
	 * Author: yourself
	 * Date: 2019-08-5
	 */
	public Author(String name, String email) {
		this.name=name;
		this.email=email;
	}
	
	/*
	 * Name: setName
	 * Parameter: name type: String
	 * Return: void
	 * Author: yourself
	 * Date: 2019-08-5
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * Name: setEmail
	 * Parameter: email type: String
	 * Return: void
	 * Author: yourself
	 * Date: 2019-08-5
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/*
	 * Name: getName
	 * Parameter: void
	 * Return: name type: String
	 * Author: yourself
	 * Date: 2019-08-5
	 */
	public String getName() {
		return this.name;
	}
	
	/*
	 * Name: getEmail
	 * Parameter: void
	 * Return: email type: String
	 * Author: yourself
	 * Date: 2019-08-5
	 */
	public String getEmail() {
		return this.email;
	}
	
	/*
	 * Name: printInfo
	 * Parameter: void
	 * Return: Output info to screen
	 * Author: yourself
	 * Date: 2019-08-5
	 */
	public void printInfo() {
		System.out.println("Name: " + this.name + ", " + this.email);
	}

}
