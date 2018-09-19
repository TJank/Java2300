/*
* WhichQuarter - class that determines which quarter
* a month belongs to after a successful user login.
* Author: Peter K. Johnson, Jones and Barlett Learning
* Edits: Tyler Jankowski
* Date: 9-19-2018
 * */

import java.util.Scanner;

public class WhichQuarter {
    public static void main(String[] args) {

        // Write a program that takes two words as input from the keyboard,
        // representing a user ID and a password.

        /*** DATA SECTION ***/
        Scanner scanner = new Scanner(System.in);
        String userID;
        String password;
        String month;
        String quarter;

        /***  OPERATIONS SECTION ***/
        System.out.println("Please enter your User ID / User Name : ");
        userID = scanner.nextLine();
        System.out.println("Please enter your password :");
        password = scanner.nextLine();

        /***  OUTPUT SECTION ***/
        // Test the user input using nested if/else
        if ((userID.equals("admin")) && (password.equals("open"))) {
            System.out.println("Welcome!");
            System.out.println();
            System.out.println("==========");
            System.out.println();
            System.out.println("Please enter the current month.");
            month = scanner.nextLine();

            switch (month) {
                case "january" :
                case "february" :
                case "march" :
                    quarter = "first";
                    break;
                case "april" :
                case "may" :
                case "june" :
                    quarter = "second";
                    break;
                case "july" :
                case "august" :
                case "september" :
                    quarter = "third";
                    break;
                case "october" :
                case "november" :
                case "december" :
                    quarter = "fourth";
                    break;
                default:
                    quarter = "";

            }

            if (quarter.equals("")) {
                System.out.println("not a valid month");
            } else {
                System.out.println(month + " is in the " + quarter + " quarter.");
            }


        } else if ((userID.equals("admin")) && (!password.equals("open"))) {
            System.out.println("Wrong password.");
        } else if ((!userID.equals("admin")) && (password.equals("open"))) {
            System.out.println("Wrong user ID.");
        } else {
            System.out.println("Sorry, wrong ID and password.");
        }

    // Once the user successfully enters the application,
        // ask the user to type the current month.
        // Use the switch statement to determine, based on the month entered,
        // which quarter the months belongs to.

        /*** DATA SECTION ***/


        /***  OPERATIONS SECTION ***/
//        System.out.println();
//        System.out.println("==========");
//        System.out.println();
//        System.out.println("Please enter the current month.");
//        month = scanner.nextLine();
//
//        // Use the switch statement to determine,
//        // based on the month entered, which quarter the months belongs to.
//        switch (month) {
//            case "january" :
//            case "february" :
//            case "march" :
//                quarter = "first";
//                break;
//            case "apr" :
//            case "may" :
//            case "june" :
//                quarter = "second";
//                break;
//            case "july" :
//            case "august" :
//            case "september" :
//                quarter = "third";
//                break;
//            case "october" :
//            case "november" :
//            case "december" :
//                quarter = "fourth";
//                break;
//            default:
//                quarter = "";
//
//        }

        /***  OUTPUT SECTION ***/
        // if the month name was not valid, display a message: monthName " is not a valid month."
        // Else, display a message: monthName "is in an " x " quarter."

    }
}
