/**
 * NAME : Tyler Jankowski
 * DATE : 10-22-18
 * DESCRIPTION : Client class to use and test the train class and passenger class.
 * builds the objects and uses the class methods to do things with those classes
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        // Creating temporary ArrayList of passengers to pass in to Train() constructor
        File inputFile = new File("passengers.txt");
        Scanner file = new Scanner(inputFile);
        ArrayList<Passenger> tempPassengers = new ArrayList<Passenger>();
        String n;
        int c;
        while(file.hasNext()) {
            n = file.next();
            c = file.nextInt();

            tempPassengers.add(new Passe nger(n,c));
        }

        // declare and initialize an object of the Train class that accepts the passenger list
        Train train1 = new Train(tempPassengers);

        // In Client.java print the list of all passengers using the toString() method of your Train object.
        System.out.println(train1.toString());

        //print the percentage of the passengers traveling in the first class. For this step, use the method from the Train class
        System.out.println(train1.passengersInFirstClass());




    }

}
