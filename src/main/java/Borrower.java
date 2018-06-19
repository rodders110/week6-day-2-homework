import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;
    private String name;
    private Library library;


    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public void borrowBook(Library library){
        this.collection.add(library.borrowBook());
    }

    public int bookCount(){
        return this.collection.size();
    }
}
