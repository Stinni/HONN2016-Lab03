package is.ru.honn.feeds;

/**
 * Created by KristinnHeiðar on 22.10.2016.
 */
public class FeedEntry
{
    protected String title;
    protected String link;

    public FeedEntry()
    {
    }

    public FeedEntry(String title, String link)
    {
        this.title = title;
        this.link = link;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getLink()
    {
        return link;
    }

    public void setLink(String link)
    {
        this.link = link;
    }

    public String toString()
    {
        return title + "\n" + link;
    }
}

