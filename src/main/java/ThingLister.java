import java.io.*;

public class ThingLister {


    public void run(String filename) throws Exception {
        var reader = new BufferedReader(new FileReader(filename));
        String line;
        while((line = reader.readLine())!= null) {
            var split = line.split(";");
            String type = split[0];
            String file = split[1];
            switch (type) {
                case "dogs":
                    parseDogs("src/main/resources/" + file);
                    break;
                case "people":
                    parsePeople("src/main/resources/" + file);
                    break;
            }
        }
    }

    private void parseDogs(String filename) throws Exception {
        DogHandler handler = new DogHandler();
        FileParser parser = new FileParser(handler);
        parser.parseFile(filename);
    }

    private void parsePeople(String filename) throws Exception {
        PeopleHandler handler = new PeopleHandler();
        FileParser parser = new FileParser(handler);
        parser.parseFile(filename);
    }

    public static void main(String[] args) throws Exception {
        new ThingLister().run("src/main/resources/things.csv");
    }
}
