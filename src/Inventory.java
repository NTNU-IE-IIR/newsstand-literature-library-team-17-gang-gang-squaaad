import java.util.ArrayList;
import java.util.Iterator;


public class Inventory {

    private ArrayList<Literature> inventoryList;
    /**
     * Constructor for objects of class Inventory.
     */
    public Inventory() {
        this.inventoryList = new ArrayList<Literature>();
    }

    /**
     * Adds a book to the registry.
     *
     * @param literature The literature to be added to the registry.
     *             if<code>null</code>, nothing is being added.
     */
    public void addLiterature(Literature literature)
    {
        this.inventoryList.add(literature);
    }



    public Iterator<Literature> getIterator()
    {
        return this.inventoryList.iterator();
    }


}