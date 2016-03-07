package ch.heigvd.res.handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by sebri on 07.03.2016.
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

    @Override
    public void init() {
        this.outputFile = new File(this.filename);
        try {
            this.printStream = new PrintStream(this.outputFile);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void close() {
        this.printStream.close();
    }

    @Override
    public void record(IData data) {
        serializer.serialize(data, printStream);
    }
}
