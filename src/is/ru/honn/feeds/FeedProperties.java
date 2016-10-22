package is.ru.honn.feeds;

/**
 * Created by KristinnHeiðar on 21.10.2016.
 */

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FeedProperties extends Properties
{
    protected String reader;
    protected String DEFAULT_PROPERTIES = "feeds.properties";

    public FeedProperties()
    {
        try
        {
            load(new FileInputStream(new File(DEFAULT_PROPERTIES)));
            reader = getProperty("reader");
        }
        catch (Exception e)
        {
            System.out.println("Loading properties failed");
        }
    }

    public String getReader()
    {
        return reader;
    }
}
