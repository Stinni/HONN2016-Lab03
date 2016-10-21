package is.ru.honn.feeds;

/**
 * Created by KristinnHeiðar on 21.10.2016.
 */

public interface FeedReader
{
    public void setSource(String source);
    public boolean read();
}
