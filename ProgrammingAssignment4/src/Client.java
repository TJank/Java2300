import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        // Creating temporary ArrayList of passengers to pass in to Train() constructor
        File inputFile = new File("/Users/tylerjankowski/Documents/FallSemester2018/Java2300/ProgrammingAssignment4/src/passengers.txt");
        Scanner file = new Scanner(inputFile);
        ArrayList<Passenger> tempPassengers = new ArrayList<Passenger>();
        String n;
        String c;
        while(file.hasNext()) {
            n = file.next();
            System.out.println(n);
            c = file.next();
            System.out.println(c);

            tempPassengers.add(new Passenger(n,c));
        }

        // declare and initialize an object of the Train class that accepts the passenger list
        Train train1 = new Train(tempPassengers);

        // In Client.java print the list of all passengers using the toString() method of your Train object.
        System.out.println(train1.toString());




    }

}
