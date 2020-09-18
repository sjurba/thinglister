import java.io.*;

public class FileParser {

    private final LineHandler handler;

    public FileParser(LineHandler handler) {
        this.handler = handler;
    }

    public void parseFile(String filename) {
        try {
            File file = new File(filename);
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
