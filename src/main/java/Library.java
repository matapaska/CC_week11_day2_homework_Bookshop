import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> stock;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }


    public int countBooks() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.stock.size() < this.capacity) {
            this.stock.add(book);
        }
    }
}
