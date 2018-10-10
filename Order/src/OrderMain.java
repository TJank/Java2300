import java.util.Arrays;

/**
 * OrderMain class to utilize the Order class
 * Author: Tyler Jankowski
 * Created: 10-10-2018
 */

public class OrderMain {

    public static void main(String[] a) {
        // initialize an empty order object
        Order order1 = new Order();
        System.out.println(order1.toString());

        // Declare some arrays
        String[] itemsA = {"pants", "shirt", "dress"};
        int[] quantitiesA = {1,2,3};
        double[] pricesA = {5.50,6.25,7.00};

        Order order2 = new Order(1000, itemsA, quantitiesA, pricesA);
        System.out.println(order2);
        System.out.println(Arrays.toString(order2.getItems()));
        System.out.println("The total for " + order2.getItems()[2] + " is $" + order2.totalPerItem(2) );

    }

}
