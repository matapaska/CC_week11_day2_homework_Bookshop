import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> stock;

    public Library(String name){
        this.name = name;
        this.stock = new ArrayList<Book>();
    }


}
