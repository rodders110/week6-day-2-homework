import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        this.borrower = new Borrower("Roddy");
        this.library = new Library("CodeClan");
    }

    @Test
    public void canBorrowBook(){
        Book book1 = new Book("Crime");
        Book book2 = new Book("Romance");
        this.library.getStock(book);
        this.library.getStock(book);
        this.borrower.borrowBook(library);
        assertEquals(1, borrower.bookCount());
        assertEquals(1,library.countBooks());

    }
}
