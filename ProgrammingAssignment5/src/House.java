/**
 * House is an abstract class that
 * encapsulates data acting as a house
 * @author Tyler Jankowski
 * Created: 11-07-18
 *
 */

public class House extends PropertyItem implements Logger {

    // variable
    private int numBathrooms;

    /**
     * Default constructor
     */
    public House() {
        super();
        setNumBathrooms(1);
    }

    /**
     * Overloaded constructor
     * @param numRooms number of rooms in the house
     * @param occupied is the house occupied
     * @param numBathrooms number of bathrooms in the house
     */
    public House(int numRooms, boolean occupied, int numBathrooms) {
        super(numRooms, occupied);
        setNumBathrooms(numBathrooms);
    }

    /**
     * Accessor for numBathrooms
     * @return the number of bathrooms
     */
    public int getNumBathrooms() {
        return numBathrooms;
    }

    /**
     * Mutator method
     * @param numBathrooms accepts int acting as number of bathrooms
     */
    public void setNumBathrooms(int numBathrooms) {
        if (numBathrooms > 0) {
            this.numBathrooms = numBathrooms;
        }
    }

    /**
     * toString
     * @return String of all details of the house object
     */
    @Override
    public String toString() {
        return super.toString() + ", numBathrooms = " + this.numBathrooms;
    }

    /**
     * requestCleaning()
     * overriding abstract method
     * used to put in a cleaning ticket for the specific item.
     */
    @Override
    public void requestCleaning() {
        if(this.occupied == false) {
            this.needsCleaning = true;
            System.out.println("Cleaning request sent.");
        }
    }
}
