/**
 * MessageMain is utilizing the ErrorWriter.
 * @author Tyler Jankowski
 * Date: 11-07-18
 *
 */

public class MessageMain implements FileReader {

    public static void main(String[] args) {
        ErrorWriter ew = new ErrorWriter("Too many password attempts.", 21);

        ew.writeMessage();

        // read from the file
        FileReader.readFile("errorLog");







    }
}
