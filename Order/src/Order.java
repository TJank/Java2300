import java.util.Arrays;

/**
 * Order class prepares orders to send to a database
 * Author: Tyler Jankowski
 * Created: 10-10-2018
 */

public class Order {

    /**
     * Instance Variables
     */
    private int orderID;
    public final int ARRAY_SIZE = 10;
    private String[] items;
    private int[] quantities;
    private double[] prices;



    // Default constructor
    public Order() {
        this.orderID = 0;
        this.items = new String[ARRAY_SIZE];
        this.quantities = new int[ARRAY_SIZE];
        this.prices = new double[ARRAY_SIZE];

    }

    /**
     * OVERLOADED CONSTRUCTOR
     * @param orderID - keep track of orders by a unique ID
     * @param items - array of cleaning items
     * @param quantities - number of items
     * @param prices - prices of the items
     */
    public Order(int orderID, String[] items, int[] quantities, double[] prices) {
        this.orderID = orderID;
        this.items = new String[items.length];
        for (int i=0; i <items.length; i++) {
            this.items[i] = items[i];
        }
        this.quantities = new int[quantities.length];
        for(int i=0; i<quantities.length; i++) {
            this.quantities[i] = quantities[i];
        }
        this.prices = new double[prices.length];
        for(int i=0; i<prices.length; i++) {
            this.prices[i] = prices[i];
        }
    }

    @Override
    /**
     * toString()
     */
    public String toString() {
        String orderDetails = "OrderID: " + orderID + "\n";
        orderDetails += "Items: ";
        for(int i=0; i<this.items.length; i++) {
            orderDetails += this.items[i] + "\t";
        }
        orderDetails += "\n" + "Quantities: ";
        for(int i=0; i<this.quantities.length; i++) {
            orderDetails += this.quantities[i] + "\t";
        }
        orderDetails += "\n" + "Prices: ";
        for(int i=0; i<this.prices.length; i++) {
            orderDetails += this.prices[i] + "\t";
        }
        return orderDetails;
    }

    /**
     * Accessor method
     * @return orderID
     */
    public int getOrderID() {
        return this.orderID;
    }

    /**
     * accessor method for items array
     * @return String[] tempArray to protect our actual array
     */
    public String[] getItems() {
        String[] tempArray = new String[this.items.length];
        for(int i=0; i<this.items.length; i++) {
            tempArray[i] = this.items[i];
        }
        return tempArray;
    }

    /**
     * mutator method for items array
     */
    public void setItems(String[] items) {
        if(items.length == this.items.length) {
            for (int i = 0; i < items.length; i++) {
                this.items[i] = items[i];
            }
        } else {
            this.items = new String[items.length];
            for (int i = 0; i < items.length; i++) {
                this.items[i] = items[i];
            }
        }
    }

    /**
     * Service method for returning total price for each item
     * @param index - item's index from the item array
     * @return total - price for items * quantity
     */
    public double totalPerItem(int index) {
        double total;
        total = this.quantities[index] * this.prices[index];
        return total;
    }

}
