import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a BookRegistry holding a collection
 * of books with their Title, author, pages, publisher, release date and issue
 * <p>
 * From this regitry you can
 * <ul>
 * <li>Add book</li>
 * <li>Remove book</li>
 * <li>Get the number of books in the list </li>
 * <li>List all the books and it's corresponding information </li>
 * <li>find book by title</li>
 * <li>find book by author</li>
 * </ul>
 *
 * @author (Stig Helge Bruset)
 * @version (v1)
 */
public class BookRegistry {

    private ArrayList<Book> bookList;

    /**
     * Constructor for objects of class BookRegistry.
     */
    public BookRegistry() {
        this.bookList = new ArrayList<Book>();
    }

    /**
     * Adds a book to the registry.
     *
     * @param book The book to be added to the registry.
     *             if<code>null</code>, nothing is being added.
     */
    public void addBook(Book book) {
        this.bookList.add(book);
    }

    /**
     * removes a book from the registry.
     *
     * @param index The index of the book to be removed.
     */
    public void removeBook(int index) {
        if (index >= 0 && index < this.bookList.size()) {
            this.bookList.remove(index);
        }
    }

    public Iterator<Book> getIterator() {
        return this.bookList.iterator();
    }

    /**
     * shows the number of books in the registry.
     *
     * @return the number of books on the form "int".
     */
    public int getNumberOfBooks() {
        return this.bookList.size();
    }


    /**
     * add 3 dummies to the list for testing.
     */
    public void fillBookRegistryWithDummies() {
        this.bookList.add(new Book("Stig", "Den gode boka", 55, "Taver",
                "2011-04-14", "Issue 1"));
        this.bookList.add(new Book("Ola", "Uthullet bok med sprit", 150, "NTNU",
                "2018-07-14", "Issue 4"));
        this.bookList.add(new Book("Arill", "Skummel bok", 30, "FF",
                "2017-12-27", "Issue 11"));
    }

    /**
     * Search the bookRegistry for the book with the title given.
     * Returns the book if found. If not found null is returned.
     */
    public Book findBookByTitle(String title) {
        Book book = null;

        for (Book p : this.bookList) {
            if (p.getTitle().contains(title)) {
                book = p;
            }
        }

        return book;
    }

    /**
     * Search the bookRegistry for the book with the author given.
     * Returns the author if found. If not found null is returned.
     * If there are multiple books with
     * the same author only the last one is returned.
     * (It's a feature not a bug!!! don't @ me)
     */
    public Book findBookByAuthor(String author) {
        Book book = null;

        for (Book p : this.bookList) {
            if (p.getAuthor().contains(author)) {
                book = p;
            }
        }

        return book;
    }
}