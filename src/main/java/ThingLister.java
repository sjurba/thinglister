import java.io.File;

public class ThingLister {


    public void parseThings(File folder) throws Exception {
        ThingsHandler handler = new ThingsHandler(folder)
            .register("dogs", new DogHandler())
            .register("people", new PeopleHandler());
        FileParser parser = new FileParser(handler);
        parser.parseFile(new File(folder, "things.csv"));
    }

    public static void main(String[] args) throws Exception {
        new ThingLister().parseThings(new File("src/main/resources"));
    }
}
