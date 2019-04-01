/**
 * This is the book class
 * it will keep track of the books in the store
 * <p>
 * With this class you can
 * <ul>
 * <li>Get the number of pages</li>
 * <li>Get the publisher</li>
 * <li>Get the current issue</li>
 * </ul>
 *
 * @author (Stig Helge Bruset, Ola Sæterøy, Magnus Sandøy)
 * @version (v1)
 */
public class Book extends Literature {
    private String title;
    private String author;
    private int numberOfPages;
    private String publisher;
    private String releaseDate;
    private String issue;


    /**
     * Constructor for objects of class Book
     */

    public Book(String title, String author, int numberOfPages, String publisher, String releaseDate, String issue) {
        super(title, publisher);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.releaseDate = releaseDate;
        this.issue = issue;
    }


    /**
     * Returns the title of the book.
     *
     * @return the title of the book on the form "title".
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * returns the name of the author.
     *
     * @return the author of the book on the form "author".
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * returns the number of pages
     *
     * @retun the number of pages in the book on the form "int"
     */
    public int getPages() {
        return this.numberOfPages;
    }

    /**
     * returns the name of the publisher.
     *
     * @return the publisher of the book on the form "publisher".
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * returns the date of release.
     *
     * @return the date of release of the book on the form "release date".
     */
    public String getReleaseDate() {
        return this.releaseDate;
    }

    /**
     * returns the current book issue.
     *
     * @return the issue of the book on the form "issue".
     */
    public String getIssue() {
        return this.issue;
    }
}
