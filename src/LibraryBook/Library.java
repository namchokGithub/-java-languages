package LibraryBook;

import LibraryBook.Book;

/**
 * Library
 * File name: Library.java
 * Author: yourself
 * Create date: 2019-08-30
 * Update date: 2019-08-30
 */
public class Library {

    private Book[] book;

    /*
	 * Constructor
	 * Input: none
     * Output: none
	 * Author: yourself
     * Create date: 2019-08-30
	 */
    public Library(Book[] book){
        this.book = book;
    }

    /*
	 * searchBook
	 * Input: name or id of book
     * Output: index of book
	 * Author: yourself
     * Create date: 2019-08-30
	 */
    public int searchBook(String wantB){
        for(int i=0;i<this.book.length;i++){
            if(this.book[i].getBookID().equals(wantB)||this.book[i].getTitle().equals(wantB)){
                return i;
            }
        }
        return -1;
    }

    /*
	 * borrowBook
	 * Input: name or id of book
     * Output: tell you can borrow the book
	 * Author: yourself
     * Create date: 2019-08-30
	 */
    public void borrowBook(String wantB){
        int index = searchBook(wantB);
        if(this.book[index].getStatus()=='A'){
            System.out.println(wantB + " can borrow");
            this.book[index].updateStatus();
        }else if(this.book[index].getStatus()=='U'){
            System.out.println(wantB + " is borrowing");
        }
    }
   
    /*
	 * returnBook
	 * Input: name or id of book
     * Output: tell you can return the book
	 * Author: yourself
     * Create date: 2019-08-30
	 */
    public void returnBook(String wantB){
        int index = searchBook(wantB);
        if(this.book[index].getStatus()=='A'){
            System.out.println("This book is not borrowed. Re-input again!!!.");
        }else if(this.book[index].getStatus()=='U'){
            System.out.println("Thank you, the return successful");
        }
    }

    /*
	 * showAllBook
	 * Input: none
     * Output: show all book information
	 * Author: yourself
     * Create date: 2019-08-30
	 */
    public void showAllBook(){
        System.out.println("These are all books in our library");
        for(int i=0;i<this.book.length;i++){
            System.out.println(this.book[i].toString());
        }
    }


}