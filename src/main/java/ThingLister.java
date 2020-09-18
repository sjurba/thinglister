public class ThingLister {


    public void parseThings(String filename) throws Exception {
        ThingsHandler handler = new ThingsHandler()
            .register("dogs", new DogHandler())
            .register("people", new PeopleHandler());
        FileParser parser = new FileParser(handler);
        parser.parseFile(filename);
    }

    public static void main(String[] args) throws Exception {
        new ThingLister().run("src/main/resources/things.csv");
    }
}
