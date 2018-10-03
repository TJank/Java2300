package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean manual;
        String color;
        String make;
        String model;
        int year;
        int fuelEco;

        System.out.println("Is your car manual?");
        manual = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("What color is your car?");
        color = scanner.next();
        scanner.nextLine();
        System.out.println("What is the make of your car?");
        make = scanner.next();
        scanner.nextLine();
        System.out.println("What is the model of your car?");
        model = scanner.nextLine();
        scanner.nextLine();
        System.out.println("What is the year of your car?");
        year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is the fuel economy of your car?");
        fuelEco = scanner.nextInt();
        scanner.nextLine();

        Car yourCar = new Car(manual, color, make, model, year, fuelEco);
        System.out.println("The user created car has the specs of : \n" + "Make: " + yourCar.getMake() + "\n"
                + "Model: " + yourCar.getModel() + "\n" + "Year: " + yourCar.getYear());

	    Car scionxA = new Car("Scion", "xA", 2001);
	    scionxA.setColor("black");
	    scionxA.setManual(true);
	    scionxA.setFuelEco(30);
	    scionxA.addFuel(10);
	    scionxA.driveCar(50);

        System.out.println("Your car is a " + scionxA.getMake() + " " + scionxA.getModel() + " year "
                + scionxA.getYear() + " with " + scionxA.getColor() + " color and it has " + scionxA.getMilesDriven()
                +" miles driven.");

    }
}
