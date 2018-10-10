/**
 * Created By : Tyler Jankowski
 * Date : 10-08-18
 * Description : Custom class for an RPG style game
 *               while using the this class and methods in the main.java class.
 * Edited :
 */

import java.util.Arrays;

public class RandomMerchant {

    private String storeName;
    private int storeMoney;
    private String[] inventory;

    public RandomMerchant() {
        this.storeName = "Street Vendor";
        this.storeMoney = 1000;
        this.inventory = new String[]{"Sword", "Axe", "Spear", "Chicken legs", "Veggie mix", "Health Potion", "Invisibility Potion"};
    }

    /**
     *
     * @param storeName - string passed as the store / merchant's name
     * @param storeMoney - int passed resembling the total money the store has
     * @param inventory - array passed of items acting as the store's inventory
     */
    public RandomMerchant(String storeName, int storeMoney, String[] inventory) {
        this.storeName = storeName;
        this.storeMoney = storeMoney;
        this.inventory = new String[inventory.length];
        for(int i=0; i<inventory.length; i++) {
            this.inventory[i] = inventory[i];
        }
    }

    // SERVICE METHOD 1
    // @Param String item is the name of an item the user wants to sell
    // @Param String price is the price of the item the user wants to sell
    public void sellToMerchant(String item, int price) {
        String[] tempArray = Arrays.copyOf(this.inventory, this.inventory.length);
        if (price > this.storeMoney) {
            System.out.println("Sorry your item is to expensive for this shop.");
        } else {
            this.storeMoney -= price;
            this.inventory = Arrays.copyOf(tempArray, tempArray.length + 1);
            this.inventory[this.inventory.length-1] = item;
            System.out.println("The merchant handed you " + price + " gold in exchange for your " + item);
        }
    }

    // SERVICE METHOD 2
    // @Param String item is the name of an item the user wants to buy
    // @Param String price is the price of the item the user wants to buy
    public void buyFromMerchant(String item, int price) {
        if(price > 0 && isInInventory(item)) {
            int index = findIndex(item);
            this.storeMoney += price;
            this.inventory[index] = "SOLD";
            System.out.println("You bought " + item + " for " + price + " gold coins.");
        }
    }

    // SERVICE METHOD for buyFromMerchant
    // @Param String item the name of the item the user wants to buy
    private int findIndex(String item) {
        int k = -1;
        for(int i=0; i<this.inventory.length; i++) {
            if(this.inventory[i].equalsIgnoreCase(item)) {
                k = i;
            }
        }
        return k;
    }

    // SERVICE METHOD for buyFromMerchant
    // @Param String item the name of the item the user wants to buy
    private boolean isInInventory(String item) {
        boolean inInventory;
        for(int i=0; i<this.inventory.length; i++) {
            if(this.inventory[i].equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    // override the toString method
    public String toString() {
        return "RandomMerchant{" +
                "storeName='" + storeName + '\'' +
                ", storeMoney=" + storeMoney +
                ", inventory=" + Arrays.toString(inventory) +
                '}';
    }

    // @return returns the name of the store / merchant
    public String getStoreName() {
        return storeName;
    }

    // @Param String storeName is used to set a new name for the store
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    // @return returns the amount of money the store / merchant
    public int getStoreMoney() {
        return storeMoney;
    }

    // @Param int storeMoney used to set a new value to amount of money the store has
    public void setStoreMoney(int storeMoney) {
        if(storeMoney >=0) {
            this.storeMoney = storeMoney;
        }
    }

    // @return returns the inventory of the store / merchant as a single string
    public String getInventory() {
        String returnStr = "";
        for(int i =0; i<this.inventory.length; i++) {
            returnStr = returnStr + " " + this.inventory[i];
        }
        return returnStr;
        // return Arrays.toString(this.inventory);
    }

    // @Param String[] inventory used to set a new inventory to store
    public void setInventory(String[] inventory) {
        if(inventory.length >1) {
            this.inventory = inventory;
        }
    }
}
