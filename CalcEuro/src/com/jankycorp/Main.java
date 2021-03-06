/*
* Main Class of currency converter application
* Author: Tyler Jankowski
* Written: 9-12-18
* Edit:
* Comments:
 */

package com.jankycorp;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        // Data Section
        final  float EXCHANGE_RATE_EURO = 1.16F;
        float dollarAmount;
        float euroAmount;
        String input;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dollarPatter = new DecimalFormat("0.00");

        // Business Rules
        System.out.println("Please enter a US dollar amount: >");
        input = scanner.nextLine();

        dollarAmount = Float.parseFloat(input);
        euroAmount = dollarAmount / EXCHANGE_RATE_EURO;

        // Find the difference between the dollar amount and the euro.
        float difference = Math.abs(euroAmount - dollarAmount);

        // Output
        //System.out.println("Your " + dollarPatter.format(dollarAmount) + " US dollars will " +
        //        "come out to " + dollarPatter.format(euroAmount) + " Euros.");

        System.out.printf("Your %.2f US dollars will come out to %.2f Euros",
                dollarAmount,euroAmount);

        System.out.println("The difference between euros and dollars is: "
                + dollarPatter.format(difference));

    }
}
