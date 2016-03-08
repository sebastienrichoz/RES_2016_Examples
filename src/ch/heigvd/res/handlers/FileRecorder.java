package ch.heigvd.res.handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * This class gives a file to record some IData into it after having it serialized.
 *
 * @author Sébastien Richoz
 */
public class FileRecorder implements IRecorder {

    private String filename;
    private File outputFile;
    private PrintStream printStream;
    private ISerializer serializer;

    public FileRecorder(String filename, ISerializer serializer) {
        this.filename = filename;
        this.serializer = serializer;
    }

    /**
     * Create the file and open the stream to write in it.
     */
    @Override
    public void init() {
        this.outputFile = new File(this.filename);
        try {
            this.printStream = new PrintStream(this.outputFile);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Close the printstream to close connection with the file.
     */
    @Override
    public void close() {
        this.printStream.close();
    }

    /**
     * Record some IData into a file after having serialized it.
     *
     * @param data is the data to record in the FileRecorder.
     *             It will be serialized with the appropriate
     *             serializer passed in the FileRecorder constructor.
     */
    @Override
    public void record(IData data) {
        serializer.serialize(data, printStream);
    }
}
