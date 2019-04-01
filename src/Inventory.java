import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a inventory holding a collection
 * of books with their Title, author, pages, publisher, release date and issue
 * <p>
 * From this Inventory you can
 * <ul>
 * <li>Add book</li>
 * <li>Remove book</li>
 * <li>Get the number of books in the list </li>
 * <li>List all the books and it's corresponding information </li>
 * <li>find book by title</li>
 * <li>find book by author</li>
 * </ul>
 *
 * @author (Stig Helge Bruset, Ola Sæterøy, Magnus Sandøy)
 * @version (v1)
 */
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
     *                   if<code>null</code>, nothing is being added.
     */
    public void addBook(Literature literature) {
        this.inventoryList.add(literature);
    }


    /**
     * removes a book from the registry.
     *
     * @param searchWord The title of the book to be removed.
     */
    public boolean removeLiterature(String searchWord) {
        Iterator<Literature> inventoryListIt = this.inventoryList.iterator();

        boolean removed = false;
        searchWord = searchWord.toLowerCase();
        while (inventoryListIt.hasNext()) {
            if (inventoryListIt.next().getTitle().toLowerCase().equals(searchWord)) {
                inventoryListIt.remove();
                removed = true;
            } else {
                inventoryListIt.next();

            }
        }
        return removed;
    }

    public Iterator<Literature> getIterator() {
        return this.inventoryList.iterator();
    }

    /**
     * shows the number of books in the registry.
     *
     * @return the number of books on the form "int".
     */
    public int getInventorySize() {
        return this.inventoryList.size();
    }


    /**
     * add 3 dummies to the list for testing.
     */
    /**
     * public void fillBookRegistryWithDummies() {
     * this.inventoryList.add(new Book("Den gode boka", "Stig", 55, "Taver",
     * "2011-04-14", "Issue 1"));
     * this.inventoryList.add(new Book("Uthullet bok med sprit", "Ola", 150, "NTNU",
     * "2018-07-14", "Issue 4"));
     * this.inventoryList.add(new Book("Skummel bok", "Arill", 30, "FF",
     * "2017-12-27", "Issue 11"));
     * }
     * <p>
     * /**
     * Search the bookRegistry for the book with the title given.
     * Returns the book if found. If not found null is returned.
     */
    public Literature findLiteratureByTitle(String searchWord) {
        Literature literature = null;
        searchWord = searchWord.toLowerCase().trim();
        for (Literature l : this.inventoryList) {
            if (l.getTitle().toLowerCase().trim().contains(searchWord)) {
                literature = l;
            }
        }

        return literature;
    }

    /**
     * Search the bookRegistry for the book with the author given.
     * Returns the author if found. If not found null is returned.
     * If there are multiple books with
     * the same author only the last one is returned.
     * (It's a feature not a bug!!! don't @ me)
     */
    public Literature findLiteratureByAuthor(String searchWord) {
        Literature literature = null;
        searchWord = searchWord.toLowerCase().trim();
        for (Literature lit : this.inventoryList) {
            if (lit instanceof Book) {
                Book book = (Book) lit;
                if (book.getAuthor().toLowerCase().trim().contains(searchWord))
                {
                    literature = lit;
                }
            }


        }
        return literature;
    }
}