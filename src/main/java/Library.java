import com.sun.prism.impl.Disposer;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private final HashMap<String, Integer> record;
    private ArrayList<Book> stock;
   private Integer capacity;
   private String name;
   private Book book;



    public Library(String name){
        this.name = name;
        this.stock = new ArrayList<Book>();
        this.capacity = 4;
        this.record = new HashMap<String, Integer>();
    }

    public void getStock(Book book) {
        if (this.capacity != 0) {
            this.stock.add(book);
            this.capacity--;
        }
    }

    public int countBooks(){
        return this.stock.size();
    }

    public Book borrowBook(){
        return this.stock.remove(0);
    }

    public void updateRecord(){
        int i = 0;
        for(Book book : this.stock){
            if(this.record.containsKey(book.getGenre())){
                int value = this.record.get(book.getGenre());
                this.record.put(book.getGenre(), value + 1);
            }else{
                this.record.put(book.getGenre(), 1 );
            }

        }
    }

    public Integer showRecord(String genre){
        return this.record.get(genre);
    }
}
