public class ThingsHandler implements LineHandler{
    @Override
    public void handleLine(String[] split) {
        String type = split[0];
        String file = split[1];
        switch (type) {
            case "dogs":
                parseType(file, new DogHandler());
                break;
            case "people":
                parseType(file, new PeopleHandler());
                break;
        }
    }

    private void parseType(String file, LineHandler handler) {
        FileParser parser = new FileParser(handler);
        parser.parseFile("src/main/resources/" + file);
    }


}
