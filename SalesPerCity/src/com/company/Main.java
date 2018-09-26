/*
* Description : Take user input, if they want to read from
* sales.txt file then read the data from that file and output
* the data in a special format.
*
* Name : Tyler Jankowski
* Date : 9-26-18
*
*
 */
package com.company;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        File inputFile = new File("sales.txt");
        String userInputFile;
        int outputLength = 40;
        String fileLine;
        String cityName;
        String salesData;
        int indx;
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(inputFile);

        System.out.println("Please enter a file name for reading, or q to quit. :");
        userInputFile = scan.next();

        if (userInputFile.toLowerCase().equals("q")) {
            System.out.println("ending program...");
        } else {
            while (!userInputFile.equals("sales.txt")) {
                System.out.println("Please enter a file name for reading, or q to quit. :");
                userInputFile = scan.next();
            }
        }

        while (userInputFile.equals("sales.txt") && scanner.hasNext()) {
            fileLine = scanner.nextLine();
            indx = fileLine.indexOf(":");
            cityName = fileLine.substring(0, indx);
            salesData = fileLine.substring(indx+1);
            //System.out.println("INDEX== " + indx + " CITYNAME== " + cityName + " SALESDATA== " + salesData);

            outputLength = 40;
            outputLength = outputLength - cityName.length() - salesData.length();

            System.out.print(cityName);
            for (int i = 0; i < outputLength; i++ ) {
                System.out.print("*");
            }
            System.out.print(salesData + "\n");

        }

    }
}
