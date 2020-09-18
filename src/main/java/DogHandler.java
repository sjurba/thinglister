public class DogHandler implements LineHandler {
    @Override
    public void handleLine(String[] split) {
        if (split.length == 2) {
            System.out.println(split[0] + " is " + split[1] + "'s dog");
        } else if(split.length == 1) {
            System.out.println(split[0] + " is a stray dog");
        }
    }
}
