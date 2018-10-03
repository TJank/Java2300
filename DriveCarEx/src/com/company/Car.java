/**
 * Tyler Jankowski
 * Car class
 * Will represent a real life car with make model year etc.
 * CREATED : 10-03-2018
 */

package com.company;

public class Car {

    private boolean manual;
    private int tires = 4;
    private String color;
    private String make;
    private String model;
    private int year;
    private double fuelLevel;
    private int milesDriven;
    private int fuleEco;


    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(boolean manual, String color, String make, String model, int year, int fuleEco) {
        this.manual = manual;
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuleEco = fuleEco;
    }

    public void addFuel(int amount) {
        if(amount > 0) {
            this.fuelLevel += amount;
        }
    }

    public void driveCar(int miles) {
        int milesCanGo =  (int) this.fuelLevel * this.fuleEco;
        double fuelConsumed = miles / this.fuleEco;

        this.milesDriven += miles;
        this.fuelLevel -= fuelConsumed;

        if(miles > milesCanGo) {
            System.out.println("You reached your destination of " + miles + " miles. However you ran out of gas..");
        } else if (miles < milesCanGo) {
            System.out.println("You reached your destination safely and with " + this.fuelLevel + " gallons left over.");
        }

    }



    public void setFuelEco(int milesPerGal) {
        if(milesPerGal > 0) {
            this.fuleEco = milesPerGal;
        }
    }

    public boolean isManual() {
        return this.manual;
    }

    public Car setManual(boolean manual) {
        this.manual = manual;
        return this;
    }

    public int getTires() {
        return this.tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFuelLevel() {
        return this.fuelLevel;
    }

    public int getMilesDriven() {
        return this.milesDriven;
    }

}
