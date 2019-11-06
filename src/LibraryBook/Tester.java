package LibraryBook;

import java.util.Scanner;
import LibraryBook.Library;

/**
 * Tester
 * File name: File.java
 * Author: yourself
 * Create date: 2019-08-30
 * Update date: 2019-08-30
 */

public class Tester {
    public static void main(String[] args) {
        Scanner tk = new Scanner(System.in);

        Book[] book = new Book[5];
        book[0] = new Book("100", "Programming", "John");
        book[1] = new Book("200", "Object-Oriented Programming", "May");
        book[2] = new Book("300", "Graphic", "Mary");
        book[3] = new Book("400", "Statistics", "Martin");
        book[4] = new Book("500", "Database", "John");
        
        Library l = new Library(book);
        l.showAllBook();

        String wantB;
        
        char ch = ' ';

        do{
            System.out.println("<=== Enter the number what do you want to do ===>");
            System.out.println("1. Borrow a book");
            System.out.println("2. Return a book");
            System.out.println("3. Search a book");
            System.out.println("q. Quit the system");
            System.out.print("Select = ");
            ch = tk.next().charAt(0);

            switch (ch){
                case '1' : 
                    System.out.print("Enter [id/title] of book : ");
                    wantB = tk.next();

                    if(l.searchBook(wantB)!=-1){
                        l.borrowBook(wantB);
                    }else{
                        System.out.println("Sorry, this book cannot be found in out library.");
                    }
                    break; // Borrow
                case '2' : 
                    System.out.print("Enter [id/title] of book : ");
                    wantB = tk.next();

                    if(l.searchBook(wantB)!=-1){
                        l.returnBook(wantB);
                    }else{
                        System.out.println("Sorry, this book cannot be found in out library.");
                    }
                    break; // Return
                case '3' : 
                    System.out.print("Enter [id/title] of book : ");
                    wantB = tk.next();

                    if(l.searchBook(wantB)!=-1){
                        System.out.println(book[l.searchBook(wantB)].toString());
                    }else{
                        System.out.println("Sorry, this book cannot be found in out library.");
                    }
                    break; // Search
                case 'q' : break;
                default : System.out.println("Input invalid, try again!!!");
            }
        }while(ch!='q');
        System.out.println("Thank you");
        
        tk.close();
    }
}
