package is.ru.honn.feeds;

/**
 * Created by KristinnHeiðar on 21.10.2016.
 */

import is.ru.honn.factory.ReaderFactory;

public class ReaderProcess
{
    FeedReader reader;
    public ReaderProcess()
    {
        reader = ReaderFactory.getFeedReader(
                "http://www.olafurandri.com/?feed=rss2");
                //"http://instagram.com/tags/photooftheday/feed/recent.rss");
    }

    public void read()
    {
        reader.read();
    }
}
