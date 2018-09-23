import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class StudentKiosk {

    public static void main(String[] args) {


        String greeting = "Hello";
        String studentName = new String();
        Scanner scan = new Scanner(System.in);
        int year;
        double divResult;
        Random rand = new Random();
        DecimalFormat divResultPattern = new DecimalFormat("0.0");

        // Business rules section
        System.out.print("Please type your first and last name: >");
        studentName = scan.nextLine();

        System.out.println();
        System.out.println(greeting + " " + studentName);

        System.out.println();
        System.out.println("Please type your 4-digit year of birth: >");
        year = scan.nextInt();

        int randomNumber = rand.nextInt(9) + 1;
        divResult = (double) year / randomNumber;

        String divResultString = divResultPattern.format(divResult);

        String nameSubstring = studentName.substring(1,4);


        System.out.println("Your temporary password is " + divResultString + nameSubstring);


    }
}
