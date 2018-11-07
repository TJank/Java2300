/**
 * ProperyItem is an abstract class that
 * encapsulates data for a rental property item
 * @author Tyler Jankowski
 * Created: 11-07-18
 *
 */

abstract class PropertyItem implements Logger {

    private int numRooms;
    protected boolean occupied;
    protected boolean needsCleaning;

    public PropertyItem() {
        this.numRooms = 1;
        this.occupied = false;
    }

    public PropertyItem(int numRooms, boolean available) {
        setNumRooms(numRooms);
        this.occupied = available;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        if (numRooms > 0) {
            this.numRooms = numRooms;
        }
    }

    public boolean isAvailable() {
        return occupied;
    }

    public void setAvailable(boolean available) {
        this.occupied = available;
    }

    @Override
    public String toString() {
        return "PropertyItem{" +
                "numRooms=" + numRooms +
                ", occupied=" + occupied +
                ", needsCleaning=" + needsCleaning +
                '}';
    }

    public abstract void requestCleaning();

}
