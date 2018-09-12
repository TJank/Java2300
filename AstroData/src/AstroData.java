/*  Java
 * Name: Tyler Jankowski
 * Created: 09-05-2018
 * Edit Date: 09-05-2018 -- Add time to travel formula
 */
public class AstroData {
    public static void main(String[] args) {

        // Data
        final int SPEEDOFLIGHT = 186287;
        long distance = 93000000;
        char c = 'c';
        double timeToTravel;

        // Operations
        timeToTravel = distance / SPEEDOFLIGHT;
        double timeInMin = timeToTravel / 60;
        // Output

        System.out.println("It takes " + timeToTravel + " seconds, or " + timeInMin + " minutes, to get to the Sun from Earth, traveling at "
                + SPEEDOFLIGHT + " miles per second.");

        // System.out.println("The symbol for the speed of light is \"" + c + ".\" Its speed is " + SPEEDOFLIGHT
        // 	+ " miles per second. Distance to the Sun from the Earth is " + distance + " miles.");
    }
}
