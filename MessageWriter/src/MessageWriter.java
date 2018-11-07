import java.io.Serializable;

/**
 * MessageWriter is an abstract class that
 * encapsulates any message writing class
 * @author Tyler Jankowski
 * Date: 11-07-18
 *
 */

public abstract class MessageWriter implements Serializable {

    private String message = "";

    // DEFAULT CONSTRUCTOR
    public MessageWriter() {
        message = "No news!";
    }

    /**
     * Overloaded constructor
     * @param message to write some data to store or to console
     */
    public MessageWriter(String message) {
        setMessage(message);
    }

    /**
     * Accessor
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Mutator
     * @param message to be set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * toString
     * @return message formatted as a readable text string.
     */
    @Override
    public String toString() {
        return "MessageWriter : " +
                "message = '" + message + '\'';
    }

    public abstract void writeMessage();





}
