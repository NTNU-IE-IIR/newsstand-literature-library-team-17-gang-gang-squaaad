/**
 * This is the Magazine class
 * it will keep track of the magazines in the store
 * <p>
 * With this class you can
 * <ul>
 * <li>Get the issue </li>
 * <li>Get the genre</li>
 * <li>Get the number of Releases</li>
 * </ul>
 *
 * @author (Stig Helge Bruset, Ola Sæterøy, Magnus Sandøy)
 * @version (v1)
 */
public class Magazine extends Literature {


    private String issue;
    private String genre;
    private int numberOfReleases;


    /**
     * Constructor for objects of class Magazine.
     *
     * @param title
     * @param publisher
     * @param issue
     * @param genre
     * @param numberOfReleases
     */
    public Magazine(String title, String publisher, String issue, String genre, int numberOfReleases) {
        super(title, publisher);
        this.issue = issue;
        this.genre = genre;
        this.numberOfReleases = numberOfReleases;
    }

    /**
     * returns the current magazine issue.
     *
     * @return the issue of the magazine on the form "issue".
     */
    public String getIssue() {
        return this.issue;
    }

    /**
     * returns the genre of the periodical.
     *
     * @return the genre of the periodical on the form "subjectArea".
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * returns the number of releases of the Magazine.
     *
     * @return the number of releases on the magazine on the form "numberOfReleases".
     */
    public int getNumberOfReleases() {
        return this.numberOfReleases;
    }
}
