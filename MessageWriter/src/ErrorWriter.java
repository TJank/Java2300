import java.io.*;

/**
 * ErrorWriter is an abstract class that
 * encapsulates any message writing class
 * @author Tyler Jankowski
 * Created: 11-07-18
 */

public class ErrorWriter extends MessageWriter {

    // Instance Variables
    private int errorCode;

    /**
     * Default constructor
     */
    public ErrorWriter() {
        super();
        errorCode = 0;
    }

    /**
     * Overloaded Constructor
     * @param message about the error
     * @param errorCode to be attached to the message
     */
    public ErrorWriter(String message, int errorCode) {
        super(message);
        setErrorCode(errorCode);
    }

    /**
     * Accessor Method
     * @return the error code
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Mutator Method
     * @param errorCode
     */
    public void setErrorCode(int errorCode) {
        if(errorCode >= 0)
            this.errorCode = errorCode;
    }

    /**
     * toString
     * @return String with the error message and code
     */
    @Override
    public String toString() {
        return "ErrorWriter{ " + super.toString() +
                "errorCode = " + errorCode +
                '}';
    }

    /**
     * Implementing abstract method to write messages to a file
     * as objects.
     * This method writes current object (this) to a file as an object.
     */
    @Override
    public void writeMessage() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("errorLog");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found");
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
