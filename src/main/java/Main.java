import library.Book;
import utility.FileIO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Book.loadBooks();
        System.out.println(Book.listOfBooks);
    }
}
