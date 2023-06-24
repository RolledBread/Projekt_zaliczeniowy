package library;

import utility.FileIO;

import java.util.ArrayList;
/** Book object*/
public class Book {
    private String title;
    private String author;
    public static ArrayList<Book> listOfBooks = new ArrayList<Book>();

    /**create book objects from file using FileIO class*/
    public static void loadBooks(){
        FileIO file = new FileIO("src/main/resources/books.txt");
        ArrayList<String> books = file.readFile();

        for (String book:books){
            String[] bookSplit = book.split(" - ");
            new Book(bookSplit[0],bookSplit[1]);
        }
    }
    /**Constructor of book. Adds each book to static array in this class*/
    Book(String title,String author){
        this.title = title;
        this.author = author;
        listOfBooks.add(this);
    }
    /**Makes toString return book in format *title* by *author* */
    @Override
    public String toString() {
        return title + " by "+ author;
    }
}
