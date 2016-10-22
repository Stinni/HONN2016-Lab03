package is.ru.honn.feeds;

/**
 * Created by KristinnHeiðar on 21.10.2016.
 */

public class ProcessRunner
{
    public static void main(String[] args)
    {
        ReaderProcess readerProcess = new ReaderProcess("http://www.olafurandri.com/?feed=rss2");
        readerProcess.read();
    }
}
