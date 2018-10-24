import java.util.ArrayList;
import java.util.Arrays;

public class SpaceShuttle {

    private ArrayList<Astronaut> astronauts;
    private Supply[][] supplies;

    public SpaceShuttle(ArrayList<Astronaut> astronauts, Supply[][] supplies) {
        this.astronauts = new ArrayList<Astronaut>();
        setAstronauts(astronauts);
        setSupplies(supplies);
    }

    public void setAstronauts(ArrayList<Astronaut> astronauts) {
        for(Astronaut currentNaut : astronauts) {
            this.astronauts.add(currentNaut);
        }

        // this.astronauts.addAll(astronauts);
    }

    public void setSupplies(Supply[][] supplies) {
        this.supplies = new Supply[supplies.length][];
        for(int i=0; i<supplies.length; i++) {
            this.supplies[i] = new Supply[supplies[i].length];
        }

        for(int i=0; i<supplies.length; i++) {
            for(int j=0; j<supplies[i].length; j++) {
                this.supplies[i][j] = supplies[i][j];
            }

        }
    }

    @Override
    public String toString() {
        String retString = "Astronauts : \n";
        for(Astronaut currentAstronaut : this.astronauts) {
            retString += currentAstronaut.toString() + "\n";
        }

        retString += "Supplies : \n";
        for(int i=0; i<this.supplies.length; i++) {
            for(int j=0; j<this.supplies[i].length; j++) {
                retString += this.supplies[i][j].toString() + "\n";
            }
        }

        return retString;

    }

    public double getAverageAge() {
        int totalNauts = this.astronauts.size();
        double ageTotal =0;

        for(Astronaut currentNaut : this.astronauts) {
            ageTotal += currentNaut.getAge();
        }

        return ageTotal/totalNauts;
    }

    public double getTotalWeight() {
        double totalWeight = 0;

        for(int i=0; i<this.supplies.length; i++) {

            for(int j=0; j<this.supplies[i].length; j++) {
                totalWeight += this.supplies[i][j].getWeight();
            }

        }

        return totalWeight;

    }

}
