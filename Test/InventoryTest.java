import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest {
    /**
     * Default constructor for test class BookRegistryTest
     */
    public InventoryTest()
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
    public void searchTitleTest()
    {
        Inventory inventory = new Inventory();
        inventory.fillBookRegistryWithDummies();
        assertEquals(3, inventory.getInventorySize());
        assertNotNull(inventory.findLiteratureByTitle("Sprit"));
    }

    @Test
    public void testGetMethods()
    {
        Inventory inventory = new Inventory();
        inventory.fillBookRegistryWithDummies();
        assertEquals(3, inventory.getInventorySize());
    }
    @Test
    public void testSearchbyNameNotFound()
    {
        Inventory inventory = new Inventory();
        inventory.fillBookRegistryWithDummies();
        assertNull(inventory.findLiteratureByTitle("piratebay copi"));
    }

}