import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before

    public void before() {
        library = new Library("Main", 100);
        book = new Book ("Witcher", "Sapkowski", "fantasy");
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


}
