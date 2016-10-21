package is.ru.honn.feeds;

/**
 * Created by KristinnHeiðar on 21.10.2016.
 */

import is.ru.honn.feeds.rss.RssFeedReader;

public class ReaderProcess
{
    FeedReader reader;
    public ReaderProcess()
    {
        reader = new RssFeedReader(
                "http://instagram.com/tags/photooftheday/feed/recent.rss");
    }

    public void read()
    {
        reader.read();
    }
}

