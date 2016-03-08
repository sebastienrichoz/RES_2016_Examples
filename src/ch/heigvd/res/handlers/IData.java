package ch.heigvd.res.handlers;

/**
 * Generic interface to store data
 *
 * @author Sébastien Richoz
 */
public interface IData {
    /**
     * Get the data stored in a IData object
     * @return a table of objects.
     */
    Object[] getData();
}
