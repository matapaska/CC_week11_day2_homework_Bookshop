import java.util.ArrayList;

public class Borrower {

    private String name;
    public int limit;
    private ArrayList<Book> account;

    public Borrower(String name, int limit) {
        this.name = name;
        this.limit = limit;
        this.account = new ArrayList<Book>();
    }

    public int countBorrowedBooks() {
        return this.account.size();
    }

    public void borrowBook(Book book) {
        account.add(book);
    }
}
