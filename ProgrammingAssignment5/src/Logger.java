import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Logger is an interface that
 * encapsulates
 * @author Tyler Jankowski
 * Created: 11-07-18
 *
 */

public interface Logger {

    /**
     * logProperty takes House object as input to be written to log file.
     * @param aHouse an instance of a house object
     */
    static void logProperty(House aHouse) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("propertyLog",false);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(aHouse);
            objectOutputStream.close();
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("File not found...");
        }
        catch (IOException ioe) {
            System.out.println("IOE Exception : \n" + ioe.getMessage());
        }
    }
}
