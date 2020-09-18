import java.util.*;

public class ThingsHandler implements LineHandler{

    private final Map<String, LineHandler> handlers = new HashMap<>();

    @Override
    public void handleLine(String[] split) {
        String type = split[0];
        String file = split[1];
        FileParser parser = new FileParser(handlers.get(type));
        parser.parseFile("src/main/resources/" + file);
    }

    public ThingsHandler register(String type, LineHandler handler){
        handlers.put(type, handler);
        return this;
    }


}
