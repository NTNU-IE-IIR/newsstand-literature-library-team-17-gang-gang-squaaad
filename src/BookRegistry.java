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
 * @author (Stig Helge Bruset, Ola Sæterøy, Magnus Sandøy)
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
     * @param searchWord The title of the book to be removed.
     */
    public boolean removeBook(String searchWord) {
        Iterator<Book> bookListIt = this.bookList.iterator();

        boolean removed = false;
        searchWord = searchWord.toLowerCase();
        while (bookListIt.hasNext()) {
            if (bookListIt.next().getTitle().toLowerCase().equals(searchWord)) {
                bookListIt.remove();
                removed = true;
            } else {
                bookListIt.next();

            }
        }return removed;
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
        this.bookList.add(new Book("Den gode boka", "Stig", 55, "Taver",
                "2011-04-14", "Issue 1"));
        this.bookList.add(new Book("Uthullet bok med sprit", "Ola", 150, "NTNU",
                "2018-07-14", "Issue 4"));
        this.bookList.add(new Book("Skummel bok", "Arill", 30, "FF",
                "2017-12-27", "Issue 11"));
    }

    /**
     * Search the bookRegistry for the book with the title given.
     * Returns the book if found. If not found null is returned.
     */
    public Book findBookByTitle(String searchWord) {
        Book book = null;
        searchWord = searchWord.toLowerCase().trim();
        for (Book b : this.bookList) {
            if (b.getTitle().toLowerCase().trim().contains(searchWord)) {
                book = b;
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
    public Book findBookByAuthor(String searchWord) {
        Book book = null;
        searchWord = searchWord.toLowerCase().trim();
        for (Book b : this.bookList) {
            if (b.getAuthor().toLowerCase().trim().contains(searchWord)) {
                book = b;
            }
        }

        return book;
    }
}