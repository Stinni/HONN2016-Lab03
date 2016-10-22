package is.ru.honn.feeds.rss;

/**
 * Created by KristinnHeiðar on 21.10.2016.
 */

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import is.ru.honn.feeds.AbstractFeedReader;
import is.ru.honn.feeds.FeedEntry;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class RssFeedReader extends AbstractFeedReader
{
    public RssFeedReader() {}

    public RssFeedReader(String source)
    {
        this.source = source;
    }

    public boolean read()
    {
        URL feedUrl = null;
        try
        {
            feedUrl = new URL(source);
        }
        catch (MalformedURLException murlex)
        {
            System.out.println("URL is not correct (Malformed)");
        }

        SyndFeedInput input = new SyndFeedInput();
        SyndFeed syndFeed = null;
        try
        {
            syndFeed = input.build(new XmlReader(feedUrl));
        }
        catch (FeedException fex)
        {
            System.out.println("URL is not correct");
            return false;
        }
        catch (IOException ioex)
        {
            System.out.println("URL is not correct");
            return false;
        }

        List list = syndFeed.getEntries();
        Iterator i = list.iterator();
        SyndEntry ent = null;
        while (i.hasNext())
        {
            ent = (SyndEntry) i.next();

            feedHandler.processEntry(new FeedEntry(ent.getTitle(), ent.getLink()));
        }

        return true;
    }
}
