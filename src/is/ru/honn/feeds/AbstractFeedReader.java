package is.ru.honn.feeds;

/**
 * Created by KristinnHeiðar on 22.10.2016.
 */
public abstract class AbstractFeedReader implements FeedReader
{
    protected FeedHandler feedHandler;
    protected String source;

    public void setSource(String source)
    {
        this.source = source;
    }

    public void setFeedHandler(FeedHandler feedHandler)
    {
        this.feedHandler = feedHandler;
    }

    public abstract boolean read();
}
