/**
 * NAME : Tyler Jankowski
 * DATE : 10-22-18
 * DESCRIPTION : Passanger class acting as a passanger with a name
 * and class status to be used in the train class.
 */

public class Passenger {
    private String name;
    private int classStatus;

    /**
     * CONSTRUCTOR
     * @param name - name of the passenger
     * @param classStatus - class status of the passenger
     */
    public Passenger(String name, int classStatus) {
        this.name = name;
        this.classStatus = classStatus;
    }

    /**
     * getNAME method
     * @return this.name - returns the name of the current passenger
     */
    public String getName() {
        return name;
    }

    /**
     * setNAME
     * @param name - sets a new name to the passenger object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getCLASSSTATUS gets the class status
     * @return this.classStatus - returns current passenger class status
     */
    public int getClassStatus() {
        return classStatus;
    }

    /**
     * setCLASSSTATUS - sets class status
     * @param classStatus - int of the class status 1 or 2
     */
    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    /**
     * toSTRING method
     * @return builds a return string of the name and class status of current passenger object.
     */
    public String toString() {
        return "name= '" + name + '\'' + "\t" +
                "classStatus= " + classStatus;
    }
}
