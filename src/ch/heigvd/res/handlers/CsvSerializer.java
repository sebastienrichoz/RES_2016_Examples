package ch.heigvd.res.handlers;

import java.io.PrintStream;

/**
 * This is a CSV serializer class which offers the user
 * to serialize an IData object into a PrintStream stream.
 *
 * @author Sébastien Richoz
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
