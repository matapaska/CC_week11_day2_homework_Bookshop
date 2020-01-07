import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower("Euegene", 6);
        book = new Book("Snow", "Pamuk", "drama");
    }
    @Test
    public void hasEmptyAccount(){
        assertEquals(0, borrower.countBorrowedBooks());
    }
    @Test
    public void canBorrowBooks(){
        borrower.borrowBook(book);
        assertEquals(1, borrower.countBorrowedBooks());
    }


}
