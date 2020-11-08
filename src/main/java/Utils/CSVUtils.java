package Utils;
import java.io.IOException;
import java.io.Writer;
import java.util.List;


public class CSVUtils {
    //(1)
    private static final char separator = ',';

    //(2)
    public static void writeLine(Writer w, List<String> values) throws IOException {
        boolean first = true;

        StringBuilder sb = new StringBuilder();

        //(3)
        for (String value : values) {
            if (!first) {
                sb.append(separator);
            }
            sb.append(value);
            first = false;
        }
        sb.append("\n");

        //(4)
        w.append(sb.toString());
    }



}