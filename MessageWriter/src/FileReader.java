import java.io.*;

/**
 * FileReader is a class that reads from files.
 * @author Tyler Jankowski
 * Created: 11-7-18
 * Edited:
 */

public interface FileReader {

    /**
     * readFile method reads objects from files
     */
    static void readFile(String fileName) {

        try {

            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            try {
                while (true) {
                    Object object = objectInputStream.readObject();
                    System.out.println(object.toString());
                }
            }
            catch (EOFException eofe) {
                System.out.println("End of file reached");
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
            System.out.println("File not found" +
            fnfe.getMessage());
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }


}

