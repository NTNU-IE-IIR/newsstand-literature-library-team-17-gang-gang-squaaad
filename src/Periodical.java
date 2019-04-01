/**
 * This is the Periodical class
 * it will keep track of the periodicals in the store
 * <p>
 * With this class you can
 * <ul>
 * <li>Get the issue </li>
 * <li>Get the subjectArea</li>
 * <li>Get the number of Realeses</li>
 * </ul>
 *
 * @author (Stig Helge Bruset, Ola Sæterøy, Magnus Sandøy)
 * @version (v1)
 */
public class Periodical extends Literature {

    private String issue;
    private String subjectArea;
    private int numberOfReleases;


    /**
     * Constructor for objects of class Periodical.
     *
     * @param title
     * @param publisher
     * @param issue
     * @param subjectArea
     * @param numberOfReleases
     */
    public Periodical(String title, String publisher, String issue, String subjectArea, int numberOfReleases)
    {
        super(title, publisher);
        this.issue = issue;
        this.subjectArea = subjectArea;
        this.numberOfReleases = numberOfReleases;
    }

    /**
     * returns the current periodical issue.
     *
     * @return the issue of the periodical on the form "issue".
     */
    public String getIssue()
    {
        return this.issue;
    }

    /**
     * returns the subject area of the periodical.
     *
     * @return the subject area of the periodical on the form "subjectArea".
     */
    public String getSubjectArea()
    {
        return this.subjectArea;
    }

    /**
     * returns the number of releases of the periodical.
     *
     * @return the number of releases on the periodical on the form "numberOfReleases".
     */
    public int getNumberOfReleases()
    {
        return this.numberOfReleases;
    }
}

