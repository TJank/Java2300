import java.util.ArrayList;

public class Train {

    private ArrayList<Passenger> passengers;

    public Train(ArrayList<Passenger> arrayList) {
        addPassengers(arrayList);
    }

    private void addPassengers(ArrayList<Passenger> arrayList) {
        String name;
        String status;
        for(Passenger currentPass : arrayList) {
            name = currentPass.getName();
            status = currentPass.getClassStatus();
            // System.out.println("INSIDE ADDPASSENGERS MUTATOR \n" +
                    // "NAME = " + name + " STATUS = " + status);
            Passenger newPass = new Passenger(name, status);
            // System.out.println(newPass.toString());
            this.passengers.add(newPass);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for(Passenger currentPassenger : this.passengers) {
            result += currentPassenger.toString() + "\n";
        }
        return result;
    }

    public double passengersInFirstClass() {
        int firstClass = 0;
        int numOfPassengers = 0;
        for(Passenger currentPassenger : this.passengers) {
            String currentPassStatus = currentPassenger.getClassStatus();
            numOfPassengers++;
            if (currentPassStatus == "1") {
                firstClass++;
            }
        }

        return (double) ((firstClass/numOfPassengers) * 100);
    }

}
