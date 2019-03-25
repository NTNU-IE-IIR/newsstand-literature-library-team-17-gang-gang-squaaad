import java.util.ArrayList;

public class Newspaper extends Literature
{
    private String issue;

    /**
     * Constructor for objects of class MessagePost.
     *
     * @param title
     * @param publisher
     * @param issue
     */
    public Newspaper(String title, String publisher, String issue)
    {
        super(title,publisher);
        this.issue = issue;
    }

    public String getIssue()
    {
        return this.issue;
    }
}
