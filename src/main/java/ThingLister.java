public class ThingLister {


    public void run(String filename) throws Exception {
        ThingsHandler handler = new ThingsHandler();
        FileParser parser = new FileParser(handler);
        parser.parseFile(filename);
    }

    public static void main(String[] args) throws Exception {
        new ThingLister().run("src/main/resources/things.csv");
    }
}
