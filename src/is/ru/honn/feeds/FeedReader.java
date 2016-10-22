package is.ru.honn.feeds;

/**
 * Created by KristinnHeiðar on 21.10.2016.
 */

public interface FeedReader
{
    boolean read();
    void setSource(String source);
    void setFeedHandler(FeedHandler handler);
}
