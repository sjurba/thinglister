import java.io.*;

public class FileParser {

    private final LineHandler handler;

    public FileParser(LineHandler handler) {
        this.handler = handler;
    }

    public void parseFile(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(";");
                handler.handleLine(split);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
