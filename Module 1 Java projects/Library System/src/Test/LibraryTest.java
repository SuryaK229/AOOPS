package Test;

import Application.Library;
import Application.Book;
import Application.Patron;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;
    private Book book;
    private Patron patron;

    @BeforeEach
    public void setUp() {
        library = new Library();
        book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        patron = new Patron("John Doe");
        library.addBook(book);
        library.registerPatron(patron);
    }

    @Test
    public void testAddingBooks() {
        assertEquals("The Great Gatsby", book.getTitle());
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
        assertFalse(book.isLoaned());
    }

    @Test
    public void testRegisteringPatrons() {
        assertEquals("John Doe", patron.getName());
    }

    @Test
    public void testLoaningBooks() {
        assertTrue(library.loanBook("The Great Gatsby", "John Doe"));
        assertTrue(book.isLoaned());
    }

    @Test
    public void testReturningBooks() {
        library.loanBook("The Great Gatsby", "John Doe");
        assertTrue(library.returnBook("The Great Gatsby"));
        assertFalse(book.isLoaned());
    }
    @Test
    public void testSample() {
        assertTrue(true, "This test should pass.");
    }
}


