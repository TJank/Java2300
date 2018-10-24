/**
 * NAME : Tyler Jankowski
 * DATE : 10-22-18
 * DESCRIPTION : TRAIN class to be used in the client class
 * Uses passenger class to build a list of passengers and do things with the passenger
 * data types
 */

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Train {

    private ArrayList<Passenger> passengers;
    private DecimalFormat percentPattern = new DecimalFormat("0.00%");

    /**
     * CONSTRUCTOR :
     * @param arrayList - an array list of passenger objects to be used with the
     *                  mutator method to set the passengers array list
     */
    public Train(ArrayList<Passenger> arrayList) {
        this.passengers = new ArrayList<Passenger>();
        addPassengers(arrayList);
    }

    /**
     * MUTATOR METHOD FOR CONSTRUCTOR
     * @param arrayList - passed form constructor used to build the this.passenger array list
     */
    private void addPassengers(ArrayList<Passenger> arrayList) {
        this.passengers.addAll(arrayList);
//        String name;
//        String status;
//        for(Passenger currentPass : arrayList) {
//            name = currentPass.getName();
//            status = currentPass.getClassStatus();
//            // System.out.println("INSIDE ADDPASSENGERS MUTATOR \n" +
//                    // "NAME = " + name + " STATUS = " + status);
//            Passenger newPass = new Passenger(name, status);
//            // System.out.println(newPass.toString());
//            this.passengers.add(newPass);
//        }
    }

    @Override
    /**
     * toSTRING method
     * @return String result - builds a result string and calls the toString method of
     * passenger objects.
     */
    public String toString() {
        String result = "";
        for(Passenger currentPassenger : this.passengers) {
            result += currentPassenger.toString() + "\n";
        }
        return result;
    }

    /**
     * passengersInFirstClass - to get the percent of passengers in first class
     * @return a decimalformatted string that is the percent of passengers in first class
     */
    public String passengersInFirstClass() {
        double firstClass = 0;
        int numOfPassengers = this.passengers.size();
        for(Passenger currentPassenger : this.passengers) {
            int currentPassStatus = currentPassenger.getClassStatus();
            // numOfPassengers++;
            if (currentPassStatus == 1) {
                firstClass++;
            }
        }
        double num = firstClass / numOfPassengers;
        return percentPattern.format(num);
    }

}
