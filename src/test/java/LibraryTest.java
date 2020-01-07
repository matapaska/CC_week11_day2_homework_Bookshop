import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before

    public void before() {
        library = new Library("Main", 100);
        book = new Book ("Witcher", "Sapkowski", "fantasy");
        borrower = new Borrower("Sally", 10);
    }

    @Test
    public void canCountBooks() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }
    @Test
    public void canLendBook(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.countBooks());
    }
    @Test
    public void canLendBookToBorrower() {
        library.addBook(book);
        library.lendBook(borrower, book);
        assertEquals(0, library.countBooks());
        assertEquals(1, borrower.countBorrowedBooks());
    }


}
