package ch.heigvd.res.handlers;

/**
 * Created by sebri on 07.03.2016.
 */
public interface IRecorder {
    void record(IData data);
    void init();
    void close();
}
