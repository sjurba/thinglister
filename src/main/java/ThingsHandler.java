import java.io.File;
import java.util.*;

public class ThingsHandler implements LineHandler{

    private final File folder;
    private final Map<String, LineHandler> handlers = new HashMap<>();

    public ThingsHandler(File folder) {
        this.folder = folder;
    }

    @Override
    public void handleLine(String[] split) {
        String type = split[0];
        String file = split[1];
        FileParser parser = new FileParser(handlers.get(type));
        parser.parseFile(new File(folder, file));
    }

    public ThingsHandler register(String type, LineHandler handler){
        handlers.put(type, handler);
        return this;
    }


}
