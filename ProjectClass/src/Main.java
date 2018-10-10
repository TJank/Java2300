/**
 * Created By : Tyler Jankowski
 * Date : 10-08-18
 * Description : Creating and using a custom class for an RPG style game
 *                  while using the custom class in the main.java class.
 * Edited :
 */

public class Main {

    public static void main(String[] args) {

        String[] goods = {"Axe","Sword","Boots","Gauntlets","Shield","Spear"};
        // Creating a new object of my RandomMerchant.java class using the constructor
        RandomMerchant armory = new RandomMerchant("Armory", 10000, goods);
        // getting a view of the armory's inventory
        System.out.println(armory.getInventory());
        // using service method 1 to buy an item from the store
        armory.buyFromMerchant("Axe", 200);
        // using service method 2 to buy an item from the store, however
        // this sore doesn't have sufficient funds
        armory.sellToMerchant("Magical Sword", 15000);
        // using setter with check for bad data
        armory.setStoreMoney(-30000);
        // showing results
        System.out.println(armory.getStoreMoney());
        // using setter to set new amount to merchant's total money
        armory.setStoreMoney(20000);
        // re-selling the overpriced sword
        armory.sellToMerchant("Magical Sword", 15000);
        // using getter to show merchant's money has been subtracted
        System.out.println("The " + armory.getStoreName() + " has " + armory.getStoreMoney() + " funds left over.");
        // using getter to show updated inventory
        System.out.println(armory.getInventory());


        // using default constructor to init a new object of RandomMerchant
        RandomMerchant streetSide = new RandomMerchant();
        // buying a item from the merchant
        streetSide.buyFromMerchant("Health Potion", 50);
        // selling an item to the merchant
        streetSide.sellToMerchant("Shirt", 5);
        // using the overridden toString method
        System.out.println(streetSide.toString());

    }
}
