public abstract class Literature {
    protected String title;
    protected String publisher;


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

    /**
     * returns the current literature title.
     *
     * @return the title of the literature on the form "title".
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     * returns the publisher of the literature.
     *
     * @return the publisher of the literature on the form "publisher".
     */
    public String getPublisher()
    {
        return this.publisher;
    }

}
