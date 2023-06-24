import library.Book;
import library.BookShelf;
import utility.FileIO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Book.loadBooks();
        BookShelf bookShelf = new BookShelf(349,Book.listOfBooks);
    }
}
