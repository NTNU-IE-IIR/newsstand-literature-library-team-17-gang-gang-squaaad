

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BookRegistryTest.
 *
 * @author (Stig Helge Bruset, Ola Sæterøy, Magnus Sandøy)
 * @version (v1)
 */
public class BookRegistryTest
{
    /**
     * Default constructor for test class BookRegistryTest
     */
    public BookRegistryTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Tests the search author method
     */
    @Test
    public void SearchAuthorTest()
    {
        BookRegistry bookRegi1 = new BookRegistry();
        bookRegi1.fillBookRegistryWithDummies();
        assertEquals(3, bookRegi1.getNumberOfBooks());
        assertNotNull(bookRegi1.findBookByAuthor("Ola"));
    }

    @Test
    public void testGetMethods()
    {
        BookRegistry bookRegi1 = new BookRegistry();
        bookRegi1.fillBookRegistryWithDummies();
        assertEquals(3, bookRegi1.getNumberOfBooks());
    }
}


