package LibraryBook;

/**
 * Book
 * File name: Book.java
 * Author: yourself
 * Create date: 2109-08-30
 * Update date: 2109-08-30
 */
public class Book {

    private String bookID;
    private String title;
    private String author;
    private char status;

    /*
	 * Constructor
	 * Input: name id and author
     * Output: none
	 * Author: yourself
     * Create date: 2019-08-30
	 */
    public Book(String bookID, String title, String author){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.status = 'A';
    }

    /*
	 * getBookID
	 * Input: none
     * Output: book id
	 * Author: yourself
     * Create date: 2019-08-30
	 */
    public String getBookID(){
        return this.bookID;
    }

    /*
	 * getStatus
	 * Input: none
     * Output: status of book
	 * Author: yourself
     * Create date: 2019-08-30
	 */
    public char getStatus(){
        return this.status;
    }

    /*
	 * getTitle
	 * Input: none
     * Output: title of book
	 * Author: yourself
     * Create date: 2019-08-30
	 */
    public String getTitle(){
        return this.title;
    }

    /*
	 * updateStatus
	 * Input: none
     * Output: none
	 * Author: yourself
     * Create date: 2019-08-30
	 */
    public void updateStatus(){
        if(this.status=='A'){
            this.status='U';
        }else if(this.status=='U'){
            this.status='A';
        }
    }

    /*
	 * checkStatus
	 * Input: none
     * Output: status name
	 * Author: yourself
     * Create date: 2019-08-30
	 */
    public String checkStatus(){
        if(this.status=='A'){
            return "Available";
        }else if(this.status=='U'){
            return "Unavailable";
        }else{
            return "Sorry";
        }
    }

    /*
	 * toString
	 * Input: none
     * Output: information of book
	 * Author: yourself
     * Create date: 2019-08-30
	 */
    public String toString(){
        return "ID : " + this.bookID + " Title : " + this.title + " Author : " + this.author + " Status : " + checkStatus();
    }
}