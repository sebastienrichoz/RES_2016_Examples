package ch.heigvd.res.handlers;

import ch.heigvd.res.io.BufferedIOBenchmark;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sebri on 07.03.2016.
 */

public class MyExperimentData implements IData {
    private Map<Integer, String> values = new HashMap<>();

    public MyExperimentData(String ... parameters) {
        for(int i = 0 ; i < parameters.length ; ++i)
            values.put(i, parameters[i]);
    }

    public Object[] getData() {
        return values.values().toArray();
    }
}
