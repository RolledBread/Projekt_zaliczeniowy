import library.Book;
import library.BookShelf;

public class Main {
    public static void main(String[] args){
        Book.loadBooks();
        BookShelf bookShelf = new BookShelf(200,Book.listOfBooks);
        bookShelf.listAllBooks();
    }
}
