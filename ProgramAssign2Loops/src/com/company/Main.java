/*
* Name : Tyler Jankowski
* Description : Reading player name and score
* while outputting results in special format using
* while and for loops.
* Date : 9-22-18
*
 */


package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // init variables
	    String playerName;
	    String score;
	    int length = 30;
	    int inputLength = 0;
	    String yesOrNo = "";
        Scanner scanner = new Scanner(System.in);

        // Testing if user wants to enter scores
        System.out.println("Would you like to enter the scores?");
        yesOrNo = scanner.nextLine();

        if (yesOrNo.toLowerCase().equals("yes")) {

            // init values to be tested
            System.out.println("Please enter player name : ");
            playerName = scanner.nextLine();

            // while loop
            while (!playerName.equals("-1")) {
                System.out.println("Enter player's score : ");
                score = scanner.next();

                // used for configuring output format
                length = 30;
                inputLength = playerName.length() + score.length();
                length -= inputLength;

                // Debugging
                // System.out.println(length);
                // System.out.println(inputLength);

                // formatting output
                System.out.print(playerName);
                for (int i = 0; i <= length; i++) {
                    System.out.print(".");
                }

                System.out.print(score);

                System.out.println();
                System.out.println();

                // Test for next player or -1 to end
                System.out.println("Please enter player name : ");
                playerName = scanner.next();

            }
        } else if (yesOrNo.toLowerCase().equals("no")) {
            System.out.println("ending program...");
        }
    }
}
