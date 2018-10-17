/*
 * WeeklyTempClient class for working with arrays of temperatures.
 * Author: Pawel Buda (Based on ex. 64, p. 515, Java Illuminated, Anderson, Franceschi)
 * Created: 10-17-2018
 * Edited:
 * */

import java.util.Random;

public class WeeklyTempClient {

    public static void main(String[] a) {

        // Create an array of seven random temperatures between -200 and 70 F (this is on Mars!)
        Random random = new Random();

        int[] tA = new int[7];

        for (int i = 0; i < tA.length; i++) {
            tA[i] = random.nextInt(70 - (-200) + 1) - 200;
        }

        // Create a WeeklyTemp object
        WeeklyTemp sevenDaysTemp = new WeeklyTemp(tA);
        System.out.print(sevenDaysTemp.toString());

        // Find out how many temps were below freezing:
        System.out.println("\n\n***");
        System.out.println("The number of temperatures below freezing was: " + sevenDaysTemp.getFreezeTemps());

        // Sort the array in an ascending order:
        System.out.println("\n\n***");
        System.out.println("The sorted temperatures are: " + sevenDaysTemp.tempToString(sevenDaysTemp.temperatureSort()));


        System.out.println("The high temperatures are: " + sevenDaysTemp.tempToString(sevenDaysTemp.getHighTemps()));
    }

}
