

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BookTest.
 *
 * @author (Stig Helge Bruset, Ola Sæterøy, Magnus Sandøy)
 * @version (v1)
 */
public class BookTest {
    /**
     * Default constructor for test class BookTest
     */
    public BookTest() {
    }

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @Before
    public void setUp() {

    }

    /**
     * Tears down the test fixture.
     * <p>
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }


    /**
     * Creates a book and tests get methods
     */
    @Test
    public void testGetMethods() {
        Book book1 = new Book("test", "Test Testeson", 18, "testington academy", "last week", "1");
        assertEquals("Test Testeson", book1.getAuthor());
        assertEquals("1", book1.getIssue());
        assertEquals(18, book1.getPages());
        assertEquals("testington academy", book1.getPublisher());
        assertEquals("last week", book1.getReleaseDate());
        assertEquals("test", book1.getTitle());
        assertEquals("1", book1.getIssue());
    }


    /**
     * Creates a book and tests get methods
     */
    @Test
    public void testInvalidInput() {
        Book book1 = new Book("test", "Test Testeson", 18, "testington academy", "last week", "1");
        assertEquals("Test Testeson", book1.getAuthor());
        assertEquals("1", book1.getIssue());
        assertEquals(18, book1.getPages());
        assertEquals("testington academy", book1.getPublisher());
        assertEquals("last week", book1.getReleaseDate());
        assertEquals("test", book1.getTitle());
        assertEquals("1", book1.getIssue());
    }

}

