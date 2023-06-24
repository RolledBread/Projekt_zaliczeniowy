package utility;

import library.Book;
import library.BookShelf;

import java.util.Scanner;

public class Menu {
    BookShelf bookShelf;
    public Menu(){
        Book.loadBooks();
        bookShelf = new BookShelf(375,Book.listOfBooks);
        System.out.println("Welcome to library");
        contextMenu();
    }

    private void contextMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("1 - Status of the bookshelf\n2 - List of all books\n3 - exit the program");
        System.out.println("===============");
        switch (scan.nextLine()){
            case "1":
                bookShelf.shelfStatus();
                contextMenu();
            case "2":
                bookShelf.listAllBooks();
                contextMenu();
            case "3":
                break;
            default:
                contextMenu();
        }
    }
}
