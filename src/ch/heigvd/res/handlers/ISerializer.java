package ch.heigvd.res.handlers;

import java.io.PrintStream;

/**
 * Generic interface to serialize data
 *
 * @author Sébastien Richoz
 */
public interface ISerializer {
    /**
     * Serialize the data into a PrintStream stream
     *
     * @param data is the data to serialize
     * @param ps is the stream where to write the data
     */
    void serialize(IData data, PrintStream ps);
}
