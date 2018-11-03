public class House extends PropertyItem {

    private int numBathrooms;

    public House() {
        super();
    }

    public House(int numRooms, boolean available, int numBathrooms) {
        super(numRooms, available);
        setNumBathrooms(numBathrooms);
    }

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(int numBathrooms) {
        if (numBathrooms > 0) {
            this.numBathrooms = numBathrooms;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "numBathrooms = " + this.numBathrooms;
    }

    @Override
    public void requestCleaning() {
        if(this.occupied == false) {
            this.needsCleaning = true;
            System.out.println("Cleaning request sent.");
        }
    }
}
