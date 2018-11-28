public class RecursionMain {

    public static void main(String[] args) {
        // recursion 1
        walk(10);
        System.out.println();

        // recursion 2
        int x = 4;
        System.out.println("The number of pins in " + x + " rows is " + triangle(x));

        // recursion 3
        System.out.println();
        System.out.println("The number in the 10th position of the Fibonacci " +
                "sequence is " + fibonacci(10));

        System.out.println();
        System.out.println("Sum of digits = " + sumOfDigits(1000001));

    }


    public static void walk(int feet) {
        if(feet<=0) {
            System.out.println("You are at your destination.");
        }
        else {
            System.out.println("Still " + (feet-1) + " feet to walk.");
            walk(feet-1);
        }
    }

    public static int triangle(int number) {
        if(number == 1) {
            return 1;
        }
        else {
            return number + triangle(number - 1);
        }
    }

    public static int fibonacci(int n) {
        if(n==1) {
            return 1;
        } else if (n==2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int sumOfDigits(int number) {
        if(number >= 0 && number < 10) {
            return number;
        }
        else {
            return (number % 10) + sumOfDigits((number/10));
        }
    }

}
