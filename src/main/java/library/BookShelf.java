package library;

import java.util.ArrayList;

public class BookShelf {
    int capacity;
    ArrayList<Book> allBooks;

    public BookShelf(int capacity, ArrayList<Book> books){
        this.capacity = capacity;
        this.allBooks = books;
    }
    /** returns fill ration of bookshelf */
    public String fillRatio(){
        float amountOfBooks = allBooks.size();
        float fillRatio = amountOfBooks/capacity;
        int percentFillRatio = Math.round(fillRatio*100);

        return percentFillRatio + "%";
    }
    /**returns number of books and fill ratio of the shelf*/
    public String shelfStatus(){
        return "There are " + allBooks.size() + " books on the shelf.\nFill status: "+ fillRatio();
    }
    /**Prints the list of all books on the shelf*/
    public void listAllBooks(){
        int index = 1;
        for(Book book:allBooks){
            System.out.println(index +" "+ book);
            index++;
        }
    }

}
