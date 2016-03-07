package ch.heigvd.res.handlers;

import java.io.PrintStream;

/**
 * Created by sebri on 07.03.2016.
 */

public class CsvSerializer implements ISerializer {

    @Override
    public void serialize(IData data, PrintStream ps) {
        Object[] values = data.getData();
        String csv = "";

        for(Object o : values)
            csv += o + ",";
        csv = csv.substring(0, csv.length()-1);

        ps.println(csv);
    }
}
