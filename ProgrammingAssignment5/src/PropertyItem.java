abstract class PropertyItem {

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
        return "numRooms = " + numRooms +
                ", occupied = " + occupied;
    }

    public abstract void requestCleaning();

}
