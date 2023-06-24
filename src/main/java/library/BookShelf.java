package library;

import java.util.ArrayList;

public class BookShelf {
    private int capacity;
    private ArrayList<Book> allBooks;

    public BookShelf(int capacity, ArrayList<Book> books){
        this.capacity = capacity;
        this.allBooks = books;
    }

}
