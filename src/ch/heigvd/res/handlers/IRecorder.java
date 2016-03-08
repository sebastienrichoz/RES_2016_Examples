package ch.heigvd.res.handlers;

/**
 * Generic interface to record some data
 *
 * @author Sébastien Richoz
 */
public interface IRecorder {
    /**
     * Record some data
     * @param data is the data to record
     */
    void record(IData data);

    /**
     * initiate the recorder to record in it.
     */
    void init();

    /**
     * close the recorder. You can't record in it anymore.
     */
    void close();
}
