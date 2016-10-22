package is.ru.honn.feeds;

/**
 * Created by KristinnHeiðar on 21.10.2016.
 */

import is.ru.honn.factory.ReaderFactory;

public class ReaderProcess implements FeedHandler
{
    FeedReader reader;

    public ReaderProcess(String source)
    {
        reader = ReaderFactory.getFeedReader();
        reader.setFeedHandler(this);
        reader.setSource(source);
    }

    public void read()
    {
        reader.read();
    }

    public void processEntry(FeedEntry entry)
    {
        System.out.println(entry);
    }
}
