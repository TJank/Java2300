/**
 * ProperyItem is an abstract class that
 * encapsulates data for a rental property item
 * @author Tyler Jankowski
 * Created: 11-07-18
 *
 */
import java.io.Serializable;

abstract class PropertyItem implements Serializable {

    // variables
    private int numRooms;
    protected boolean occupied;
    protected boolean needsCleaning;

    /**
     * Default constuctor
     */
    public PropertyItem() {
        setNumRooms(1);
        setOccupied(false);
    }

    /**
     * Overloaded Constructor
     * @param numRooms int acting as number of rooms
     * @param occupied boolean if the property is occupied or not
     */
    public PropertyItem(int numRooms, boolean occupied) {
        setNumRooms(numRooms);
        setOccupied(occupied);
    }

    /**
     * Accessor Method
     * @return int of number of rooms
     */
    public int getNumRooms() {
        return numRooms;
    }

    /**
     * Mutator method
     * @param numRooms
     */
    public void setNumRooms(int numRooms) {
        if (numRooms > 0) {
            this.numRooms = numRooms;
        }
    }

    /**
     * Accessor Method
     * @return
     */
    public boolean isOccupied() {
        return occupied;
    }

    /**
     * Mutator method
     * @param available boolean if the property item is available or not
     */
    public void setOccupied(boolean available) {
        this.occupied = available;
    }

    /**
     * toString()
     * @return String containing all details about the property item
     */
    @Override
    public String toString() {
        return "numRooms = " + numRooms +
                ", occupied = " + occupied +
                ", needsCleaning = " + needsCleaning;
    }

    /**
     * Abstract method - implementation in child classes.
     */
    public abstract void requestCleaning();

}
