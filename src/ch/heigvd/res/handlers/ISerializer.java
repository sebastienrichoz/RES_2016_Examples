package ch.heigvd.res.handlers;

import java.io.PrintStream;

/**
 * Created by sebri on 07.03.2016.
 */
public interface ISerializer {
    void serialize(IData data, PrintStream ps);
}
