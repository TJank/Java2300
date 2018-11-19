import java.io.*;

/**
 * Client class that will use the other classes, and interface.
 * @author Tyler Jankowski
 * Created: 11-07-18
 *
 */

public class Client {

    public static void main(String[] args) {
        // Init objects
        House house = new House(4,false, 2);

        // use the System.out.println() to call the toString() method of your subclass on your object
        System.out.println("House : " + house.toString());

        // call your logProperty() method on your object so it creates a file with the object saved to it
        Logger.logProperty(house);

        // Reading from the object file propertyLog
        try {
            FileInputStream fileInputStream = new FileInputStream("propertyLog");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            try {
                while (true) {
                    House temp = (House) objectInputStream.readObject();
                    System.out.println(temp.toString());
                }
            }
            catch (EOFException eofe) {
                System.out.println("End of file.");
            }
            catch (ClassNotFoundException cnfe) {
                System.out.println(cnfe.getMessage());
            }
            finally {
                System.out.println("Closing file.");
                objectInputStream.close();
            }

        }
        catch (FileNotFoundException fnfe) {
            System.out.println("File not found...");
        }
        catch (IOException ioe) {
            System.out.println("IOE : " + ioe.getMessage());
        }


    }
}
