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
	    String playerName;
	    String score;
	    int length = 30;
	    int inputLength = 0;
	    final String SENTINEL = "-1";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter player name : ");
        playerName = scanner.nextLine();

        while (! playerName.equals("-1")) {
            System.out.println("Enter player's score : ");
            score = scanner.next();

            length = 30;
            inputLength = playerName.length() + score.length();
            length -= inputLength;

            // Debugging
            // System.out.println(length);
            // System.out.println(inputLength);

            System.out.print(playerName);
            for (int i = 0; i <= length; i++ ) {
                System.out.print(".");
            }

            System.out.print(score);

            System.out.println();
            System.out.println();

            System.out.println("Please enter player name : ");
            playerName = scanner.next();

        }
    }
}
