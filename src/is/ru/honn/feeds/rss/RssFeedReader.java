package is.ru.honn.feeds.rss;

/**
 * Created by KristinnHeiðar on 21.10.2016.
 */

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import is.ru.honn.feeds.FeedReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class RssFeedReader implements FeedReader
{
    private String source;

    public RssFeedReader()
    {
        // Athugið að það er mikilvægt að hafa þennan smið
        // þó hann geri ekkert.
        // Ef honum er sleppt þá koma ekki þýðingavillur en
        // seinna í verkefninu notum við “reflection” til að
        // búa þennan klasa til og þá verður að vera til
        // færibreytulaus smiður.
    }

    public RssFeedReader(String source)
    {
        this.source = source;
    }

    public String getSource()
    {
        return source;
    }

    public void setSource(String source)
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
            System.out.println(ent.getTitle());
            System.out.println(ent.getLink());
        }

        return true;
    }
}
