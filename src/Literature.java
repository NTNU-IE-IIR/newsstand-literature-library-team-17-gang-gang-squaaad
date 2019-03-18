import java.util.ArrayList;

public class Literature {
    private String title;
    private String publisher;

    /**
     * Constructor for objects of class Literature.
     *
     * @param title    The title of the literature.
     * @param publisher   The name of the publisher of the literature.
     */
    public Literature(String title, String publisher)
    {
       this.title = title;
       this.publisher = publisher;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getPublisher()
    {
        return this.publisher;
    }

}