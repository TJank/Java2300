/* Name: Tyler Jankowski
 Date Created: 09-07-18

*/

// ***** 1. add your import statements here
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class PracticeMethods
{
  public static void main( String [] args )
  {
    //*****
    // 2.  a. Create a Scanner object to read from the keyboard
    //     b. Prompt the user for their first name
    //     c. Print a message that says hello to the user
    //     d. Print a message that says how many letters are in the user's name
      String name;
      int birthYear;

      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter your first name > ");
      name = scanner.next();
      scanner.nextLine();

      System.out.println("Hello, " + name);
      System.out.println("There are " + name.length() + " letters in your name!");
    
    
    //*****
    // 3.  a. Skip a line, then prompt the user for the year
    //            they were born.
    //     b. Declare a constant for the current year
    //     c. Calculate and print the age the user will be this year.
    //     d. Declare a constant for average life expectancy,
    //            set its value to 78.94.
    //     e. Calculate and print the percentage
    //            of the user's expected life they've lived.
    //        Use the DecimalFormat class to format the percentage
    //            to one decimal place
      System.out.println();
      System.out.println("What year were you born in? > ");
      birthYear = scanner.nextInt();

      final int YEAR = 2018;

      int thisYear = YEAR - birthYear;
      System.out.println("You will be " + thisYear + " this year.");

      final double LIFEEXPECTANCY = 78.94;

      DecimalFormat percentPatter = new DecimalFormat("0.0%");
      double lifeEAsDecimal = thisYear / LIFEEXPECTANCY;
      System.out.println("You have lifed " + percentPatter.format(lifeEAsDecimal) +
              " of your life!");
    
        
    //*****
    // 4.  a. Generate a secret random integer between 1 and 20
    //     b. Skip a line, then ask the user for a guess.
    //     c. Print a message telling the user the secret number
    //         and how far from the number the user's guess was
      int guessedInt;
      Random random = new Random();
      int randomNum = random.nextInt(20) +1;

      System.out.println();
      System.out.println("Guess a number between 1 & 20. > ");
      guessedInt = scanner.nextInt();

      if(guessedInt != randomNum) {
          System.out.println("You were " + (Math.abs(guessedInt-randomNum)) +
                  " numbers away! The secret number was : " + randomNum);
      } else System.out.println("You are a genius!");


  }
}