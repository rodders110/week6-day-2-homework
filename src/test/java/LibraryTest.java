import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Codeclan");
        Book book1 = new Book("Crime");
        Book book2 = new Book("Romance");
        Book book3 = new Book("Crime");
        Book book4 = new Book("Sci-fi");
        Book book5 = new Book("Romance");
        this.library.getStock(book1);
        this.library.getStock(book2);
        this.library.getStock(book3);
        this.library.getStock(book4);
        this.library.getStock(book5);
    }

    @Test
    public void canGetBook(){
        assertEquals(3, library.countBooks());

    }

    @Test
    public void cannotAddBookWhenFull(){
        assertEquals(3, this.library.countBooks());
    }

    @Test
    public void canUpdateRecord(){
        library.updateRecord();
        assertEquals("2", this.library.showRecord("Crime").toString());
    }
}
