package ch.heigvd.res.handlers;

import java.util.HashMap;
import java.util.Map;

/**
 * This class gives the user the ability to store some data
 *
 * @author Sébastien Richoz
 */
public class MyExperimentData implements IData {
    private Map<Integer, String> values = new HashMap<>();

    /**
     * Store data by passing it directly to the constructor.
     *
     * @param parameters are the data to store. The order counts.
     */
    public MyExperimentData(String ... parameters) {
        for(int i = 0 ; i < parameters.length ; ++i)
            values.put(i, parameters[i]);
    }

    /**
     * Get the data stored.
     *
     * @return a table of objects. The objects are the data.
     */
    public Object[] getData() {
        return values.values().toArray();
    }
}
