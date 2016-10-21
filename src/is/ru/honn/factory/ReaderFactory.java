package is.ru.honn.factory;

import is.ru.honn.feeds.FeedProperties;
import is.ru.honn.feeds.FeedReader;

/**
 * Created by KristinnHeiðar on 21.10.2016.
 */

public class ReaderFactory
{
    public static FeedReader getFeedReader(String source)
    {
        FeedProperties props = new FeedProperties();
        Class instanceClass;
        FeedReader reader = null;
        try
        {
            instanceClass = Class.forName(props.getReader());
            reader = (FeedReader)instanceClass.newInstance();
            reader.setSource(source);
        }
        catch (Exception e)
        {
            throw new FactoryException("Finn ekki gildið", e);
        }
        return reader;
    }
}
